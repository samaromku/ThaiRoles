package com.example.alino4ka.thairoles.entities;


import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Question extends RealmObject{
    @PrimaryKey
    private int id;
    private String bodyEnglish;
    private String bodyRussian;
    private RealmList<Answer> answers;

    public Question(){
        answers = new RealmList<>();
    }


    public List<Answer> getAnswers() {
        return answers;
    }

    public int getId() {
        return id;
    }

    public String getBodyEnglish() {
        return bodyEnglish;
    }

    public String getBodyRussian() {
        return bodyRussian;
    }

    public Question(int id, String bodyEnglish, String bodyRussian){
        this.id = id;
        this.bodyEnglish = bodyEnglish;
        this.bodyRussian = bodyRussian;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", bodyEnglish='" + bodyEnglish + '\'' +
                ", bodyRussian='" + bodyRussian + '\'' +
                ", answers=" + answers +
                '}';
    }
}
