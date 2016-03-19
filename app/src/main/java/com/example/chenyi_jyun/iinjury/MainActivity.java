package com.example.chenyi_jyun.iinjury;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();setonclick();
    }
    private void findview(){
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
    }
    private void setonclick(){
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent button1=new Intent(MainActivity.this,login.class);
                startActivity(button1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent button2=new Intent(MainActivity.this,one.class);
                startActivity(button2);
            }
        });
    }
}
