package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        assign all elements into variables
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        Button button  = findViewById(R.id.btn);

//        Button Click handler
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                validate(et1.getText().toString(), et2.getText().toString());
            }

//            validation
            private void validate(String us, String pw){
                if(us.equals("admin") && pw.equals("1234")){
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Login Unsuccessfull", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}