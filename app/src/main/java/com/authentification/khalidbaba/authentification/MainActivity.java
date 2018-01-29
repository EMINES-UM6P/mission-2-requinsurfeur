package com.authentification.khalidbaba.authentification;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by khalidbaba on 28/01/2018.
 */


public class MainActivity extends Activity {
EditText Email;
EditText Password;
Button Btnlogin;

    // TODO : declare all variables (elements AND variables)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //TODO Instantiate object (EditText and Button)
        Email = (EditText) findViewById(R.id.email);
        Password = (EditText) findViewById(R.id.password);
        Btnlogin = (Button) findViewById(R.id.btnLogin);



        //TODO : handle click listener in button and get values from the editText
Btnlogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Log.i("btnregister", "button register cliqued");
        Intent i = new Intent(MainActivity.this, WolcomeActivity.class);
        i.putExtra("value", Email.getText().toString());
        startActivity(i);
    }
});

        //TODO : Create Intent and send email content to the welcome_activity



    }
}
