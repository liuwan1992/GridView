package com.liuwan.gridview.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.liuwan.gridview.Fragment.AlarmFragment;
import com.liuwan.gridview.Fragment.HomePageFragment;
import com.liuwan.gridview.Fragment.MeFragment;
import com.liuwan.gridview.Fragment.QueryAnalysisFragment;
import com.liuwan.gridview.R;

/**
 * Created by liuwan on 2016/9/24.
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private LinearLayout homePage, queryAnalysis, alarm, me;
    private ImageView iconHomePage, iconQueryAnalysis, iconAlarm, iconMe;
    private TextView txHomePage, txQueryAnalysis, txAlarm, txMe;
    private Fragment homePageFragment, queryAnalysisFragment, alarmFragment, meFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homePage = (LinearLayout) findViewById(R.id.homePage);
        homePage.setOnClickListener(this);
        alarm = (LinearLayout) findViewById(R.id.alarm);
        alarm.setOnClickListener(this);
        queryAnalysis = (LinearLayout) findViewById(R.id.queryAnalysis);
        queryAnalysis.setOnClickListener(this);
        me = (LinearLayout) findViewById(R.id.me);
        me.setOnClickListener(this);
        iconHomePage = (ImageView) findViewById(R.id.iconHomePage);
        iconAlarm = (ImageView) findViewById(R.id.iconAlarm);
        iconQueryAnalysis = (ImageView) findViewById(R.id.iconQueryAnalysis);
        iconMe = (ImageView) findViewById(R.id.iconMe);
        txHomePage = (TextView) findViewById(R.id.txHomePage);
        txAlarm = (TextView) findViewById(R.id.txAlarm);
        txQueryAnalysis = (TextView) findViewById(R.id.txQueryAnalysis);
        txMe = (TextView) findViewById(R.id.txMe);

        // 初始化fragment布局
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (homePageFragment == null) {
            homePageFragment = new HomePageFragment();
        }
        if (!homePageFragment.isAdded()) {
            transaction.remove(homePageFragment);
            transaction.replace(R.id.fragment_main, homePageFragment).commit();
        }
        iconHomePage.setImageResource(R.drawable.homepage_checked);
        iconQueryAnalysis.setImageResource(R.drawable.queryanalysis_unchecked);
        iconAlarm.setImageResource(R.drawable.alarm_unchecked);
        iconMe.setImageResource(R.drawable.me_unchecked);
        txHomePage.setTextColor(ContextCompat.getColor(this, R.color.color15));
        txQueryAnalysis.setTextColor(ContextCompat.getColor(this, R.color.color1));
        txAlarm.setTextColor(ContextCompat.getColor(this, R.color.color1));
        txMe.setTextColor(ContextCompat.getColor(this, R.color.color1));

    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.homePage:
                if (homePageFragment == null) {
                    homePageFragment = new HomePageFragment();
                }
                if (!homePageFragment.isAdded()) {
                    transaction.remove(homePageFragment);
                    transaction.replace(R.id.fragment_main, homePageFragment).commit();
                }
                iconHomePage.setImageResource(R.drawable.homepage_checked);
                iconQueryAnalysis.setImageResource(R.drawable.queryanalysis_unchecked);
                iconAlarm.setImageResource(R.drawable.alarm_unchecked);
                iconMe.setImageResource(R.drawable.me_unchecked);
                txHomePage.setTextColor(ContextCompat.getColor(this, R.color.color15));
                txQueryAnalysis.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txAlarm.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txMe.setTextColor(ContextCompat.getColor(this, R.color.color1));
                break;

            case R.id.queryAnalysis:
                if (queryAnalysisFragment == null) {
                    queryAnalysisFragment = new QueryAnalysisFragment();
                }
                if (!queryAnalysisFragment.isAdded()) {
                    transaction.remove(queryAnalysisFragment);
                    transaction.replace(R.id.fragment_main, queryAnalysisFragment).commit();
                }
                iconHomePage.setImageResource(R.drawable.homepage_unchecked);
                iconQueryAnalysis.setImageResource(R.drawable.queryanalysis_checked);
                iconAlarm.setImageResource(R.drawable.alarm_unchecked);
                iconMe.setImageResource(R.drawable.me_unchecked);
                txHomePage.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txQueryAnalysis.setTextColor(ContextCompat.getColor(this, R.color.color15));
                txAlarm.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txMe.setTextColor(ContextCompat.getColor(this, R.color.color1));
                break;

            case R.id.alarm:
                if (alarmFragment == null) {
                    alarmFragment = new AlarmFragment();
                }
                if (!alarmFragment.isAdded()) {
                    transaction.remove(alarmFragment);
                    transaction.replace(R.id.fragment_main, alarmFragment).commit();
                }
                iconHomePage.setImageResource(R.drawable.homepage_unchecked);
                iconQueryAnalysis.setImageResource(R.drawable.queryanalysis_unchecked);
                iconAlarm.setImageResource(R.drawable.alarm_checked);
                iconMe.setImageResource(R.drawable.me_unchecked);
                txHomePage.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txQueryAnalysis.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txAlarm.setTextColor(ContextCompat.getColor(this, R.color.color15));
                txMe.setTextColor(ContextCompat.getColor(this, R.color.color1));
                break;

            case R.id.me:
                if (meFragment == null) {
                    meFragment = new MeFragment();
                }
                if (!meFragment.isAdded()) {
                    transaction.remove(meFragment);
                    transaction.replace(R.id.fragment_main, meFragment).commit();
                }
                iconHomePage.setImageResource(R.drawable.homepage_unchecked);
                iconQueryAnalysis.setImageResource(R.drawable.queryanalysis_unchecked);
                iconAlarm.setImageResource(R.drawable.alarm_unchecked);
                iconMe.setImageResource(R.drawable.me_checked);
                txHomePage.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txQueryAnalysis.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txAlarm.setTextColor(ContextCompat.getColor(this, R.color.color1));
                txMe.setTextColor(ContextCompat.getColor(this, R.color.color15));
                break;
        }
    }

    /**
     * 监听Back键
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addCategory(Intent.CATEGORY_HOME);
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
