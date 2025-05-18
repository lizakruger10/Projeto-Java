package controller;

import DAO.MusicaDao;
import model.Musica;
import view.BuscarMusicasFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.TelaPrincipalFrame;

public class ControllerMusica {

    private BuscarMusicasFrame view;          
    private TelaPrincipalFrame view1;          

    
    public ControllerMusica(BuscarMusicasFrame view) {
        this.view = view;

        this.view.getBt_buscar_musica().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    buscarMusicas();
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerMusica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
    public ControllerMusica(TelaPrincipalFrame view1) {
        this.view1 = view1;
        
    }

    public void buscarMusicas() throws SQLException {
        if (view == null) {
            JOptionPane.showMessageDialog(null, "A view de busca não está inicializada.");
            return;
        }

        String termoBusca = view.getTxtBuscarMusicas().getText().trim();

        if (termoBusca.isEmpty()) {
            JOptionPane.showMessageDialog(view, "");
            return;
        }

        MusicaDao dao = new MusicaDao();
        List<Musica> musicas = dao.buscarMusicas(termoBusca);

        DefaultListModel<String> modeloLista = new DefaultListModel<>();

        if (musicas.isEmpty()) {
            modeloLista.addElement("Nenhuma música encontrada.");
        } else {
            for (Musica m : musicas) {
                String linha = String.format("ID: %d | %s - %s [%s] Lançado em: %d", 
                    m.getId(), m.getNome(), m.getArtista(), m.getGenero(), 
                    m.getAnolancamento());
                modeloLista.addElement(linha);
            }
        }

        view.getListaResultados().setModel(modeloLista);
    }
}