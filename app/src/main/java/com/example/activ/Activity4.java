package com.example.activ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    private EditText etm,etm2;
    private TextView tvm;
    private Button mul;
    private String sm1,sm2,sm3;
    private double ma,mb,mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        etm= (EditText)findViewById(R.id.etm);
        etm2= (EditText)findViewById(R.id.etm2);
        tvm= (TextView)findViewById(R.id.tvm);
        mul= (Button)findViewById(R.id.mul);


        mul.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {

                sm1=etm.getText().toString();
                ma= Double.parseDouble(sm1);
                sm2=etm2.getText().toString();
                mb= Double.parseDouble(sm2);
                mc=ma*mb;
                tvm.setText(Double.toString(mc));
            }
        });
    }


}
