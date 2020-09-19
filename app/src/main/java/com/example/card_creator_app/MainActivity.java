package com.example.card_creator_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Card Creator");


        //edit texts
        final EditText fromEditText = (EditText) findViewById(R.id.fromEditText);
        final EditText toEditText = (EditText) findViewById(R.id.toEditText);
        final EditText headingEditText = (EditText) findViewById(R.id.headingEditText);
        final EditText messageEditText = (EditText) findViewById(R.id.messageEditText);

        Button create = (Button) findViewById(R.id.createButton);

        create.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String from = fromEditText.getText().toString();
                String to = toEditText.getText().toString();
                String heading = headingEditText.getText().toString();
                String message = messageEditText.getText().toString();

                //activity intent
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("FROM",from);
                intent.putExtra("TO",to);
                intent.putExtra("HEADING",heading);
                intent.putExtra("MESSAGE",message);
                startActivity(intent);


            }
        });


    }
}