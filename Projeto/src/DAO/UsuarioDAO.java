/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Usuario;

/**
 *
 * @author Elizabeth
 */
public class UsuarioDAO {
    private Connection conn;
    
    public UsuarioDAO(Connection conn){
        this.conn = conn;
    }
    
    public ResultSet consultar(Usuario user) throws SQLException {
    String sql = "SELECT * FROM \"user\" WHERE usuario = ? AND senha = ?";
    PreparedStatement statement = conn.prepareStatement(sql);
    statement.setString(1, user.getUsuario());
    statement.setString(2, user.getSenha());
    return statement.executeQuery();
}
    public boolean usuarioExiste(String usuario) throws SQLException {
    String sql = "SELECT 1 FROM \"user\" WHERE usuario = ?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setString(1, usuario);
    ResultSet rs = stmt.executeQuery();
    return rs.next();
}

    
    public void inserir(Usuario user) throws SQLException{
        String sql = "INSERT INTO \"user\" (nome, usuario, senha) VALUES (?, ?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, user.getNome());
        statement.setString(2, user.getUsuario());
        statement.setString(3, user.getSenha());
        statement.execute();
        conn.close();

    }
}

