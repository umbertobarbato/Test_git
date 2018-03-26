package com.example.root.projectgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //View Layout
    private Button vbtn_add;
    private Button vbtn_sub;
    private TextView vtxt_click;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View references
        vbtn_add = findViewById(R.id.btn_add);
        vbtn_sub = findViewById(R.id.btn_sub);
        vtxt_click = findViewById(R.id.txt_click);
        //Set Events Listeners
        vbtn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont = cont + 1;
                setTxttoCont();
            }
        });
        vbtn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont = cont - 1;
                setTxttoCont();
            }
        });

    }

    /**
     * Subroutine set text of label on cont;
     */
    private void setTxttoCont()        {
        vtxt_click.setText(getString(R.string.labelclick_txtinit)+cont+getString(R.string.labelclick_txtend));
    }


}
