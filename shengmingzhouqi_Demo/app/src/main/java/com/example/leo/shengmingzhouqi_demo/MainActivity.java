package com.example.leo.shengmingzhouqi_demo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    //public static Button startNormalActivity,startDialogActivity;
     private Button button_output;
    private EditText editText_output;
    private ImageView imageView;
    private ProgressBar progressBar;
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        Log.d(TAG, "onCreate: ");
        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });

        button_output = (Button) findViewById(R.id.button);
        button_output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText_output.getText().toString();

                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();

                /*
                * 在按钮的点击事件里调用EditText的getText()方法获取到输入的内容，在调用toString()方法转换成字符串
                * 最后用Toast将输入的内容显示出来
                * */
                imageView.setImageResource(R.mipmap.biaoqing);//改变图片

                /*if (progressBar.getVisibility() == View.GONE){
                    progressBar.setVisibility(View.VISIBLE);
                }
                else{
                    progressBar.setVisibility(View.GONE);
                }*/ //进度条在隐藏与显示之间来回切换

                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);//在XML中为进度条设置MAX属性，每点击一次按钮在现有的进度上增加10
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Warning");
                dialog.setMessage("FBI WARNING");
                dialog.setCancelable(false);//不能通过Back键取消0
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                dialog.show();

            }


        });

        imageView = (ImageView) findViewById(R.id.imageView);

        editText_output = (EditText) findViewById(R.id.editText);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    /*@Override
    public void onClick(View v){
        switch (v.getId()){
            case  R.id.button:
                String inputText = editText_output.getText().toString();
                Toast.makeText(MainActivity.this,inputText,Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }*/


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
}


