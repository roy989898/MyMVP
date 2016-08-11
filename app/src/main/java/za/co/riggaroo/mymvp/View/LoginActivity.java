package za.co.riggaroo.mymvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import za.co.riggaroo.mymvp.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void showErrorMessage() {

    }

    @Override
    public void showSuccesssMessage() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}
