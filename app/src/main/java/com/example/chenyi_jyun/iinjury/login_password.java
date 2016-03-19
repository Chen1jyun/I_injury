package com.example.chenyi_jyun.iinjury;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class login_password extends AppCompatActivity {

    private Context mContext;
    private Spinner spinner;
    private String[] lunch = {"雞腿飯", "魯肉飯", "排骨飯", "水餃", "陽春麵"};
    private ArrayAdapter<String> lunchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_password);
        mContext = this.getApplicationContext();
        spinner = (Spinner)findViewById(R.id.my_spinner);
        lunchList = new ArrayAdapter<String>(login_password.this, android.R.layout.simple_spinner_item, lunch);
        spinner.setAdapter(lunchList);
    }
}
