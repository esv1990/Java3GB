package Lesson3.server;




public class DatabaseAuthService extends AuthService {
    @Override
    public String getNickname(String login, String password) {
        return Database.getUserNickname(login, password);
    }

    @Override
    public boolean changeNickname(String currentNickname, String newNickname) {
        return Database.changeUserNickname(currentNickname, newNickname);
    }

}
