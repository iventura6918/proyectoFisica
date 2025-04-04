
package modelo;

import vista.VIstaLogin;


public class ModeloLogin {

    
    private final String user = "admin";
    private final String pwd = "admin";
    VIstaLogin vistaLogin;
    private String usuario;
    private String password;

    public ModeloLogin() {
    }

    public ModeloLogin(VIstaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }
       

    public VIstaLogin getVistaLogin() {
        return vistaLogin;
    }

    public void setVistaLogin(VIstaLogin vistaLogin) {
        this.vistaLogin = vistaLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
    
    
    
}
