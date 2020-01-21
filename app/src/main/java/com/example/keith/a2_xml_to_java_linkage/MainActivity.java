package com.example.keith.a2_xml_to_java_linkage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button but2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but2 = (Button)findViewById(R.id.button2);
        tv = (TextView)findViewById(R.id.textView);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("                 Clicked by button2");
            }
        });

    }

    public void doButton1(View view) {
        tv.setText("Clicked by button1");
    }
}
