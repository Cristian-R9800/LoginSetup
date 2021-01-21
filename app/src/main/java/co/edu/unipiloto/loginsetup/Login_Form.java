package co.edu.unipiloto.loginsetup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login_Form extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getActionBar().setTitle("Login Form");
    }

    public void btn_signupForm(View view) {
     startActivity(new Intent(getApplicationContext(), Signup_Form.class));
    }
}
