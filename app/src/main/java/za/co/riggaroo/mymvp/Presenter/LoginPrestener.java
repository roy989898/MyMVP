package za.co.riggaroo.mymvp.Presenter;

/**
 * Created by User on 11/8/2016.
 */
public interface LoginPrestener{
    void vaildLogin(String name,String password);

    void loginSuccess();

    void loginFail();

    void onDestory();
}
