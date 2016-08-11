package za.co.riggaroo.mymvp.Model;

import android.os.Handler;

import za.co.riggaroo.mymvp.Presenter.LoginPrestener;

/**
 * Created by User on 11/8/2016.
 */
public class LoginModelImpl implements LoginModel {

    private LoginPrestener loginPresenter;

    public LoginModelImpl(LoginPrestener loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void login(final String username, final String password) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (!username.isEmpty() && !password.isEmpty()) {
                    loginPresenter.loginSuccess();
                } else {
                    loginPresenter.loginFail();
                }
            }
        }, 2000);

    }
}
