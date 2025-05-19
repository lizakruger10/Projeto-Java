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


public class MusicaDao {
    private Connection conn;

    public MusicaDao() {
        try {
            this.conn = new Conexao().getConnection(); 
        } catch (SQLException ex) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, "Falha ao obter conexão com o banco de dados.", ex);
            this.conn = null;
        }
    }

    public MusicaDao(Connection conn) {
        this.conn = conn;
    }

    public List<Musica> buscarMusicas(String termo) throws SQLException {
        List<Musica> musicasEncontradas = new ArrayList<>();
        if (this.conn == null) {
            Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, "Não é possível buscar músicas.");
            throw new SQLException("Conexão com o banco de dados não estabelecida.");
        }
        
        // CORRETO PARA SUA TABELA:
        String sql = "SELECT id, nome, artista, genero, anolancamento, \"Curtiu\", \"Descurtiu\" FROM musicas WHERE nome ILIKE ? OR artista ILIKE ? OR genero ILIKE ? ORDER BY nome";

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            String busca = "%" + termo + "%";
            statement.setString(1, busca);
            statement.setString(2, busca);
            statement.setString(3, busca);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Musica musica = new Musica(
                        resultSet.getString("nome"),
                        resultSet.getString("artista"),
                        resultSet.getString("genero"),
                        resultSet.getInt("anolancamento"),
                        resultSet.getInt("id"),
                        
                        resultSet.getBoolean("Curtiu"),    
                        resultSet.getBoolean("Descurtiu")  
                    );
                    musicasEncontradas.add(musica);
                }
            }
        }
        return musicasEncontradas;
    }

    public boolean atualizarStatusCurtida(Musica musica) throws SQLException {
        if (this.conn == null) {
             Logger.getLogger(MusicaDao.class.getName()).log(Level.SEVERE, "Não é possível atualizar status.");
             throw new SQLException("Erro na conexão");
        }
        
        String sql = "UPDATE musicas SET \"Curtiu\" = ?, \"Descurtiu\" = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setBoolean(1, musica.isCurtiu());
            stmt.setBoolean(2, musica.isDescurtiu());
            stmt.setInt(3, musica.getId());
            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;
        }
    }
}
