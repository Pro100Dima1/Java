package programm.io;

import programm.domain.User;
import programm.exception.AuthenticateException;

public interface LoginView extends View{

    User doLogin() throws AuthenticateException;
}
