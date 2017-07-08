package com.example.alino4ka.thairoles.entities;
import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Answer extends RealmObject{
    @PrimaryKey
    private int id;
    private String englishBody;
    private String russianBody;
    private int questionId;
    private boolean isCorrect;
    private boolean isInResult;

    public boolean isInResult() {
        return isInResult;
    }

    public void setInResult(boolean inResult) {
        isInResult = inResult;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getEnglishBody() {
        return englishBody;
    }


    public String getRussianBody() {
        return russianBody;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Answer() {
    }

    public void setEnglishBody(String englishBody) {
        this.englishBody = englishBody;
    }

    public void setRussianBody(String russianBody) {
        this.russianBody = russianBody;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", englishBody='" + englishBody + '\'' +
                ", russianBody='" + russianBody + '\'' +
                ", questionId=" + questionId +
                ", isCorrect=" + isCorrect +
                ", isResult=" + isInResult +
                '}';
    }

    public Answer(int questionId, String body, String russianBody){
        this.questionId = questionId;
        this.englishBody = body;
        this.russianBody= russianBody;
    }

    public Answer(int questionId, String body, String russianBody, boolean isCorrect){
        this.questionId = questionId;
        this.englishBody = body;
        this.russianBody= russianBody;
        this.isCorrect = isCorrect;
    }
}

