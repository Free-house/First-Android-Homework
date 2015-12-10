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
import android.widget.Switch;
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

        button2.setOnClickListener(listener1);
        button3.setOnClickListener(listener1);
        button4.setOnClickListener(listener1);
        button5.setOnClickListener(listener1);

    }

    private class Listener1 implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button2:
                case R.id.button3: {
                    Intent intent = new Intent(LogonActivity.this, MainActivity.class);
                    startActivity(intent);
                    break;
                }
                case R.id.button4: {
                    Intent intent = new Intent(LogonActivity.this, RegisterActivity.class);
                    startActivity(intent);
                    break;
                }
                case R.id.button5: {
                    Toast.makeText(LogonActivity.this, "(｡・`ω´･)请反编译程序查看密码", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }
    }
}
//    private class Listener2 implements View.OnClickListener {
//
//        @Override
//        public void onClick(View v) {
//            Intent intent = new Intent(LogonActivity.this, RegisterActivity.class);
//            startActivity(intent);
//        }
//    }
//
//    private class Listener3 implements View.OnClickListener {
//
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(LogonActivity.this,"(｡・`ω´･)请反编译程序查看密码",Toast.LENGTH_SHORT).show();
//        }
//    }
//
//}

