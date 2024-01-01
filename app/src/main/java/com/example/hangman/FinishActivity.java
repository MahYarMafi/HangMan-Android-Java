package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        TextView txtResult = (TextView) findViewById(R.id.txtResult);
        Button btnExit = (Button)findViewById(R.id.btnExit);
        Button btnRestart = (Button)findViewById(R.id.btnRestart);
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        if (result.equals("WON")){
            txtResult.setText("YOU WON.");
        }else{
            txtResult.setText("GAME OVER.");
        }

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FinishActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}