package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = ((TextView)findViewById(R.id.label));

        //User can tap a button to change the color of the label text
        findViewById(R.id.changeTextColorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(getResources().getColor(R.color.deep_purple));
            }
        });

        //user can tap a button to change the color of the background
        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.pink));
            }
        });


        //user can tap a button to change the label text
        findViewById(R.id.changeLabelButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Android is awesome!");
            }
        });


        //user can tap on the background to set everything to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Viktoriia");
                textView.setTextColor((getResources().getColor(R.color.black)));
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_yellow));
            }
        });

        //user can click a button to set the label text to custom
        //enable the button
        findViewById(R.id.setOwnTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //user enters their own text
                String userEnteredText = ((EditText)findViewById(R.id.editText)).getText().toString();
                //if user entered an empty string, set the text to default
                if (userEnteredText.isEmpty()){
                    textView.setText("Enter your own text: ");
                } else {
                    //set the label text to custom text
                    textView.setText(userEnteredText);
                }
            }
        });
    }
}