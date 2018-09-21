package com.example.kosala.a32p;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText miles;
    EditText inch;
    EditText feet;
    RadioButton tocm;
    RadioButton tom;
    TextView outputText;
    TextView outputText1;
    TextView outputText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miles = (EditText)findViewById(R.id.editText);
        feet = (EditText)findViewById(R.id.editText3);
        inch = (EditText)findViewById(R.id.editText4);
        tocm = (RadioButton)findViewById(R.id.tocm);
        tom = (RadioButton)findViewById(R.id.tom);
        outputText = (TextView)findViewById(R.id.textView);
        outputText1 = (TextView)findViewById(R.id.textView2);
        outputText2 = (TextView)findViewById(R.id.textView3);

        final Button button = findViewById(R.id.convertButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double milesVal = 0;
                double inchVal = 0;
                double feetVal = 0;

                milesVal = new Double(miles.getText().toString());
                inchVal = new Double(inch.getText().toString());
                feetVal = new Double(feet.getText().toString());

                if (tocm.isChecked())
                {
                    if (inchVal != 0) {
                        inchVal = UnitConverter.inchToCm(inchVal);
                    }
                    if (milesVal != 0){
                        milesVal = UnitConverter.mileToCm(milesVal);
                    }
                    if (feetVal != 0) {
                        feetVal = UnitConverter.feetToCm(feetVal);
                    }
                }
                else if(tom.isChecked())
                {
                    if (inchVal != 0) {
                        inchVal = UnitConverter.inchToM(inchVal);
                    }
                    if(milesVal != 0) {
                        milesVal = UnitConverter.mileToM(milesVal);
                    }
                    if (feetVal != 0) {
                        feetVal = UnitConverter.feetToM(feetVal);
                    }
                }

                outputText.setText(new Double(milesVal).toString());
                outputText1.setText(new Double(feetVal).toString());
                outputText2.setText(new Double(inchVal).toString());
            }
        });

    }
}
