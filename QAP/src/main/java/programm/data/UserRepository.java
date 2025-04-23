package programm.data;

import programm.domain.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findUserByUsername(String userName);

    Optional<User> findUserByIcqNumber(String userName);

}
