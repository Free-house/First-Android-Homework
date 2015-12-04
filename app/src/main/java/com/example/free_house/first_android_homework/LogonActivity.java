package com.example.free_house.first_android_homework;

import android.app.Activity;
import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class LogonActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.logon);

        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        Listener3 listener3 = new Listener3();

        button2.setOnClickListener(listener1);
        button3.setOnClickListener(listener1);
        button4.setOnClickListener(listener2);
        button5.setOnClickListener(listener3);

    }

    private class Listener1 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LogonActivity.this, MainActivity.class);
            intent.putExtra("word",1);
            startActivity(intent);
        }
    }

    private class Listener2 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(LogonActivity.this, RegisterActivity.class);
            startActivity(intent);
        }
    }

    private class Listener3 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(LogonActivity.this,"(｡・`ω´･)请反编译程序查看密码",Toast.LENGTH_SHORT).show();
        }
    }

}

