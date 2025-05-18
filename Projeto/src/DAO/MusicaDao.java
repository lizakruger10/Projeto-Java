/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Musica;

/**
 *
 * @author Elizabeth
 */
public class MusicaDao {
    private Connection conn;

    public MusicaDao() {
        try {
            this.conn = new Conexao().getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
}


    public MusicaDao(Connection conn) {
        this.conn = conn;
    }
    
    
    
    
    public List<Musica> buscarMusicas(String termo) throws SQLException {
    List<Musica> musicasEncontradas = new ArrayList<>();
    String sql = "SELECT * FROM musicas WHERE nome ILIKE ? OR artista ILIKE ? OR genero ILIKE ?";

    PreparedStatement statement = conn.prepareStatement(sql);
    String busca = "%" + termo + "%";
    statement.setString(1, busca);
    statement.setString(2, busca);
    statement.setString(3, busca);

    ResultSet resultSet = statement.executeQuery();

    while (resultSet.next()) {
        Musica musica = new Musica();
        musica.setNome(resultSet.getString("nome"));
        musica.setArtista(resultSet.getString("artista"));
        musica.setGenero(resultSet.getString("genero"));
        musica.setAnolancamento(resultSet.getInt("anolancamento"));
        musica.setId(resultSet.getInt("id"));
        musicasEncontradas.add(musica);
    }

    return musicasEncontradas;
}
}