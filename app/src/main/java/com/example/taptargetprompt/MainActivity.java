package com.example.taptargetprompt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;

public class MainActivity extends AppCompatActivity {

    Button secondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        secondActivity = findViewById(R.id.secondActivity);

        TapTargetView.showFor(this,
                TapTarget.forView(secondActivity,"This is A Button","You will be redirected to sescond activity")
                .outerCircleColor(R.color.teal_200)
        .outerCircleAlpha(0.96f)
        .targetCircleColor(R.color.white)
        .titleTextSize(20)
        .titleTextColor(R.color.white)
        .descriptionTextSize(10)
        .descriptionTextColor(R.color.black)
        .textColor(R.color.black)
        .textTypeface(Typeface.SANS_SERIF)
        .dimColor(R.color.black)
        .drawShadow(true)
        .cancelable(false)
        .tintTarget(true)
        .transparentTarget(true)
        .targetRadius(60),
                new TapTargetView.Listener(){

                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        Intent i = new Intent(MainActivity.this, com.example.taptargetprompt.secondActivity.class);
                        startActivity(i);
                        finish();
                    }
                });

    }
}