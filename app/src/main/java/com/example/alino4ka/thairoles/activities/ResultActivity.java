package com.example.alino4ka.thairoles.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.alino4ka.thairoles.R;
import com.example.alino4ka.thairoles.adapters.ResultAdapter;
import com.example.alino4ka.thairoles.entities.Answer;
import com.example.alino4ka.thairoles.entities.Question;
import com.example.alino4ka.thairoles.interfaces.OnItemClickListener;
import com.example.alino4ka.thairoles.managers.AnswerManager;
import com.example.alino4ka.thairoles.managers.QuestionManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrey on 08.07.2017.
 */

public class ResultActivity extends BaseRealmActivity implements OnItemClickListener {
    AnswerManager answerManager;
    QuestionManager questionManager;
    public static final String TAG = "ResultActivity";
    List<Answer>answersResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        answerManager = new AnswerManager(realm);
        questionManager = new QuestionManager(realm);
        RecyclerView rvResult = (RecyclerView) findViewById(R.id.rvResult);
        answersResult = answerManager.getAnswersWithResultFlag();
        initToolbarWithRightCount();
        ResultAdapter adapter = new ResultAdapter(answersResult, this, questions());
        rvResult.setLayoutManager(new LinearLayoutManager(this));
        rvResult.setAdapter(adapter);
    }

    private void initToolbarWithRightCount() {
        int right = 0;
        for(Answer answer:answersResult){
            if(answer.isCorrect()){
                right++;
            }
        }
        if(getSupportActionBar()!=null) {
            getSupportActionBar().setTitle("Правильно " + right + " из 10");
        }
    }

    private List<Question>questions(){
        List<Question>questionList = new ArrayList<>();
        for(Answer a:answersResult){
            questionList.add(questionManager.getQuestionById(a.getQuestionId()));
        }
        return questionList;
    }

    @Override
    public void onClick(View v, int position) {
        Answer answer = answersResult.get(position);
        Answer correctAnswer = answerManager.getCorrectAnswerByQuestionId(answer.getQuestionId());
        if(answer.isCorrect()){
            Toast.makeText(this, "Вы ответили правильно", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Правильный ответ: " + correctAnswer.getRussianBody(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, StartActivity.class));
    }
}
