package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView TextPercent = (TextView) findViewById(R.id.TextPercent);
        final TextView Text = (TextView) findViewById(R.id.Text);
        Text.setVisibility(View.INVISIBLE);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekbar);
        final TextView TextRadio = (TextView) findViewById(R.id.TextRadio);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        final Button button = (Button) findViewById(R.id.button);
        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.check1);
        final CheckBox checkbox2 = (CheckBox) findViewById(R.id.check2);
        final CheckBox checkbox3 = (CheckBox) findViewById(R.id.check3);
        final CheckBox checkbox4 = (CheckBox) findViewById(R.id.check4);
        final TextView Textdisplay = (TextView) findViewById(R.id.textdisplay);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                String text = String.valueOf(i);
                TextPercent.setText(text + "%");
                if (i >= 40 && i <= 45) {
                    Text.setVisibility(View.VISIBLE);
                } else {
                    Text.setVisibility(View.INVISIBLE);
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radio1:
                        TextRadio.setText("You have selected the first button");
                        break;
                    case R.id.radio2:
                        TextRadio.setText("You have selected the second button");
                        break;
                    case R.id.radio3:
                        TextRadio.setText("You have selected the third button");
                        break;
                    case R.id.radio4:
                        TextRadio.setText("You have selected the fourth button");
                        break;
                }


//                int radioButtonID = radioGroup.getCheckedRadioButtonId();
//                View radioButton = radioGroup.findViewById(radioButtonID);
//                int idx = radioGroup.indexOfChild(radioButton);
//                TextRadio.setText("You have selected button "+ idx)



            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Texte = "You have selected ";
                if(checkbox1.isChecked()){
                    Texte+="Check one ";
                    Textdisplay.setText(Texte);
                }
                if(checkbox2.isChecked()){
                   Texte +="Check two ";
                    Textdisplay.setText(Texte);
                }
                if(checkbox3.isChecked()){
                    Texte+= "Check three ";
                    Textdisplay.setText(Texte);

                }
                if(checkbox4.isChecked()){
                  Texte+="Check four ";
                    Textdisplay.setText(Texte);

                }
                if(!checkbox1.isChecked()&&!checkbox2.isChecked()&&!checkbox3.isChecked()&&!checkbox4.isChecked()){
                    Textdisplay.setText("No Checkbox selected ");
                }






            }
        });


    }
}

