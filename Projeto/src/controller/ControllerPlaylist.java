/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.PlaylistDAO;
import model.Playlist;
import java.sql.SQLException;

public class ControllerPlaylist {
    private PlaylistDAO playlistDao;

    public ControllerPlaylist() throws SQLException {
        this.playlistDao = new PlaylistDAO();
    }

    public void criarPlaylist(String nome) {
        try {
            Playlist playlist = new Playlist(0, nome);
            playlistDao.criarPlaylist(playlist);
            System.out.println("Playlist criada com sucesso: " + nome);
        } catch (SQLException e) {
            System.err.println("Erro ao criar playlist: " + e.getMessage());
        }
    }


     public void editarPlaylist(String nomeAntigo, String nomeNovo) throws SQLException {
        playlistDao.editar(nomeAntigo, nomeNovo);
    }

    public void excluirPlaylist(String nome) throws SQLException {
        playlistDao.excluir(nome);
    }
    
}
