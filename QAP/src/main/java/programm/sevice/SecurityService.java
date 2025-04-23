package programm.sevice;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurityService {
    public byte[] calculateHash(String inputString) throws NoSuchAlgorithmException {
        MessageDigest instance = MessageDigest.getInstance("MD-5");  // Тутова получаем строку с вводу и преобразуем ее в ХШ по кодировке MD-5
        return instance.digest(inputString.getBytes(StandardCharsets.UTF_8));
    }
}
