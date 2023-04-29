package edu.birzeit.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText t2;
    TextView t3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.textView6);
        t2=findViewById(R.id.editTextTextPersonName2);
        t3=findViewById(R.id.textView5);
        t1.setMovementMethod(new ScrollingMovementMethod());
    }
    public void firstaction(View view){
         String text = t2.getText().toString();
         t3.setVisibility(View.VISIBLE);
         t3.setText(text);

    }

}