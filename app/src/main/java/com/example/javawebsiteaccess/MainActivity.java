package com.example.javawebsiteaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button2,button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);

      final EditText editText=findViewById(R.id.editText);
//
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=editText.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
    startActivity(intent);
            }
        });


       Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT).show();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Have a nice day",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,DisplayMessageActivity.class);
                startActivity(intent);
//


            }
        });
     }
}
