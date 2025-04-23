package programm.sevice;

import programm.domain.User;
import programm.exception.AuthenticateException;
import programm.io.LoginView;
import programm.io.MainView;

public class Application {
    private LoginView loginView;
    private MainView mainView;

    public void run() {

        try {
            User user = loginView.doLogin();
            mainView.showMainFrame(user);
            mainView.startMessaging(user);

        } catch (AuthenticateException e) {
            mainView.showError(e);
            run();
        }
    }
}
