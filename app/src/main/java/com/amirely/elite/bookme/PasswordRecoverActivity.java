package com.amirely.elite.bookme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PasswordRecoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passord_recover);
        setTitle(getString(R.string.recover_password_msg));
    }


    public void recoverUserPassword(View view) {


    }
}
