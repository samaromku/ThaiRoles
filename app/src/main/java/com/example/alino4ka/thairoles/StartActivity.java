package com.example.alino4ka.thairoles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity{
    QuestionManager questionManager = QuestionManager.INSTANCE;
    RecyclerView groupsList;
    GroupAdapter adapter;
    private OnItemClickListener clickListener = new OnItemClickListener() {
        @Override
        public void onClick(View v, int position) {
            Log.i("", "onClick: 1");
            Toast.makeText(StartActivity.this, "вы нажали на номер " + questionManager.getQuestions().get(position), Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        groupsList = (RecyclerView) findViewById(R.id.groups);
        groupsList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GroupAdapter(questionManager.getGroups(), clickListener);
        groupsList.setAdapter(adapter);
    }
}
