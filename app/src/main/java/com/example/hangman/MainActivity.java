package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt_A = (TextView) findViewById(R.id.txt_A);
        TextView txt_B = (TextView) findViewById(R.id.txt_B);
        TextView txt_C = (TextView) findViewById(R.id.txt_C);
        TextView txt_D = (TextView) findViewById(R.id.txt_D);
        TextView txt_E = (TextView) findViewById(R.id.txt_E);
        TextView txt_F = (TextView) findViewById(R.id.txt_F);
        TextView txt_G = (TextView) findViewById(R.id.txt_G);
        TextView txt_H = (TextView) findViewById(R.id.txt_H);
        TextView txt_I = (TextView) findViewById(R.id.txt_I);
        TextView txt_J = (TextView) findViewById(R.id.txt_J);
        TextView txt_K = (TextView) findViewById(R.id.txt_K);
        TextView txt_L = (TextView) findViewById(R.id.txt_L);
        TextView txt_M = (TextView) findViewById(R.id.txt_M);
        TextView txt_N = (TextView) findViewById(R.id.txt_N);
        TextView txt_O = (TextView) findViewById(R.id.txt_O);
        TextView txt_P = (TextView) findViewById(R.id.txt_P);
        TextView txt_Q = (TextView) findViewById(R.id.txt_Q);
        TextView txt_R = (TextView) findViewById(R.id.txt_R);
        TextView txt_S = (TextView) findViewById(R.id.txt_S);
        TextView txt_T = (TextView) findViewById(R.id.txt_T);
        TextView txt_U = (TextView) findViewById(R.id.txt_U);
        TextView txt_V = (TextView) findViewById(R.id.txt_V);
        TextView txt_W = (TextView) findViewById(R.id.txt_W);
        TextView txt_X = (TextView) findViewById(R.id.txt_X);
        TextView txt_Y = (TextView) findViewById(R.id.txt_Y);
        TextView txt_Z = (TextView) findViewById(R.id.txt_Z);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView txtView = (TextView) view;
                String id = txtView.getResources().getResourceEntryName(txtView.getId());
                id = id.replace("txt_","");
                Toast.makeText(MainActivity.this, "BUTTON  "+  id + " CLICKED",Toast.LENGTH_LONG).show();

            }
        };


        txt_A.setOnClickListener(listener) ;
        txt_B.setOnClickListener(listener) ;
        txt_C.setOnClickListener(listener) ;
        txt_D.setOnClickListener(listener) ;
        txt_E.setOnClickListener(listener) ;
        txt_F.setOnClickListener(listener) ;
        txt_G.setOnClickListener(listener) ;
        txt_H.setOnClickListener(listener) ;
        txt_I.setOnClickListener(listener) ;
        txt_J.setOnClickListener(listener) ;
        txt_K.setOnClickListener(listener) ;
        txt_L.setOnClickListener(listener) ;
        txt_M.setOnClickListener(listener) ;
        txt_N.setOnClickListener(listener) ;
        txt_O.setOnClickListener(listener) ;
        txt_P.setOnClickListener(listener) ;
        txt_Q.setOnClickListener(listener) ;
        txt_R.setOnClickListener(listener) ;
        txt_S.setOnClickListener(listener) ;
        txt_T.setOnClickListener(listener) ;
        txt_U.setOnClickListener(listener) ;
        txt_V.setOnClickListener(listener) ;
        txt_W.setOnClickListener(listener) ;
        txt_X.setOnClickListener(listener) ;
        txt_Y.setOnClickListener(listener) ;
        txt_Z.setOnClickListener(listener) ;

    }
}