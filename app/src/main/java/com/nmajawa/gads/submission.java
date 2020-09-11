package com.nmajawa.gads;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class submission extends AppCompatActivity {
    PopupWindow mPopupWindow;
    LayoutInflater mLayoutInflater;
    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission);

        TextView firstname = findViewById(R.id.firstname);
        TextView lastname = findViewById(R.id.lastname);
        TextView email = findViewById(R.id.email);
        TextView github = findViewById(R.id.github_link);
        Button submit = findViewById(R.id.submit);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = Intent.parseIntent(submission.this, submitPopUp.class);
                //startActivity(intent);

                mLayoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container =(ViewGroup) mLayoutInflater.inflate(R.layout.submit_pop_up, null);

                mPopupWindow = new PopupWindow(container, 600, 600, true);
                mPopupWindow.showAtLocation(mConstraintLayout, Gravity.NO_GRAVITY, 500, 500);
                container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        mPopupWindow.dismiss();
                        return false;
                    }
                });

            }
        });
    }
}