package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    String dashedWord = "";
    int failCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String word = selectWord();
        Log.i("test",word);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                dashedWord += "-";
            } else {
                dashedWord += " ";
            }
        }


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
        // Define textView txtWord
        TextView txtWord = (TextView) findViewById(R.id.txtWord);
        // Define ImageView imgFace
        ImageView imgFace = (ImageView) findViewById(R.id.imgFace);
        imgFace.setImageResource(R.drawable.face_1);

        txtWord.setText(dashedWord);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     Log.i("test", "Word contains " );

                TextView txtView = (TextView) view;
                String id = txtView.getResources().getResourceEntryName(txtView.getId());
                String letter = id.replace("txt_", "").toLowerCase();
                char idChar = letter.charAt(0);

                String wordLoweredCase = word.toLowerCase();
                if (wordLoweredCase.contains(letter)) {
                    for (int i = 0; i < wordLoweredCase.length(); i++) {
                        if (wordLoweredCase.charAt(i) == idChar) {
                            char[] wordDashedCharArray = dashedWord.toCharArray();
                            wordDashedCharArray[i] = word.charAt(i);
                            dashedWord = new String(wordDashedCharArray);
                            txtWord.setText(dashedWord);
                            if (!dashedWord.contains("-")) {
                                Intent intent = new Intent(MainActivity.this, FinishActivity.class);
                                intent.putExtra("result", "WON");
                                startActivity(intent);
                                finish();
                              //  return;
                            }
                        }

                    }
                } else {
                    int imageId = R.drawable.face_1;
                    failCount++;



                    switch (failCount) {
                        case 1:
                            imageId = R.drawable.face_2;
                            break;
                        case 2:
                            imageId = R.drawable.face_3;
                            break;
                        case 3:
                            imageId = R.drawable.face_4;
                            break;
                        case 4:
                            imageId = R.drawable.face_5;
                            break;
                        case 5:
                            imageId = R.drawable.face_6;
                            break;
                        case 6:
                            imageId = R.drawable.face_7;
                            break;
                        case 7:
                            imageId = R.drawable.face_8;
                            break;
                        case 8:
                            imageId = R.drawable.face_9;
                            break;
                    }
                    imgFace.setImageResource(imageId);

                    if (failCount >= 8) {
                        //   imgFace.setImageResource(R.drawable.face_9);
                        Intent intent = new Intent(MainActivity.this, FinishActivity.class);
                        intent.putExtra("result", "LOST");
                        startActivity(intent);
                        finish();
                    }


                }
                txtView.setVisibility(View.INVISIBLE);
            }
        };


        txt_A.setOnClickListener(listener);
        txt_B.setOnClickListener(listener);
        txt_C.setOnClickListener(listener);
        txt_D.setOnClickListener(listener);
        txt_E.setOnClickListener(listener);
        txt_F.setOnClickListener(listener);
        txt_G.setOnClickListener(listener);
        txt_H.setOnClickListener(listener);
        txt_I.setOnClickListener(listener);
        txt_J.setOnClickListener(listener);
        txt_K.setOnClickListener(listener);
        txt_L.setOnClickListener(listener);
        txt_M.setOnClickListener(listener);
        txt_N.setOnClickListener(listener);
        txt_O.setOnClickListener(listener);
        txt_P.setOnClickListener(listener);
        txt_Q.setOnClickListener(listener);
        txt_R.setOnClickListener(listener);
        txt_S.setOnClickListener(listener);
        txt_T.setOnClickListener(listener);
        txt_U.setOnClickListener(listener);
        txt_V.setOnClickListener(listener);
        txt_W.setOnClickListener(listener);
        txt_X.setOnClickListener(listener);
        txt_Y.setOnClickListener(listener);
        txt_Z.setOnClickListener(listener);

    }

    private String selectWord() {
        String[] words = {"Android Studio", "Polymorphism", "Encapsulation", "Interface", "Composition", "Development", "Programming", "Web Design", "Research", "Google", "Refactoring", "Renaming", "Documentation","Object Oriented"};

        int randomIndex = (int) (Math.random() * words.length+1);
        return words[randomIndex];
    }
}