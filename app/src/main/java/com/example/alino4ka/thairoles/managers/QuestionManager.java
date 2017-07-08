package com.example.alino4ka.thairoles.managers;

import android.content.Intent;
import android.util.Log;

import com.example.alino4ka.thairoles.entities.Question;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

import static android.content.ContentValues.TAG;

public class QuestionManager {
    private Realm realm;
    public static final String ID = "id";

    public QuestionManager(Realm realm) {
        this.realm = realm;
        if (getQuestionsFromRealm().size() == 0) {
            Log.i(TAG, "QuestionManager: before" + getQuestionsFromRealm().size());
            addToRealmArray();
            Log.i(TAG, "QuestionManager: after" + getQuestionsFromRealm().size());
        }
    }

    public List<String> getGroups() {
        List<String> groups = new ArrayList<>();
        int count = 6;
        int groupIndex;
        for (int i = 0; i < count; i++) {
            groupIndex = i + 1;
            groups.add("Билет № " + groupIndex);
        }
        return groups;
    }

    public List<Question> getQuestionsFromRealm() {
        return realm.where(Question.class).findAll();
    }

    public Question getQuestionById(int id){
        return realm.where(Question.class).equalTo(ID, id).findFirst();
    }

    private void addToRealmArray() {
        realm.executeTransactionAsync(realm1 -> realm1.insertOrUpdate(questionList()),
                () -> {
                    Log.i(TAG, "addToRealmArray: success");
                }, error -> {
                    Log.i(TAG, "addToRealmArray: " + error);
                });
    }


