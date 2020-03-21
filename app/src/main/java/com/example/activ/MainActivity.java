package com.example.activ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                openActivity3();

            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                openActivity4();

            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {
                openActivity5();

            }
        });
    }


    public void openActivity3()
    {
        Intent intent= new Intent(this,Activity3.class);
        startActivity(intent);
    }
    public void openActivity2()
    {
        Intent intent2= new Intent(this,Activity2.class);
        startActivity(intent2);
    }
    public void openActivity4()
    {
        Intent intent= new Intent(this,Activity4.class);
        startActivity(intent);
    }
    public void openActivity5()
    {
        Intent intent= new Intent(this,Activity5.class);
        startActivity(intent);
    }

}
