package com.example.chenyi_jyun.iinjury;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findview();setonclick();
    }
    private void findview(){

        button2=(Button)findViewById(R.id.button2);
    }
    private void setonclick(){

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button2 = new Intent(login.this,login_password.class);
                startActivity(button2);
            }
        });
    }
}
