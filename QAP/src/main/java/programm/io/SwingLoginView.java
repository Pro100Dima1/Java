package programm.io;

import programm.domain.User;
import programm.exception.AuthenticateException;
import programm.sevice.UserService;

import javax.swing.*;

public class SwingLoginView implements LoginView {

    private UserService userService;

    @Override
    public User doLogin() throws AuthenticateException {
        String userName = showInputPopup("Введите имя пользователя: ");
        String userPassword = showInputPopup("Введите пароль: ");
        return userService.authenticate(userName, userPassword);
    }

    private String showInputPopup(String message) {
return (String) JOptionPane.showInputDialog(null,
        message,
        APP_NAME,
        JOptionPane.QUESTION_MESSAGE,
        DEER_ICON,
        null,
        null
        );
    }
}
