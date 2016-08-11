package za.co.riggaroo.mymvp.Presenter;

import za.co.riggaroo.mymvp.Model.LoginModelImpl;
import za.co.riggaroo.mymvp.View.LoginView;

/**
 * Created by User on 11/8/2016.
 */
public class LoginPrestenerImpl implements LoginPrestener {
    private final LoginModelImpl loginModel;
    private LoginView loginVIew;

    public LoginPrestenerImpl(LoginView loginVIew) {
        this.loginVIew = loginVIew;
        loginModel=new LoginModelImpl(this);
    }

    @Override
    public void vaildLogin(String name, String password) {
        if(loginVIew!=null){
            loginVIew.showProgress();

        }
        loginModel.login(name,password);
        

    }

    @Override
    public void loginSuccess() {
        if(loginVIew!=null){
            loginVIew.showSuccesssMessage();
            loginVIew.hideProgress();

            loginVIew.toMain();
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
