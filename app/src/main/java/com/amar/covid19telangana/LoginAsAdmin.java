package com.amar.covid19telangana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginAsAdmin extends AppCompatActivity {

    TextView logintext;
    Button loginbutton;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as_admin);

        logintext = (TextView) findViewById(R.id.loginadminedittext);
        loginbutton = (Button) findViewById(R.id.loginadminbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = logintext.getText().toString();
                if (password.equals("abdulkalam")){


                    Intent intent = new Intent(LoginAsAdmin.this,AdminHome.class);
                    startActivity(intent);
                }else{
                    showpasswrong();
                }
            }
        });
    }

    public void showpasswrong(){

        Toast.makeText(this,"Password incorrect",Toast.LENGTH_SHORT).show();

    }
}

