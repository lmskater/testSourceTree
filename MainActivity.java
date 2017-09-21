package com.example.xxx001.myapplication;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements LoginView {

    private EditText username, password;
    private Button login, clear;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //xxxxxbb
    }

    private void init() {
        loginPresenter = new LoginPresenterImpl(this);
//        username = (EditText) findViewById(R.id.username);
//        password = (EditText) findViewById(R.id.pass);
//        login = (Button) findViewById(R.id.login);
//        clear = (Button) findViewById(R.id.clear);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.login();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.clear();
            }
        });
    }

    @Override
    public String getUsername() {
        return username.getText().toString();
    }

    @Override
    public String getPassword() {
        return password.getText().toString();
    }

    @Override
    public void clearUsername() {
        username.setText("");
    }

    @Override
    public void clearPassword() {
        password.setText("");
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}
