package com.example.activ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    private EditText ets,ets2;
    private TextView tvs;
    private Button sub;
    private String ss1,ss2,ss3;
    private double sa,sb,sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        ets= (EditText)findViewById(R.id.ets);
        ets2= (EditText)findViewById(R.id.ets2);
        tvs= (TextView)findViewById(R.id.tvs);
        sub= (Button)findViewById(R.id.sub);


        sub.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {

                ss1=ets.getText().toString();
                sa= Double.parseDouble(ss1);
                ss2=ets2.getText().toString();
                sb= Double.parseDouble(ss2);
                sc=sa-sb;
                tvs.setText(Double.toString(sc));
            }
        });
    }


}
