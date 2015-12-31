package com.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_app_title1).setOnClickListener(this);
        findViewById(R.id.btn_app_title2).setOnClickListener(this);
        findViewById(R.id.btn_app_title3).setOnClickListener(this);
        findViewById(R.id.btn_app_title4).setOnClickListener(this);
        findViewById(R.id.btn_app_title5).setOnClickListener(this);
        findViewById(R.id.btn_app_title6).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int stringResId;
        switch (v.getId()) {
            case R.id.btn_app_title1:
                stringResId = R.string.toast_app_title_1;
                break;
            case R.id.btn_app_title2:
                stringResId = R.string.toast_app_title_2;
                break;
            case R.id.btn_app_title3:
                stringResId = R.string.toast_app_title_3;
                break;
            case R.id.btn_app_title4:
                stringResId = R.string.toast_app_title_4;
                break;
            case R.id.btn_app_title5:
                stringResId = R.string.toast_app_title_5;
                break;
            default:
            case R.id.btn_app_title6:
                stringResId = R.string.toast_app_title_6;
                break;
        }
        Toast.makeText(getApplicationContext(), String.format(getString(R.string.toast_app_title_base), getString(stringResId)), Toast.LENGTH_SHORT).show();
    }
}
