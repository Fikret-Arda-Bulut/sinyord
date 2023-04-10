package com.example.sinyord;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class login extends AppCompatActivity {
    EditText txtkullanıcıadi;
    EditText txtsifre;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        txtkullanıcıadi = findViewById(R.id.kullaniciadi);
        txtsifre = findViewById(R.id.sifre);
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtkullanıcıadi.getText().toString().equals("user") && txtsifre.getText().toString().equals("1234")) {
                    Toast.makeText(login.this, "Giriş Başarılı!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(login.this, "Giriş Başarısız!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}