package com.example.alino4ka.thairoles;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class QuestionAdapter extends RecyclerView.Adapter<QuestionAdapter.QuestionHolder> {
    private List<Question> questions;
    private OnItemClickListener clickListener;

    public QuestionAdapter(List<Question>questions, OnItemClickListener clickListener){
        this.questions = questions;
        this.clickListener = clickListener;
    }

    @Override
    public QuestionHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new QuestionHolder(view);
    }

    @Override
    public void onBindViewHolder(QuestionHolder holder, int position) {
        Question question = questions.get(position);
        holder.title.setText(question.getBodyEnglish());
    }


    @Override
    public int getItemCount() {
        return questions.size();
    }

    public class QuestionHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;

        public QuestionHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView;
        }


        @Override
        public void onClick(View v) {
            clickListener.onClick(v, getAdapterPosition());
        }
    }
}
