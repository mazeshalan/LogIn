package com.shalan.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login, singup;
    AutoCompleteTextView frist, last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        frist = (AutoCompleteTextView)findViewById(R.id.editFristName);
        last = (AutoCompleteTextView)findViewById(R.id.editLastName);

        String [] name = {"mazen", "mazen", "mazen", "mazen", "mazen", "mazen", "mazen", "mazen"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, name);
        frist.setThreshold(1);
        frist.setAdapter(adapter);
        last.setThreshold(1);
        last.setAdapter(adapter);


    }
}
