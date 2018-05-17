package com.vijayy.vijay.gpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
//import java.util.function.DoubleUnaryOperator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText credit=(EditText)findViewById(R.id.editText);
        final EditText grade=(EditText)findViewById(R.id.editText4);
        Button next=(Button)findViewById(R.id.button);
        Button cul=(Button)findViewById(R.id.button3);
        Button pre=(Button)findViewById(R.id.button5);
        final TextView t1=(TextView)findViewById(R.id.textView5);
        final TextView t2=(TextView)findViewById(R.id.textView6);
        final double[] t = {0};
        final double[] ca = {0};
        final double[] tt = {0};
        final double[] pc = {0};
        final double[] pt = {0};
       // String s= getIntent().getStringExtra("nu");
        //int num=Integer.parseInt(s);
        final int[] n = {1};
        t1.setText(n[0] +"");
        t2.setText(n[0] +"");
         pre.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 n[0]--;
                 t1.setText(n[0] + "");
                 t2.setText(n[0] + "");
                 ca[0]-=pc[0];
                 t[0]-=pt[0];
             }
         });
        next.setOnClickListener(new View.OnClickListener() {
           // public int total;
          //  Toast tos=new Toast(getApplicationContext());
            ArrayList<Double> ar=new ArrayList<Double>();
            @Override
            public void onClick(View v) {
                try{
                String c = credit.getText().toString();

                int cc = Integer.parseInt(c);
                String gg = grade.getText().toString();
                char g = gg.charAt(0);
                int total = 0;
                int cal = 1;

                    if (cc != 1 || cc != 2 || cc != 3 || cc != 4 || cc != 5 || cc != 6 || cc != 7 || cc != 8) {

                        if (g == 'S' || g == 's') {
                            cal = 10;
                        } else if (g == 'A' || g == 'a') {
                            cal = 9;
                        } else if (g == 'B' || g == 'b') {
                            cal = 8;
                        } else if (g == 'C' || g == 'c') {
                            cal = 7;
                        } else if (g == 'D' || g == 'd') {
                            cal = 6;
                        } else if (g == 'E' || g == 'e') {
                            cal = 5;
                        } else if (g == 'F' || g == 'f') {
                            cal = 0;
                        } else if (gg.equals("RA") || gg.equals("ra")) {
                            cal = 0;
                        } else {
                            Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                            n[0]--;
                        }
                        total = cc * cal;
                        ar.add((double) total);
                        t[0] += (double)total;
                        ca[0] +=(double)cc;
                        pc[0] =(double)cc;
                        pt[0] =(double)total;
                        Toast.makeText(getApplicationContext(), "" + total, Toast.LENGTH_SHORT).show();
                        ((EditText) findViewById(R.id.editText)).setText("");
                        ((EditText) findViewById(R.id.editText4)).setText("");
                        n[0]++;


                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                        n[0]--;
                    }
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                }
                t1.setText(n[0] + "");
                t2.setText(n[0] + "");
            }
        });
        cul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tt[0]=(t[0]/ca[0]);
                Toast.makeText(getApplicationContext(),""+tt[0],Toast.LENGTH_SHORT).show();
                        String nu=""+tt[0];
                  tt[0]=0;
                  t[0]=0;
                  ca[0]=0;
                  n[0]=1;
                pc[0]=0;
                pt[0]=0;
                t1.setText(n[0] + "");
                t2.setText(n[0] + "");
                        Intent i=new Intent(MainActivity.this, Main3Activity.class).putExtra("nu",nu);
                        startActivity(i);
                    }


        });
    }
}