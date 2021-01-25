package Lesson3.server;

public class AuthService {
    String getNickname(String login, String password);

    boolean changeNickname(String currentNickname, String newNickname);
}
