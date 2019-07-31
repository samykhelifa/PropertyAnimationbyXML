package com.example.propertyanimationbyxml;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

    private ImageView mImage;
    private RelativeLayout relativeLayout;

    int ctr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImage = findViewById(R.id.image);
        relativeLayout = findViewById(R.id.rlayout);

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator anim;
                if (ctr % 2 == 0) {
                    anim = ObjectAnimator.ofObject(relativeLayout,
                            "backgroundColor", new ArgbEvaluator(), Color.GREEN, Color.RED);
                }else {
                    anim = ObjectAnimator.ofObject(relativeLayout,
                            "backgroundColor", new ArgbEvaluator(), Color.RED, Color.GREEN);
                }
                anim.setDuration(2000);
                anim.start();
                ctr++;

            }
        });

    }

    public void rotateAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.rotate);
        anim.setTarget(mImage);
        anim.start();

    }

    public void scaleAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.scale);
        anim.setTarget(mImage);
        anim.start();

    }

    public void translateAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.translate);
        anim.setTarget(mImage);
        anim.start();

    }

    public void alphaAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.alpha);
        anim.setTarget(mImage);
        anim.start();

    }

    public void setAnimation(View view) {

        Animator anim = AnimatorInflater
                .loadAnimator(this, R.animator.set);
        anim.setTarget(mImage);
        anim.start();

    }


}
