
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;
import vista.VistaMenuPrincipal;


public class ControladorLogin implements ActionListener{
    ModeloLogin modelo;

    public ControladorLogin(ModeloLogin modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelo.getVistaLogin().btnIngresar.getActionCommand())) {
           validarUsuario();
        }
        if(e.getActionCommand().equals(modelo.getVistaLogin().btnCancelar.getActionCommand())){
            modelo.getVistaLogin().dispose();
        }
    }
    
    public void validarUsuario(){
        String usuario = modelo.getVistaLogin().txtUsuario.getText();
        String pass = modelo.getVistaLogin().txtPassword.getText();
        if (modelo.getUser().equals(usuario) && modelo.getPwd().equals(pass)) {
            JOptionPane.showMessageDialog(null, "¡Inicio de sesion correcto!", "Bienvenido", 1);
            VistaMenuPrincipal vistaMenu = new VistaMenuPrincipal();
            vistaMenu.setVisible(true);
            modelo.getVistaLogin().dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "¡Credenciales invalidas!", "Error", 0);
            limpiarCampos();
            
        }
        
        
    }
    public void limpiarCampos(){
        modelo.getVistaLogin().txtUsuario.setText("");
        modelo.getVistaLogin().txtPassword.setText("");
    }
    
    
    
}
