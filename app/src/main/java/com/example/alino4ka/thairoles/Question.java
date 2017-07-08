package com.example.alino4ka.thairoles;


import java.util.ArrayList;
import java.util.List;

public class Question {
    private List<Answer> answers = new ArrayList<>();
    private int id;
    private String bodyEnglish;
    private String bodyRussian;
    private List<Question> questions = new ArrayList<>();

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

    Answer answer = new Answer();

    public Question(){}

    public Question(int id, String bodyEnglish, String bodyRussian){
        this.id = id;
        this.bodyEnglish = bodyEnglish;
        this.bodyRussian = bodyRussian;
    }
}
