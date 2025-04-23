package programm.sevice;

import programm.domain.User;
import programm.exception.AuthenticateException;

public interface UserService {

    User authenticate(String userName, String password) throws AuthenticateException;
}
