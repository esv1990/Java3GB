package Lesson6.Task1.server;

public abstract class AuthService {
    abstract String getNickname(String login, String password);

    abstract boolean changeNickname(String currentNickname, String newNickname);
}
