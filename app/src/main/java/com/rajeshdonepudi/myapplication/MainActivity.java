package com.rajeshdonepudi.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView user_label;
    TextView user_notifications;
    TextView profile_label;
    PagerViewAdapter pagerViewAdapter;

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_label = findViewById(R.id.users_label);
        user_notifications = findViewById(R.id.notification_label);
        profile_label = findViewById(R.id.profile_label);

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewpager);

        user_label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        user_notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        profile_label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });


        viewPager.setAdapter(pagerViewAdapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                changeTabs(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void changeTabs(int position) {
        if (position == 0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                user_label.setTextColor(getColor(R.color.tabtextcolor));
                user_label.setTextSize(22);
                user_label.setBackgroundResource(R.drawable.tabtextshape);


                user_notifications.setTextColor(getColor(R.color.tabtextcolor));
                user_notifications.setTextSize(16);

                profile_label.setTextColor(getColor(R.color.tabtextcolor));
                profile_label.setTextSize(16);


            }


        }

        if (position == 1) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                user_label.setTextColor(getColor(R.color.tabtextcolor));
                user_label.setTextSize(16);

                profile_label.setTextColor(getColor(R.color.tabtextcolor));
                profile_label.setTextSize(16);

                user_notifications.setTextColor(getColor(R.color.tabtextcolor));
                user_notifications.setTextSize(22);
                user_notifications.setTypeface(user_notifications.getTypeface(), Typeface.BOLD);
                user_notifications.setBackgroundResource(R.drawable.tabtextshape);

            }


        }

        if (position == 2) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                user_label.setTextColor(getColor(R.color.tabtextcolor));
                user_label.setTextSize(16);

                profile_label.setTextColor(getColor(R.color.tabtextcolor));
                profile_label.setTextSize(22);
                profile_label.setTypeface(user_notifications.getTypeface(), Typeface.BOLD);
                profile_label.setBackgroundResource(R.drawable.tabtextshape);


                user_notifications.setTextColor(getColor(R.color.tabtextcolor));
                user_notifications.setTextSize(16);
            }


        }

    }

}
