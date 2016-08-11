package za.co.riggaroo.mymvp.Presenter;

import za.co.riggaroo.mymvp.View.LoginView;

/**
 * Created by User on 11/8/2016.
 */
public class LoginPrestenerImpl implements LoginPrestener {
    private LoginView loginVIew;

    public LoginPrestenerImpl(LoginView loginVIew) {
        this.loginVIew = loginVIew;
    }

    @Override
    public void vaildLogin(String name, String password) {
        

    }

    @Override
    public void loginSuccess() {
        if(loginVIew!=null){
            loginVIew.showSuccesssMessage();
            loginVIew.hideProgress();
        }

    }

    @Override
    public void loginFail() {
        if(loginVIew!=null){
            loginVIew.showErrorMessage();
            loginVIew.hideProgress();
        }

    }

    @Override
    public void onDestory() {
        loginVIew = null;
    }
}
