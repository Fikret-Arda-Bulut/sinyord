package com.example.sinyord;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class login extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    b1=(Button) findViewById(R.id.button);
    ed1=(EditText) findViewById(R.id.editText);
    ed2=(EditText)findViewById(R.id.editText2);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(ed1.getText().toString().equals("Fikret")&&
                    ed2.getText().toString().equals("123456")){
                Intent i = new Intent(login.this, SecondaryActivity.class);
                i.putExtra("id",ed1.getText().toString());
                startActivity(i);
            }
        }
    });



}
