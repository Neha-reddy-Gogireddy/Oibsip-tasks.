package com.example.myapplicationcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btnadd,btn4,btn5,btn6,btnsub,btn7,
            btn8,btn9,btnmul,btndot,btn0,btndotdot,btnequ,
            btncle,btnbre,btndiv;
    EditText ed1;
    float Result1,Result2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn0=(Button) findViewById(R.id.btn0);
        btnadd=(Button) findViewById(R.id.btnadd);
        btnsub=(Button) findViewById(R.id.btnsub);
        btnmul=(Button) findViewById(R.id.btnmul);
        btndiv=(Button) findViewById(R.id.btndiv);
        btnbre=(Button) findViewById(R.id.btnbre);
        btnequ=(Button) findViewById(R.id.btnequ);
        btncle=(Button) findViewById(R.id.btncle);
        btndot=(Button) findViewById(R.id.btndot);
        btndotdot=(Button) findViewById(R.id.btndotdot);
        ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btndotdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Result1=Float.parseFloat(ed1.getText()+"");
                    add=true;
                    ed1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Result1=Float.parseFloat(ed1.getText()+"");
                    sub=true;
                    ed1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Result1=Float.parseFloat(ed1.getText()+"");
                    mul=true;
                    ed1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Result1=Float.parseFloat(ed1.getText()+"");
                    div=true;
                    ed1.setText(null);
                }
            }
        });
        btnequ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result2=Float.parseFloat(ed1.getText()+"");
                if(add){
                    ed1.setText(Result1+Result2+"");
                    add=false;
                }
                if(sub){
                    ed1.setText(Result1-Result2+"");
                    sub=false;
                }
                if(mul){
                    ed1.setText(Result1*Result2+"");
                    mul=false;
                }
                if(div){
                    ed1.setText(Result1/Result2+"");
                    div=false;
                }
            }
        });
        btncle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

    }
}