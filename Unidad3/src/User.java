public class User {
    private int id;
    private String username;
    private String password;
    private boolean activo;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isCorrectas(User credenciales) {
        if (credenciales.getUsername().toLowerCase().equals("admin")
                && credenciales.getPassword().equals("segura123")) {
            return true;
        }
        return false;
    }
}
