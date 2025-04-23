package programm.io;

import programm.domain.User;

public interface MainView extends View{

    void showError(Throwable t);

    void showMainFrame(User user);

    void startMessaging(User user);
}
