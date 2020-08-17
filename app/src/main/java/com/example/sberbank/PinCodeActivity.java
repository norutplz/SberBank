package com.example.sberbank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.List;

public class PinCodeActivity extends AppCompatActivity {
    private View dotes;
    private TextView enterPasswordTextView;
    private List<View> dotesList;
    private List<TextView> numbersList;
   private TextView numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix,
            numberSeven, numberEight, numberNine, numberZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams wrapContentParams =
                new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintLayout.setLayoutParams(
                new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        setContentView(constraintLayout);
        dotesList = new LinkedList<>();
        numbersList = new LinkedList<>();
        int numberInt = 0;
        View secondDote = new View(this);
        View thirdDote = new View(this);
        View fourthDote = new View(this);

        numberOne = new TextView(this);
        numberTwo = new TextView(this);
        numberThree = new TextView(this);
        numberFour = new TextView(this);
        numberFive = new TextView(this);
        numberSix = new TextView(this);
        numberSeven = new TextView(this);
        numberEight = new TextView(this);
        numberNine = new TextView(this);
        numberZero = new TextView(this);

        numbersList.add(numberZero);
        numbersList.add(numberOne);
        numbersList.add(numberTwo);
        numbersList.add(numberThree);
        numbersList.add(numberFour);
        numbersList.add(numberFive);
        numbersList.add(numberSix);
        numbersList.add(numberSeven);
        numbersList.add(numberEight);
        numbersList.add(numberNine);


        dotesList.add(secondDote);
        dotesList.add(thirdDote);
        dotesList.add(fourthDote);
        for (View dote : dotesList) {

            dote.setBackgroundResource(R.drawable.circle_shape);
            dote.setId(View.generateViewId());
            dote.setLayoutParams(new ConstraintLayout.LayoutParams(50, 50));
            constraintLayout.addView(dote);
        }

        for (TextView number : numbersList) {
            String numberText = String.valueOf(numberInt);
            number.setText(numberText);
            number.setTextSize(50);
            number.setLayoutParams(new ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            number.setId(View.generateViewId());
            constraintLayout.addView(number);
            numberInt++;
        }

        enterPasswordTextView = new TextView(this);
        enterPasswordTextView.setText(R.string.enter_password);
        enterPasswordTextView.setLayoutParams(wrapContentParams);
        enterPasswordTextView.setTextSize(20);
        enterPasswordTextView.setId(View.generateViewId());
        constraintLayout.addView(enterPasswordTextView);


        dotes = new View(this);
        dotes.setBackgroundResource(R.drawable.circle_shape);
        dotes.setId(View.generateViewId());
        dotes.setLayoutParams(new ConstraintLayout.LayoutParams(50, 50));
        constraintLayout.addView(dotes);

        constraintSet.clone(constraintLayout);
        changeConstraints(constraintSet);
        constraintSet.applyTo(constraintLayout);
    }

    private void changeConstraints(ConstraintSet constraintSet) {
        int marginIncrease = 5;
        constraintSet.connect(enterPasswordTextView.getId(), ConstraintSet.TOP, ConstraintSet.PARENT_ID, ConstraintSet.TOP);
        constraintSet.connect(enterPasswordTextView.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT);
        constraintSet.connect(enterPasswordTextView.getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT);

        constraintSet.connect(dotes.getId(), ConstraintSet.TOP, enterPasswordTextView.getId(), ConstraintSet.BOTTOM, 30);
        constraintSet.connect(dotes.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 425);

        for (View dote : dotesList) {
            constraintSet.connect(dote.getId(), ConstraintSet.TOP, enterPasswordTextView.getId(), ConstraintSet.BOTTOM, 30);
            constraintSet.connect(dote.getId(), ConstraintSet.LEFT, dotes.getId(), ConstraintSet.RIGHT, marginIncrease);
            marginIncrease += 55;

        }

        constraintSet.connect(numberTwo.getId(), ConstraintSet.TOP, dotes.getId(), ConstraintSet.BOTTOM, 700);
        constraintSet.connect(numberTwo.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 500);

        constraintSet.connect(numberOne.getId(), ConstraintSet.TOP, dotes.getId(), ConstraintSet.BOTTOM, 700);
        constraintSet.connect(numberOne.getId(), ConstraintSet.RIGHT, numberTwo.getId(), ConstraintSet.LEFT, 80);

        constraintSet.connect(numberThree.getId(), ConstraintSet.TOP, dotes.getId(), ConstraintSet.BOTTOM, 700);
        constraintSet.connect(numberThree.getId(), ConstraintSet.LEFT, numberTwo.getId(), ConstraintSet.RIGHT, 80);

        constraintSet.connect(numberFive.getId(), ConstraintSet.TOP, numberOne.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberFive.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 500);

        constraintSet.connect(numberFour.getId(), ConstraintSet.TOP, numberOne.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberFour.getId(), ConstraintSet.RIGHT, numberFive.getId(), ConstraintSet.LEFT, 80);

        constraintSet.connect(numberSix.getId(), ConstraintSet.TOP, numberOne.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberSix.getId(), ConstraintSet.LEFT, numberFive.getId(), ConstraintSet.RIGHT, 80);

        constraintSet.connect(numberEight.getId(), ConstraintSet.TOP, numberFive.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberEight.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 500);

        constraintSet.connect(numberSeven.getId(), ConstraintSet.TOP, numberFive.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberSeven.getId(), ConstraintSet.RIGHT, numberEight.getId(), ConstraintSet.LEFT, 80);

        constraintSet.connect(numberNine.getId(), ConstraintSet.TOP, numberFive.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberNine.getId(), ConstraintSet.LEFT, numberEight.getId(), ConstraintSet.RIGHT, 80);

        constraintSet.connect(numberZero.getId(), ConstraintSet.TOP, numberEight.getId(), ConstraintSet.BOTTOM, 0);
        constraintSet.connect(numberZero.getId(), ConstraintSet.LEFT, ConstraintSet.PARENT_ID, ConstraintSet.LEFT, 500);
    }

}