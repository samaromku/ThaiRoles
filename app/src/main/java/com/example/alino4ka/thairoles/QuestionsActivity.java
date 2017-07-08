package com.example.alino4ka.thairoles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {
    QuestionAdapter adapter;
    RecyclerView questionList;
    QuestionManager questionManager = QuestionManager.INSTANCE;
    private OnItemClickListener clickListener = new OnItemClickListener() {
        @Override
        public void onClick(View v, int position) {
            Toast.makeText(QuestionsActivity.this, "вы нажали на номер " + questionManager.getQuestions().get(position), Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_activity);
        questionList = (RecyclerView) findViewById(R.id.question_list);
        questionList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new QuestionAdapter(questionManager.getQuestions(), clickListener);
        questionList.setAdapter(adapter);
    }
}
