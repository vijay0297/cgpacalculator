package com.vijayy.vijay.gpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView t=(TextView)findViewById(R.id.textView8);
        String s= getIntent().getStringExtra("nu");
        double d=Double.parseDouble(s);
         t.setText(""+d);
    }
}
