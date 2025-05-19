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

    public void adicionarMusicaNaPlaylist(int playlistId, int musicaId) throws SQLException {
        String sql = "INSERT INTO playlist_musica (playlist_id, musica_id) VALUES (?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, playlistId);
        stmt.setInt(2, musicaId);
        stmt.executeUpdate();
        stmt.close();
    }

    public void removerMusicaDaPlaylist(int playlistId, int musicaId) throws SQLException {
        String sql = "DELETE FROM playlist_musica WHERE playlist_id = ? AND musica_id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, playlistId);
        stmt.setInt(2, musicaId);
        stmt.executeUpdate();
        stmt.close();
    }

    public void deletarPlaylist(int playlistId) throws SQLException {
        String sql1 = "DELETE FROM playlist_musica WHERE playlist_id = ?";
        PreparedStatement stmt1 = conexao.prepareStatement(sql1);
        stmt1.setInt(1, playlistId);
        stmt1.executeUpdate();
        stmt1.close();

        String sql2 = "DELETE FROM playlist WHERE id = ?";
        PreparedStatement stmt2 = conexao.prepareStatement(sql2);
        stmt2.setInt(1, playlistId);
        stmt2.executeUpdate();
        stmt2.close();
    }
}
