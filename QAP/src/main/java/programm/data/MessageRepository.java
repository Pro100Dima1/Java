package programm.data;

import programm.domain.Message;
import programm.domain.User;

import java.util.List;

public interface MessageRepository {
    void sendMessage(User user, Message message);

    List<Message> getAllMessages(User user);
}
