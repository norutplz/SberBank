package com.example.sberbank;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams wrapContentParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams aboveMarginParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        aboveMarginParams.topMargin = 50;
        //setContentView(R.layout.activity_main);


        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

        TextView enterPasswordTextView = new TextView(this);
        enterPasswordTextView.setText(R.string.enter_password);
        enterPasswordTextView.setTextSize(20);
        enterPasswordTextView.setGravity(Gravity.CENTER_HORIZONTAL);
        enterPasswordTextView.setLayoutParams(wrapContentParams);


        View dotes = new View(this);
        dotes.setLayoutParams(wrapContentParams);
        dotes.setBackgroundResource(R.drawable.circle_shape);




        linearLayout.addView(enterPasswordTextView);
        linearLayout.addView(dotes);

        setContentView(linearLayout);

    }


}