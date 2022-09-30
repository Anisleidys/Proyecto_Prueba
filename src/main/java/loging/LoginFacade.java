package loging;

public class LoginFacade {
    private loginManager loginManager;
    public void userAcces(String user, String pass) {
        loginManager.userAcces(user,pass);

    }

    public void clicBotton() {
        loginManager.clicBotton();
    }
}
