package com.mostafaabdel_fatah.settingbtnantimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean open = true;
    Animation enter_view,exit_view,rotate;
    Button listbtn,smsbtn,refreshbtn,heartbtn,callbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listbtn    = (Button) findViewById(R.id.list);
        smsbtn     = (Button) findViewById(R.id.search);
        heartbtn   = (Button) findViewById(R.id.heart);
        callbtn    = (Button) findViewById(R.id.call);
        refreshbtn = (Button) findViewById(R.id.refresh);

        enter_view = AnimationUtils.loadAnimation(this,R.anim.enter_view);
        exit_view  = AnimationUtils.loadAnimation(this,R.anim.exit_view);
        rotate     = AnimationUtils.loadAnimation(this,R.anim.rotate);

    }

    public void settingbtn_Clicked(View view) {
        if (open) {
            open = false;
            listbtn.startAnimation(rotate);
            smsbtn.startAnimation(enter_view);
            heartbtn.startAnimation(enter_view);
            callbtn.startAnimation(enter_view);
            refreshbtn.startAnimation(enter_view);

            smsbtn.setVisibility(View.VISIBLE);
            heartbtn.setVisibility(View.VISIBLE);
            callbtn.setVisibility(View.VISIBLE);
            refreshbtn.setVisibility(View.VISIBLE);
        }else {
            open = true;
            listbtn.startAnimation(rotate);
            smsbtn.startAnimation(exit_view);
            heartbtn.startAnimation(exit_view);
            callbtn.startAnimation(exit_view);
            refreshbtn.startAnimation(exit_view);

            smsbtn.setVisibility(View.INVISIBLE);
            heartbtn.setVisibility(View.INVISIBLE);
            callbtn.setVisibility(View.INVISIBLE);
            refreshbtn.setVisibility(View.INVISIBLE);
        }
    }

    public void searchbtn_Clicked(View view) {
        Toast.makeText(this,"Search Button Clicked",Toast.LENGTH_SHORT).show();
    }

    public void heartbtn_Clicked(View view) {
        Toast.makeText(this,"Heart Button Clicked",Toast.LENGTH_SHORT).show();
    }
    public void callbtn_Clicked(View view) {
        Toast.makeText(this,"Call Button Clicked",Toast.LENGTH_SHORT).show();
    }
    public void refreshbtn_Clicked(View view) {
        Toast.makeText(this,"Refresh Button Clicked",Toast.LENGTH_SHORT).show();
    }
}
