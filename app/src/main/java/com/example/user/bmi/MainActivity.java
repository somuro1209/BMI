package com.example.user.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextWeight,editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextHeight = (EditText)findViewById(R.id.editHeight);
        editTextWeight = (EditText)findViewById(R.id.editWeight);
        textViewResult = (TextView)findViewById(R.id.resultView);
        imageViewResult = (ImageView)findViewById(R.id.imageView);

    }

    public void calculateBMI(View view) {
        double weight, height, bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());
        bmi = weight / (height * height);

        if (bmi <= 10.8) {
            textViewResult.setText("Under weight");
            imageViewResult.setImageResource(R.drawable.under);
        } else if ((bmi > 18.5) && (bmi < 21)) {
            textViewResult.setText("Normal");
            imageViewResult.setImageResource(R.drawable.normal);
        } else if ((bmi >= 21)) {
            textViewResult.setText("Over Weight");
            imageViewResult.setImageResource(R.drawable.over);
        }
    }

    public void reset(View view){
        editTextWeight.setText("");
        editTextHeight.setText("");
    }
}
