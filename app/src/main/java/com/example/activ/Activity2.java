package com.example.activ;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;


public class Activity2 extends AppCompatActivity {
    private EditText et,et2;
    private TextView tv;
    private Button add;
    private String s1,s2,s3;
    private double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        et= (EditText)findViewById(R.id.et);
        et2= (EditText)findViewById(R.id.et2);
        tv= (TextView)findViewById(R.id.tv);
        add= (Button)findViewById(R.id.add);


        add.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v) {

                s1=et.getText().toString();
                a= Double.parseDouble(s1);
                s2=et2.getText().toString();
                b= Double.parseDouble(s2);
                c=a+b;
                tv.setText(Double.toString(c));
            }
        });
    }


}
