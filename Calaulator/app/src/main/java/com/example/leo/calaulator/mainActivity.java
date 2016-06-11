package com.example.leo.calaulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class mainActivity extends AppCompatActivity {
    private Button button_caculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        button_caculator = (Button) findViewById(R.id.button18);
        button_caculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent = new Intent(mainActivity.this,CaculatorActivity.class);
                startActivity(intent);
            }
        });
    }
}
