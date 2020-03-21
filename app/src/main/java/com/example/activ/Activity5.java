package com.example.activ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Activity5 extends AppCompatActivity {
    private EditText etd,etd2;
    private TextView tvd;
    private Button div;
    private String sd1,sd2,sd3;
    private double da,db,dc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        etd= (EditText)findViewById(R.id.etd);
        etd2= (EditText)findViewById(R.id.etd2);
        tvd= (TextView)findViewById(R.id.tvd);
        div= (Button)findViewById(R.id.div);


        div.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {

                sd1=etd.getText().toString();
                da= Double.parseDouble(sd1);
                sd2=etd2.getText().toString();
                db= Double.parseDouble(sd2);
                dc=da/db;
                tvd.setText(Double.toString(dc));
            }
        });
    }


}
