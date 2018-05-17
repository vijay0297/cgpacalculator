package com.vijayy.vijay.gpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText num=(EditText)findViewById(R.id.editText2);
        Button bt=(Button)findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nu=num.getText().toString();
                Intent i=new Intent(Main2Activity.this, MainActivity.class).putExtra("nu",nu);
                startActivity(i);
            }
        });
    }
}
