package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private static TextView mStoryTextView;
    private static Button mButtonAns1;
    private static Button mButtonAns2;
    private int mStoryInt=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonAns1 = findViewById(R.id.buttonTop);
        mButtonAns2 = findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonAns1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(mStoryInt == 1) {
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonAns1.setText(R.string.T3_Ans1);
                    mButtonAns2.setText(R.string.T3_Ans2);
                    mStoryInt = 3;
                }

                else if (mStoryInt == 3 || mStoryInt == 4 ){
                    mStoryTextView.setText(R.string.T6_End);
                    mButtonAns1.setVisibility(View.GONE);
                    mButtonAns2.setVisibility(View.GONE);
                }

                else if (mStoryInt == 2){
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonAns1.setText(R.string.T3_Ans1);
                    mButtonAns2.setText(R.string.T3_Ans2);
                    mStoryInt = 4;
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonAns2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(mStoryInt == 1) {
                        mStoryTextView.setText(R.string.T2_Story);
                        mButtonAns1.setText(R.string.T2_Ans1);
                        mButtonAns2.setText(R.string.T2_Ans2);
                        mStoryInt = 2;
                    }
                    else  if(mStoryInt == 2){
                        mStoryTextView.setText(R.string.T4_End);
                        mButtonAns1.setVisibility(View.GONE);
                        mButtonAns2.setVisibility(View.GONE);
                    }

                    else if (mStoryInt == 3 || mStoryInt == 4){
                        mStoryTextView.setText(R.string.T5_End);
                        mButtonAns1.setVisibility(View.GONE);
                        mButtonAns2.setVisibility(View.GONE);
                    }




                }

        });

    }
}
