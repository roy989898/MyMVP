package za.co.riggaroo.mymvp.View;

/**
 * Created by User on 11/8/2016.
 */
public interface LoginView {

    void showErrorMessage();

    void showSuccesssMessage();

    void showProgress();

    void hideProgress();

    void toMain();

}
