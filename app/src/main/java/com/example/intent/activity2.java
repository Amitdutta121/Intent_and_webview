package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {


    TextView data;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);


        data = findViewById(R.id.data);
        button = findViewById(R.id.submitb);

        Intent intent = getIntent();
        final String IntentData = intent.getStringExtra("data");

        Log.d("debbbb", IntentData);

        data.setText(IntentData);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(activity2.this, webActivity.class);
                in.putExtra("data", data.getText());
                startActivity(in);
            }
        });



    }
}
