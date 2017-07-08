package com.example.alino4ka.thairoles.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alino4ka.thairoles.R;
import com.example.alino4ka.thairoles.entities.Answer;
import com.example.alino4ka.thairoles.entities.Question;
import com.example.alino4ka.thairoles.interfaces.OnItemClickListener;

import java.util.List;

import io.realm.Realm;

/**
 * Created by andrey on 08.07.2017.
 */

public class ResultAdapter extends RecyclerView.Adapter<ResultAdapter.ResultHolder> {
    OnItemClickListener clickListener;
    private List<Answer>answers;
    private List<Question>questions;

    public ResultAdapter(List<Answer> answers, OnItemClickListener clickListener, List<Question>questions) {
        this.clickListener = clickListener;
        this.answers = answers;
        this.questions = questions;
    }

    @Override
    public ResultHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_result, parent, false);
        return new ResultHolder(view);
    }

    @Override
    public void onBindViewHolder(ResultHolder holder, int position) {
        holder.bind(answers.get(position));
    }

    @Override
    public int getItemCount() {
        return answers.size();
    }

    class ResultHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView questionText;
        TextView answerText;
        CardView resultItem;

        ResultHolder(View itemView) {
            super(itemView);
            questionText = (TextView) itemView.findViewById(R.id.tvQuestionText);
            answerText = (TextView) itemView.findViewById(R.id.tvAnswerText);
            resultItem = (CardView) itemView.findViewById(R.id.cvResultItem);
            itemView.setOnClickListener(this);
        }

        void bind(Answer answer) {
            if(answer.isCorrect()){
                resultItem.setBackgroundResource(R.color.mygreen);
            }else {
                resultItem.setBackgroundResource(R.color.myred);
            }

            for(Question question:questions){
                if(question.getId()==answer.getQuestionId()){
                    questionText.setText("Вопрос: " +question.getBodyRussian());
                }
            }
            answerText.setText("Ваш ответ: " + answer.getRussianBody());
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getAdapterPosition());
        }
    }
}
