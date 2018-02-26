package com.amirely.elite.bookme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();


    }

    public void goToSignUp(View view) {
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void recoverPassword(View view) {
        Intent intent = new Intent(LoginActivity.this, PasswordRecoverActivity.class);
        startActivity(intent);

    }

    public void logIn(View view) {
        authenticateUser();
    }


    private void authenticateUser() {

    }
}
