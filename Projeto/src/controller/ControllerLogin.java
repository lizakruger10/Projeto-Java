/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import DAO.UsuarioDAO;
import DAO.Conexao;
import model.Usuario;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import view.TelaInicialFrame; 
import view.TelaPrincipalFrame;

/**
 *
 * @author Elizabeth
 */
public class ControllerLogin {
    private LoginFrame view;

    public ControllerLogin(LoginFrame view) {
        this.view = view;
    }
    
    public void loginUsuario() {
    Usuario user = new Usuario(null, 
                                view.getTxt_usuario_login().getText(),
                                view.getTxt_senha_login().getText());
    Conexao conexao = new Conexao();

    try {
        Connection conn = conexao.getConnection();
        UsuarioDAO dao = new UsuarioDAO(conn);
        ResultSet rs = dao.consultar(user);
        
        if (rs.next()) {
            JOptionPane.showMessageDialog(view, "Login efetuado!");
             TelaPrincipalFrame principal = new TelaPrincipalFrame();
                principal.setVisible(true);

                
                view.dispose();
            
        } else {
            JOptionPane.showMessageDialog(view, "Usuário ou senha inválidos!");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(view, "Erro de conexão: ");
    
    }
}

}

