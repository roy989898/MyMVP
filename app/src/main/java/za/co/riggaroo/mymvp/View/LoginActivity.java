package za.co.riggaroo.mymvp.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import za.co.riggaroo.mymvp.Presenter.LoginPrestener;
import za.co.riggaroo.mymvp.Presenter.LoginPrestenerImpl;
import za.co.riggaroo.mymvp.R;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.edUserName)
    EditText edUserName;
    @BindView(R.id.edPassword)
    EditText edPassword;
    @BindView(R.id.btLogin)
    Button btLogin;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    private LoginPrestener loginPresent;


    @Override
    protected void onDestroy() {
        loginPresent.onDestory();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        loginPresent = new LoginPrestenerImpl(this);
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "Password or UserName Error", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showSuccesssMessage() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);

    }

    @Override
    public void toMain() {
        //TODO to the next activity
    }


    @OnClick(R.id.btLogin)
    public void onClick() {
        String userName = edUserName.getText().toString();
        String userPassword = edUserName.getText().toString();
        loginPresent.vaildLogin(userName, userPassword);
    }
}
