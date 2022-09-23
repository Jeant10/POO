package taller6.Modelo;

import java.util.Date;

public class Usuario {
    private Long id=null;
    private String username;
    private String password;
    private String privilegio;

    public Usuario(String username, String password, String privilegio) {
        this.username = username;
        this.password = password;
        this.privilegio = privilegio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", privilegio='" + privilegio + '\'' +
                '}';
    }

}
