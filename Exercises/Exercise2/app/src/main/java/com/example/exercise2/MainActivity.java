package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btnMagic;
    public TextView textView;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMagic = (Button) findViewById(R.id.btnMagic);
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);

        registerListeners();

    }

    private void registerListeners() {
        btnMagic.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            textView.setText("Hello " + editText.getText() + '!');
        }
    }


}