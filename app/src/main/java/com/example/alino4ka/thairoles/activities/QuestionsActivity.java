package com.example.alino4ka.thairoles.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.alino4ka.thairoles.R;
import com.example.alino4ka.thairoles.fragments.QuestionFragment;
import com.example.alino4ka.thairoles.managers.AnswerManager;

public class QuestionsActivity extends BaseRealmActivity{
    private static final String TAG = "QuestionsActivity";
    public static final int NUM_PAGES = 10;
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    int groupId;
    QuestionFragment questionFragment;
    private AnswerManager answerManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_activity);
        answerManager = new AnswerManager(realm);
        answerManager.setResultFalse();
        pager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        groupId = getIntent().getIntExtra(StartActivity.GROUP_ID, 0);
        setTitleToolbar(0);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                setTitleToolbar(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void setTitleToolbar(int position) {
        if(getSupportActionBar()!=null) {
            int curPos = position+1;
            getSupportActionBar().setTitle("Вопрос №" + curPos);
        }
    }


    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            questionFragment = new QuestionFragment();
            questionFragment.setRealm(realm, groupId+position, pager);
            return questionFragment;
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
