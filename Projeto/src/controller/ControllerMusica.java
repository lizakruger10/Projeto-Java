package controller;

import DAO.MusicaDao;
import model.Musica;
import view.BuscarMusicasFrame;
import view.TelaPrincipalFrame;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerMusica {

    private BuscarMusicasFrame view;
    private TelaPrincipalFrame view1;
    private MusicaDao musicaDAO;
    private List<Musica> ultimasMusicasBuscadas;

    public ControllerMusica(BuscarMusicasFrame view) {
        this.view = view;
        this.musicaDAO = new MusicaDao();
        this.ultimasMusicasBuscadas = new ArrayList<>();
    }

    public ControllerMusica(TelaPrincipalFrame view1) {
        this.view1 = view1;
        this.musicaDAO = new MusicaDao();
        this.ultimasMusicasBuscadas = new ArrayList<>();
    }

    private boolean checkDao() {
        if (musicaDAO == null) {
            JOptionPane.showMessageDialog(null, "DAO de músicas não inicializado. Verifique a conexão com o banco.", "Erro Interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void buscarMusicas() throws SQLException {
        if (!checkDao()) return;

        if (view == null) {
            JOptionPane.showMessageDialog(null, "A view de busca não está inicializada para esta operação.");
            return;
        }

        String termoBusca = view.getTxtBuscarMusicas().getText().trim();
        DefaultListModel<String> modeloListaView = view.getListModelMusicasString(); 
        modeloListaView.clear();
        this.ultimasMusicasBuscadas.clear();

        if (termoBusca.isEmpty()) {
            modeloListaView.addElement("Digite algo para buscar.");
            view.getListaResultadosString().setModel(modeloListaView); 
            return;
        }

        List<Musica> musicasDoBanco = musicaDAO.buscarMusicas(termoBusca);
        this.ultimasMusicasBuscadas.addAll(musicasDoBanco);

        if (this.ultimasMusicasBuscadas.isEmpty()) {
            modeloListaView.addElement("Nenhuma música encontrada.");
        } else {
            for (Musica m : this.ultimasMusicasBuscadas) {
                modeloListaView.addElement(m.toString()); 
            }
        }
        view.getListaResultadosString().setModel(modeloListaView); 
    }

    public void curtirMusica(int selectedIndex) throws SQLException {
        if (!checkDao() || selectedIndex < 0 || selectedIndex >= ultimasMusicasBuscadas.size()) {
            return;
        }

        Musica musica = ultimasMusicasBuscadas.get(selectedIndex);
        musica.setCurtiu(true);
        musica.setDescurtiu(false);

        if (musicaDAO.atualizarStatusCurtida(musica)) {
            if (view != null && view.getListModelMusicasString() != null) {
                DefaultListModel<String> model = view.getListModelMusicasString();
                model.setElementAt(musica.toString(), selectedIndex); 
            }
        }
    }

    public void descurtirMusica(int selectedIndex) throws SQLException {
        if (!checkDao() || selectedIndex < 0 || selectedIndex >= ultimasMusicasBuscadas.size()) {
            return;
        }

        Musica musica = ultimasMusicasBuscadas.get(selectedIndex);
        musica.setDescurtiu(true);
        musica.setCurtiu(false);

        if (musicaDAO.atualizarStatusCurtida(musica)) {
            if (view != null && view.getListModelMusicasString() != null) {
                DefaultListModel<String> model = view.getListModelMusicasString();
                model.setElementAt(musica.toString(), selectedIndex); 
            }
        }
    }
}
