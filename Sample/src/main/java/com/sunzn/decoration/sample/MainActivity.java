package com.sunzn.decoration.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_line).setOnClickListener(this);
        findViewById(R.id.btn_grid).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_line:
                startActivity(buildIntent(LineDecorationActivity.class));
                break;
            case R.id.btn_grid:
                startActivity(buildIntent(GridDecorationActivity.class));
                break;
        }
    }

    private Intent buildIntent(Class<? extends AppCompatActivity> clazz) {
        return new Intent(this, clazz);
    }

}
