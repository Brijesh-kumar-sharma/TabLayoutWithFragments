package com.example.viewpagefragmenttablabyout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TextView chat,call,status;
    private PagerViewAdapter pagerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chat=findViewById(R.id.chat);
        status=findViewById(R.id.status);
        call=findViewById(R.id.call);
        viewPager=findViewById(R.id.FragmentContainer);

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });

       status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                onChangeTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }

    private void onChangeTab(int position) {

        if(position==0)
        {
            chat.setTextSize(25);
            status.setTextSize(15);
            call.setTextSize(15);
        }
        if(position==1)
        {
            chat.setTextSize(15);
            status.setTextSize(25);
           call.setTextSize(15);
        }
        if(position==2)
        {
            chat.setTextSize(15);
            status.setTextSize(15);
            call.setTextSize(25);
        }



    }


}