package com.example.scm;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.scm.Constants.Constant;
import com.example.scm.DBHelper.DBHelper_Login;

import static com.example.scm.Constants.Constant.idofthestudent;

public class login extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button login;
    int userId;
    int Password;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                DBHelper_Login dbhl =new DBHelper_Login(getApplicationContext());
                get_data();
                user.setText("");
                pass.setText("");
                x = dbhl.check(userId,Password);
                if (x!=0)
                {
                    Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_SHORT).show();
                    Intent in =new Intent(login.this, MainActivity.class);
                    startActivity(in);
                    idofthestudent=userId;

                }
                else Toast.makeText(getApplicationContext(),"wrong credentials",Toast.LENGTH_SHORT).show();

            }
        });

    }


    void get_data(){

        user =(EditText)findViewById(R.id.login_input_user);
        pass =(EditText)findViewById(R.id.login_input_password);

        userId = Integer.parseInt(user.getText().toString());
        Password = Integer.parseInt(pass.getText().toString());
    }



}
