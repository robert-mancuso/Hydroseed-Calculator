package com.example.hydroseedcalculator10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView inputViewer, totalViewer;

    Double numTotal, newTotal;
    String currentString, currentTotal, finalTotal;
    String CLEAR = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputViewer = findViewById(R.id.inputView);
        totalViewer = findViewById(R.id.outputView);
    }

    public void button1 (View view) {
        //TextView buttonOne = findViewById(R.id.inputView);
        //buttonOne.setText(buttonOne.getText() + "1");
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("1");
        } else {
            inputViewer.setText(inputViewer.getText() + "1");
        }
        calculateTotal(view);
    }

    public void button2 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("2");
        } else {
            inputViewer.setText(inputViewer.getText() + "2");
        }
        calculateTotal(view);
    }

    public void button3 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("3");
        } else {
            inputViewer.setText(inputViewer.getText() + "3");
        }
        calculateTotal(view);
    }

    public void button4 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("4");
        } else {
            inputViewer.setText(inputViewer.getText() + "4");
        }
        calculateTotal(view);
    }

    public void button5 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("5");
        } else {
            inputViewer.setText(inputViewer.getText() + "5");
        }
        calculateTotal(view);
    }

    public void button6 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("6");
        } else {
            inputViewer.setText(inputViewer.getText() + "6");
        }
        calculateTotal(view);
    }

    public void button7 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("7");
        } else {
            inputViewer.setText(inputViewer.getText() + "7");
        }
        calculateTotal(view);
    }

    public void button8 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("8");
        } else {
            inputViewer.setText(inputViewer.getText() + "8");
        }
        calculateTotal(view);
    }

    public void button9 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("9");
        } else {
            inputViewer.setText(inputViewer.getText() + "9");
        }
        calculateTotal(view);
    }

    public void button0 (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("0");
        } else {
            inputViewer.setText(inputViewer.getText() + "0");
        }
        calculateTotal(view);
    }

    public void periodButton (View view) {
        if (inputViewer.getText().toString().equals("0")) {
            inputViewer.setText("0.");
        } else {
            inputViewer.setText(inputViewer.getText() + ".");
        }
        calculateTotal(view);
    }

    public void deleteButton (View view) {
        //TextView deletePress = findViewById(R.id.inputView);
        //deletePress.setText(deletePress.getText().toString().substring(0,
        //        deletePress.getText().toString().length()-2));
        currentString = inputViewer.getText().toString();
        if (!currentString.isEmpty()) {
            if (currentString.length()<=1) {
                inputViewer.setText("0");
            } else {
                String original = inputViewer.getText().toString();
                String substring = inputViewer.getText().toString().substring(0, original.length()-1);
                inputViewer.setText(String.valueOf(substring));
            }
        }
        calculateTotal(view);
    }

    public void calculateTotal (View view) {
        // convert to int or double (leave out the decimal in the demo if I can't figure it out)
        currentTotal = inputViewer.getText().toString();
        numTotal = Double.parseDouble(currentTotal);
        // do math (check the others' code for this)
        // convert from acres to 50lb Hydromulch bags, and how many pounds total (bags x 50)
        newTotal = numTotal/50.0;
        // convert back to string
        finalTotal = newTotal.toString();
        // post in output
        totalViewer.setText(finalTotal);
    }
}