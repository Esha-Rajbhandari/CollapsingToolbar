package com.example.esha.quizon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
    private Animation animBounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    public void playGame(View view){
        Intent intent = new Intent(this, PlayActivity.class);
        startActivity(intent);
    }

    private void initView(){
        ImageView quizOnText = findViewById(R.id.quiz_on);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        animBounce.setAnimationListener(this);
        quizOnText.setVisibility(View.VISIBLE);
        quizOnText.startAnimation(animBounce);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
