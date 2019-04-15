package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch (op){

                }
            }
            int getNum(){return num;}
            void  setNum(){this.num= num;}
        }

        final EditText num = findViewById(R.id.num);
        final EditText num2 = findViewById(R.id.num2);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById();
        Button multi = findViewById();
        Button divid = findViewById();
       /* Button equal = findViewById(R.id.equal);*/
        Button reset = findViewById(R.id.reset);
        final TextView result = findViewById(R.id.result);

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int int1 = Integer.parseInt(num1.getText().toString());
            int int2 = Integer.parseInt(num2.getText().toString());
          /*  sum = int1 + int2;*/
            Calc c = new Calc();
            log.d(tag:"입력값:", msg: c.getNum()+'')
            c.execute();
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                /*  sum = int1 + int2;*/
            }
        });
        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                /*  sum = int1 + int2;*/
            }
        });
        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                /*  sum = int1 + int2;*/
            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                /*  sum = int1 + int2;*/
            }
        });
        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("5");
            }
        });
    }
}
