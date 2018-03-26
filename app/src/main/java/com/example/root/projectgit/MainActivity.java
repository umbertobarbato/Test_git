package com.example.root.projectgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //View Layout
    private Button vbtn_add;
    private Button vbtn_sub;
    private TextView vtxt_click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View references
        vbtn_add = findViewById(R.id.btn_add);
        vbtn_sub = findViewById(R.id.btn_sub);
        vtxt_click = findViewById(R.id.txt_click);
        
    }

}
