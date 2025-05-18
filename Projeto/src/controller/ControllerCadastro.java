/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.UsuarioDAO;
import DAO.Conexao;
import model.Usuario;
import view.CadastroFrame;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import view.TelaPrincipalFrame;
/**
 *
 * @author Elizabeth
 */
public class ControllerCadastro {
    private CadastroFrame view;

    public ControllerCadastro(CadastroFrame view) {
        this.view = view;
    }
    
    public void salvarUsuario(){
        String nome = view.getTxt_nome_cadastro().getText();
        String usuario = view.getTxt_usuario_cadastro().getText();
        String senha = view.getTxt_senha_cadastro().getText();
        Usuario user= new Usuario(nome, usuario, senha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.inserir(user);
            JOptionPane.showMessageDialog(view, "Usuário Cadastrado");
            TelaPrincipalFrame principal = new TelaPrincipalFrame();
                principal.setVisible(true);

                view.dispose();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Erro de conexão!");
        }
    }
}
