package com.example.card_creator_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Card creator");

        Intent intent = getIntent();

        String heading = intent.getStringExtra("HEADING");
        String to = intent.getStringExtra("TO");
        String message = intent.getStringExtra("MESSAGE");
        String from = intent.getStringExtra("FROM");


        TextView fromTextView = (TextView) findViewById(R.id.fromTextView);
        TextView toTextView = (TextView) findViewById(R.id.toTextView);
        TextView messageTextView = (TextView) findViewById(R.id.messageTextView);
        TextView headingTextView = (TextView) findViewById(R.id.headingTextView);

        fromTextView.setText("From "+from);
        toTextView.setText("To "+to);
        messageTextView.setText(message);
        headingTextView.setText(heading);




    }
}