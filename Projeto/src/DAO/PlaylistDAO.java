/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import model.Playlist;
import java.sql.*;

public class PlaylistDAO {

    private Connection conexao;

    public PlaylistDAO() throws SQLException {
        Conexao Conexao = new Conexao(); // Instância da classe Conexao
        this.conexao = Conexao.getConnection();
    }

    public void criarPlaylist(Playlist playlist) throws SQLException {
        String sql = "INSERT INTO playlist (nome) VALUES (?)";
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, playlist.getNome());
        stmt.executeUpdate();

        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            playlist.setId(rs.getInt(1));
        }
        stmt.close();
    }


    public void editar(String nomeAntigo, String nomeNovo) throws SQLException {
        String sql = "UPDATE playlist SET nome = ? WHERE nome = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nomeNovo);
            stmt.setString(2, nomeAntigo);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas == 0) {
                throw new SQLException("Playlist não encontrada: " + nomeAntigo);
            }
        }
    }

    // Excluir playlist
    public void excluir(String nome) throws SQLException {
        String sql = "DELETE FROM playlist WHERE nome = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, nome);
            int linhasAfetadas = stmt.executeUpdate();
            if (linhasAfetadas == 0) {
                throw new SQLException("Playlist não encontrada: " + nome);
            }
        }
    }

}
