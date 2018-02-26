package com.amirely.elite.bookme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        setTitle(getString(R.string.signup_hint));
    }

    public void goToLogin(View view) {
    }

    public void signUp(View view) {
    }
}
