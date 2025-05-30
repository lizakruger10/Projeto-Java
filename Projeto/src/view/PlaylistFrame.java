/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.Box;
import javax.swing.JOptionPane;

/**
 *
 * @author Elizabeth
 */
public class PlaylistFrame extends javax.swing.JFrame {

   
    public PlaylistFrame() {
    initComponents();
    initCustomComponents();
}
    private void initCustomComponents() {
    try {
        controller = new controller.ControllerPlaylist();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao conectar com banco: " + e.getMessage());
        return;
    }

    // Configura layout inicial do painel
    painel2.removeAll();
    painel2.setLayout(new javax.swing.BoxLayout(painel2, javax.swing.BoxLayout.Y_AXIS));
    painel2.add(txt_nome_playlist);
    painel2.add(Box.createVerticalStrut(10));
    painel2.add(bt_criar_play);
    painel2.revalidate();
    painel2.repaint();
}




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        lbl_playlists = new javax.swing.JLabel();
        lbl_playlists1 = new javax.swing.JLabel();
        lbl_nomea_nomen = new javax.swing.JLabel();
        lbl_playlists2 = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        bt_criar_play = new javax.swing.JButton();
        txt_nome_playlist = new javax.swing.JTextField();
        painel3 = new javax.swing.JPanel();
        bt_editar_play = new javax.swing.JButton();
        txt_editar_playlist = new javax.swing.JTextField();
        painel4 = new javax.swing.JPanel();
        bt_excluir_play = new javax.swing.JButton();
        txt_excluir_playlist = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        lbl_playlists.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_playlists.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_playlists.setText("Playlists");

        lbl_playlists1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_playlists1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_playlists1.setText("Aqui você pode criar, excluir e editar suas playlists");

        lbl_nomea_nomen.setText("Nome antigo:Nome novo");

        lbl_playlists2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_playlists2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_playlists2.setText("Para editar, utilize: ");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(lbl_playlists, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lbl_nomea_nomen)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_playlists2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_playlists1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addComponent(lbl_playlists, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_playlists1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_playlists2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_nomea_nomen)
                .addContainerGap())
        );

        painel2.setBorder(new javax.swing.border.MatteBorder(null));

        bt_criar_play.setBackground(new java.awt.Color(242, 242, 242));
        bt_criar_play.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_criar_play.setText("Criar");
        bt_criar_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criar_playActionPerformed(evt);
            }
        });

        txt_nome_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nome_playlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_criar_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_nome_playlist, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel2Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(txt_nome_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_criar_play, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel3.setBorder(new javax.swing.border.MatteBorder(null));

        bt_editar_play.setBackground(new java.awt.Color(242, 242, 242));
        bt_editar_play.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_editar_play.setText("Editar");
        bt_editar_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_editar_playActionPerformed(evt);
            }
        });

        txt_editar_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_editar_playlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel3Layout = new javax.swing.GroupLayout(painel3);
        painel3.setLayout(painel3Layout);
        painel3Layout.setHorizontalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_editar_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_editar_playlist, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        painel3Layout.setVerticalGroup(
            painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_editar_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_editar_play, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painel4.setBorder(new javax.swing.border.MatteBorder(null));

        bt_excluir_play.setBackground(new java.awt.Color(242, 242, 242));
        bt_excluir_play.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_excluir_play.setText("Excluir");
        bt_excluir_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluir_playActionPerformed(evt);
            }
        });

        txt_excluir_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_excluir_playlistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel4Layout = new javax.swing.GroupLayout(painel4);
        painel4.setLayout(painel4Layout);
        painel4Layout.setHorizontalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bt_excluir_play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_excluir_playlist, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        painel4Layout.setVerticalGroup(
            painel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_excluir_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_excluir_play, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bt_criar_playActionPerformed(java.awt.event.ActionEvent evt) {                                              
                                                        
                                                
    // Lê o nome da playlist digitado
    String nomePlaylist = txt_nome_playlist.getText().trim();

    
    if (nomePlaylist.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, insira um nome para a playlist.");
        return;
    }

    try {
        
        controller.criarPlaylist(nomePlaylist);

        
        JOptionPane.showMessageDialog(this, "Playlist criada com sucesso!");

        // Limpa o campo de texto
        txt_nome_playlist.setText("");

       
        painel2.removeAll();
        painel2.setLayout(new javax.swing.BoxLayout(painel2, javax.swing.BoxLayout.Y_AXIS));
        painel2.add(txt_nome_playlist);
        painel2.add(Box.createVerticalStrut(10));
        painel2.add(bt_criar_play);
        painel2.revalidate();
        painel2.repaint();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao criar a playlist: " + e.getMessage());
    }




    }                                             

    private void bt_editar_playActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        String entrada = txt_editar_playlist.getText().trim();

    if (!entrada.contains(":")) {
        JOptionPane.showMessageDialog(this, "Use o formato: nomeAntigo:nomeNovo");
        return;
    }

    String[] partes = entrada.split(":", 2);
    String nomeAntigo = partes[0].trim();
    String nomeNovo = partes[1].trim();

    if (nomeAntigo.isEmpty() || nomeNovo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nenhum dos nomes pode estar vazio.");
        return;
    }

    try {
        controller.editarPlaylist(nomeAntigo, nomeNovo);
        JOptionPane.showMessageDialog(this, "Playlist atualizada com sucesso!");
        txt_editar_playlist.setText("");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao editar a playlist: " + e.getMessage());
    }
    }                                              

    private void bt_excluir_playActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
         String nome = txt_excluir_playlist.getText().trim();

    if (nome.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Digite o nome da playlist a ser excluída.");
        return;
    }

    try {
        controller.excluirPlaylist(nome);
        JOptionPane.showMessageDialog(this, "Playlist excluída com sucesso!");
        txt_excluir_playlist.setText("");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao excluir a playlist: " + e.getMessage());
    }
    }                                               

    private void txt_nome_playlistActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void txt_editar_playlistActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void txt_excluir_playlistActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
  //          for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //            if ("Nimbus".equals(info.getName())) {
      //              javax.swing.UIManager.setLookAndFeel(info.getClassName());
        //            break;
          //      }
            //}
//        } catch (ClassNotFoundException ex) {
  //          java.util.logging.Logger.getLogger(PlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (InstantiationException ex) {
      //      java.util.logging.Logger.getLogger(PlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //} catch (IllegalAccessException ex) {
    //        java.util.logging.Logger.getLogger(PlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      //  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        //    java.util.logging.Logger.getLogger(PlaylistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
   //     }
        //</editor-fold>

        /* Create and display the form */
     //   java.awt.EventQueue.invokeLater(new Runnable() {
       //     public void run() {
         //       new PlaylistFrame().setVisible(true);
           // }
      //  });
    //}

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_criar_play;
    private javax.swing.JButton bt_editar_play;
    private javax.swing.JButton bt_excluir_play;
    private javax.swing.JLabel lbl_nomea_nomen;
    private javax.swing.JLabel lbl_playlists;
    private javax.swing.JLabel lbl_playlists1;
    private javax.swing.JLabel lbl_playlists2;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painel4;
    private javax.swing.JTextField txt_editar_playlist;
    private javax.swing.JTextField txt_excluir_playlist;
    private javax.swing.JTextField txt_nome_playlist;
    // End of variables declaration                   
   
    private controller.ControllerPlaylist controller;

}