    private List<Question> questionList() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question(0, "Where is it prohibited to make a U-turn?", "Где запрещено делать разворот?"));
        questions.add(new Question(1, "The driver of the vehicle in the picture", "Водитель транспортного средства на картинке:"));
        questions.add(new Question(2, "Where is it permitted to make U-turn", "Где разрешено делать разворот?"));
        questions.add(new Question(3, "It is prohibited to:", "Запрещено:"));
        questions.add(new Question(4, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(5, "Where is it prohibited to make a U-turn?", "Где запрещено делать разворот,"));
        questions.add(new Question(6, "You must not park:", "Вы не должны парковаться:"));
        questions.add(new Question(7, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(8, "Where is it prohibited to pass?", "Где запрещено пропускать?"));
        questions.add(new Question(9, "Which of the following statements is true", "Какое из следующих утверждений верно?"));
        questions.add(new Question(10, "Which of the pictures below illustrates proper parking?", "На каких картинках показана првильная парковка?"));
        questions.add(new Question(11, "Which of the pictures below illustrates proper parking", "На каких картинках показана првильная парковка"));
        questions.add(new Question(12, "This sign means:", "Этот знак означает"));
        questions.add(new Question(13, "You are required to turn on your headlights:", "Вы обязаны включить фары"));
        questions.add(new Question(14, "As a driver, you must not:", "Как водитель вы не должны:"));
        questions.add(new Question(15, "When you see this sign,you should:", "Когда вы видете данный знак, вы должны:"));
        questions.add(new Question(16, "When you see a flashing red light, you should:", "Когда вы видите мигающий красный свет, вы должны:"));
        questions.add(new Question(17, "Which of the pictures below illustrates proper parking?", "")); //picture
        questions.add(new Question(18, "When you see a flashing red light, you should:", "Когда вы видите мигающий красный свет, вы должны:"));
        questions.add(new Question(19, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(20, "In the situation pictured below, you should:", "В ситуации, изображенной на картинке, вы должны:"));
        questions.add(new Question(21, "Which of the pictures bellow illustrates proper parking?", "На каких картинках показана првильная парковка")); //picture
        questions.add(new Question(22, "This signs means:", "Этот знак означает:"));
        questions.add(new Question(23, "The dividing lines in the middle of the road pictured on the left indicate", "Разделительные линии посреди дороги на картинке слева указывают"));
        questions.add(new Question(24, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(25, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(26, "This sign on the road surface indicates:", "Этот знак на дорожном покрытии означает:"));
        questions.add(new Question(27, "Which of the following vehicles is it prohibited to use on a public road?", "Какое из перечисленных транспортных средств нельзя использовать на дороге общего пользования?"));
        questions.add(new Question(28, "In the picture, the driver a Car A should:", "На картинке водитель Машины А должен:"));
        questions.add(new Question(29, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(30, "Which of the following statements is true?", "Какое из следующих утверждений верно?"));
        questions.add(new Question(31, "You may not park your car", "Вы не должны парковать вашу машину"));
        questions.add(new Question(32, "Which of the pictures below illustrates proper parking", "На каких картинках показана првильная парковка")); //picture
        questions.add(new Question(33, "When descending a steep grade or hill,you should", "При спуске по крутому склону или холму,Вам необходимо"));
        questions.add(new Question(34, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(35, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(36, "Which type of vehicle is prohibited to drive on a public roadway", "На каком типе транспортного средства запрещается ездить на общественной проезжей части"));
        questions.add(new Question(37, "When you see a sign reading Left Turn on Red, you should:", "Когда вы видите знак с надписью левый поворот на красный, Вам необходимо:"));
        questions.add(new Question(38, "How far back from the vehicle in front of your should you driver", "Какая дистанция должна быть между вашей машиной и впереди едущей?"));
        questions.add(new Question(39, "In the situation pictured below, you should:", "В ситуации проиллюстрированной ниже, Вы должгы"));
        questions.add(new Question(40, "Which of the picture below shows proper stopping?", "Какой рисунок ниже показывает правильную остановку"));
        questions.add(new Question(41, "Which of the pictures below illustrates proper parking?", "Какой рисунок ниже показывает правильную парковка?")); //picture
        questions.add(new Question(42, "As a driver, you must not", "Как водитель, Вы не должны"));
        questions.add(new Question(43, "A driver in Car A should:", "Водитель в машине должен:"));
        questions.add(new Question(44, "The sign on the road surface indicates", "Надпись на дорожном покрытии означает"));
        questions.add(new Question(45, "The driver of the vehicle in the picture", "Водитель транспортного средства на картинке"));
        questions.add(new Question(46, "When is it prohibited for a motorist to drive?", "Когда мотористу запрещена езда?"));
        questions.add(new Question(47, "When you see this sign, you should:", "Когда видите этот знак, вы должны"));
        questions.add(new Question(48, "When you see the sign, you should", "Когда видите этот знак, вы должны"));
        questions.add(new Question(49, "Which of the following is NOT permitted", "Что из перечисленного не допускается"));
        questions.add(new Question(50, "Which of these statements is true about passing?", "Какое из этих утверждений верно о пропуске?"));
        questions.add(new Question(51, "Which of the picture below illustrates proper parking?", "Какие на рисунке изображена правильная парковка?"));// picture
        questions.add(new Question(52, "In the picture, the driver must", "На картинке, водитель должен"));
        questions.add(new Question(53, "If your experience a breakdown, you should:", "Есои произошла поломка, Вы должны"));
        questions.add(new Question(54, "When you see a flashing red light, you should:", "Когда вы видите мигающий красный свет, вы должны:"));
        questions.add(new Question(55, "This sign means:", "Этот знак означает:"));
        questions.add(new Question(56, "In which of the folloving circumstances is it forbidden to pass?", "В какой мз следующих обстоятельствах запрещеное пропускать?"));
        questions.add(new Question(57, "Which type of vehicle is it prohibited to use on a public road?", "На каком типе транспортного средства запрещается ездить на общественной проезжей части?"));
        questions.add(new Question(58, "When is it prohibited to pass", "Где запрещено пропускать?"));
        questions.add(new Question(59, "The driver intending to make a right turn in the picture on the left should:", "Водитель, намереваясь повернуть направо на картинке слева, должен:"));
        return questions;
    }

}
