package com.example.sample.animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.example.sample.R;

public class MenuAnimationActivity extends Activity {


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载MainView
        setContentView(R.layout.activity_menuanimation);

    }

    public void onBack(View view){
        finish();
    }
}