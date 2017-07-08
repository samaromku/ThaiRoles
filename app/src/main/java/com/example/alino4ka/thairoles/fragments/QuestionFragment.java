package com.example.alino4ka.thairoles.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alino4ka.thairoles.R;
import com.example.alino4ka.thairoles.activities.QuestionsActivity;
import com.example.alino4ka.thairoles.activities.ResultActivity;
import com.example.alino4ka.thairoles.entities.Answer;
import com.example.alino4ka.thairoles.entities.Question;
import com.example.alino4ka.thairoles.managers.AnswerManager;
import com.example.alino4ka.thairoles.managers.QuestionManager;

import java.util.List;

import io.realm.Realm;

import static android.content.ContentValues.TAG;

/**
 * Created by andrey on 08.07.2017.
 */

public class QuestionFragment extends Fragment {
    public static final String QUESTION_ID = "questionId";
    public static final String COUNTER = "counter";
    private QuestionManager questionManager;
    private AnswerManager answerManager;
    private Question question;
    private List<Answer> answers;
    private int questionId;
    private Realm realm;
    private ViewPager pager;
    RadioGroup rgAnswers;
    RadioButton rbFirstAnswer;
    RadioButton rbSecondAnswer;
    RadioButton rbThirdAnswer;
    RadioButton rbFourthAnswer;
    TextView tvQuestionText;
    SwitchCompat changeLang;

    public void setRealm(Realm realm, int questionId, ViewPager pager) {
        Log.i(TAG, "setRealm: questionId " + questionId);
        this.realm = realm;
        this.questionId = questionId;
        this.pager = pager;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_question, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        realm.close();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        realm = Realm.getDefaultInstance();
        init(view);
    }

    private void init(View view) {
        questionManager = new QuestionManager(realm);
        answerManager = new AnswerManager(realm);
        answers = answerManager.getAnswersBuQuestionId(questionId);
        question = questionManager.getQuestionById(questionId);

        rbFirstAnswer = (RadioButton) view.findViewById(R.id.firstAnswer);
        rbSecondAnswer = (RadioButton) view.findViewById(R.id.secondAnswer);
        rbThirdAnswer = (RadioButton) view.findViewById(R.id.thirdAnswer);
        rbFourthAnswer = (RadioButton) view.findViewById(R.id.fourthAnswer);
        tvQuestionText = (TextView) view.findViewById(R.id.question_text);
        changeLang = (SwitchCompat) view.findViewById(R.id.scChangeLang);
        rgAnswers = (RadioGroup) view.findViewById(R.id.rgAnswerVariants);

        changeLanguage(false, view);

        initBtns(view);
    }

    private void initBtns(View view) {
        Button btnForward = (Button) view.findViewById(R.id.btnForward);
        Button btnBeck = (Button) view.findViewById(R.id.btnPrevious);
        Button btnMAkeAnswer = (Button) view.findViewById(R.id.btnMakeAnswer);
        btnForward.setOnClickListener(v -> {
            pager.setCurrentItem(pager.getCurrentItem()+1);
        });
        btnBeck.setOnClickListener(v -> {
            pager.setCurrentItem(pager.getCurrentItem()-1);
        });

        changeLang.setOnCheckedChangeListener((buttonView, isChecked) -> {
            changeLanguage(isChecked, view);
        });

        btnMAkeAnswer.setOnClickListener(v -> {
            int index = rgAnswers.indexOfChild(view.findViewById(rgAnswers.getCheckedRadioButtonId()));
            Log.i(TAG, "initBtns: " + index);
            if(checkSizeAnswers() && index!=-1) {
                Answer answer = answers.get(index);
                realm.executeTransaction(realm1 -> {
                    answer.setInResult(true);
                });
                Log.i(TAG, "initBtns: " + answer);
                if(pager.getCurrentItem()==QuestionsActivity.NUM_PAGES-1){
                    startActivity(new Intent(getActivity(), ResultActivity.class));
                }else{
                    pager.setCurrentItem(pager.getCurrentItem()+1);
                }
            }else {
                Toast.makeText(getActivity(), "Ты ничего не выбрал, тварь!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean checkSizeAnswers(){
        return answers.size() > 3;
    }

    private void changeLanguage(boolean isRussian, View view){
        if(isRussian){
            if(checkSizeAnswers()) {
                rbFirstAnswer.setText(answers.get(0).getRussianBody());
                rbSecondAnswer.setText(answers.get(1).getRussianBody());
                rbThirdAnswer.setText(answers.get(2).getRussianBody());
                rbFourthAnswer.setText(answers.get(3).getRussianBody());
                tvQuestionText.setText(question.getBodyRussian());
                changeLang.setText("Русский");
            }else{
                Snackbar.make(view.findViewById(R.id.llQuestion), "Список пуст, перезайди", Snackbar.LENGTH_SHORT);
            }
        }
        else {
            if(checkSizeAnswers()) {
                rbFirstAnswer.setText(answers.get(0).getEnglishBody());
                rbSecondAnswer.setText(answers.get(1).getEnglishBody());
                rbThirdAnswer.setText(answers.get(2).getEnglishBody());
                rbFourthAnswer.setText(answers.get(3).getEnglishBody());
                tvQuestionText.setText(question.getBodyEnglish());
                changeLang.setText("Английский");
            }else{
                Snackbar.make(view.findViewById(R.id.llQuestion), "Список пуст, перезайди", Snackbar.LENGTH_SHORT);
            }
        }
    }
}
