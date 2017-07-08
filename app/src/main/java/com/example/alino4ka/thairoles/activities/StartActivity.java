package com.example.alino4ka.thairoles.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.alino4ka.thairoles.R;
import com.example.alino4ka.thairoles.adapters.GroupAdapter;
import com.example.alino4ka.thairoles.interfaces.OnItemClickListener;
import com.example.alino4ka.thairoles.managers.QuestionManager;

import io.realm.Realm;

public class StartActivity extends BaseRealmActivity implements OnItemClickListener{
    QuestionManager questionManager;
    RecyclerView groupsList;
    GroupAdapter adapter;
    public static final String TAG = "StartActivity";
    public static final String GROUP_ID = "groupId";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        questionManager = new QuestionManager(realm);
        groupsList = (RecyclerView) findViewById(R.id.groups);
        groupsList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new GroupAdapter(questionManager.getGroups(), this);
        groupsList.setAdapter(adapter);
        initToolbar();
    }

    private void initToolbar() {
        if(getSupportActionBar()!=null)
        getSupportActionBar().setTitle("Тайские права");
    }

    @Override
    public void onClick(View v, int position) {
        Intent intent = new Intent(this, QuestionsActivity.class);
        intent.putExtra(GROUP_ID, position*10);
        startActivity(intent);
    }
}
