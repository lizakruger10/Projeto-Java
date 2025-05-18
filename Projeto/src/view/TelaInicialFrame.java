/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Elizabeth
 */
public class TelaInicialFrame extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialFrame
     */
    public TelaInicialFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
                         
    private void initComponents() {

        lbl_inicio_bemvindo = new javax.swing.JLabel();
        painel_bemvindo = new javax.swing.JPanel();
        lbl_inicio_texto = new javax.swing.JLabel();
        lbl_inicio_texto1 = new javax.swing.JLabel();
        lbl_inicio_texto2 = new javax.swing.JLabel();
        lbl_inicio_texto3 = new javax.swing.JLabel();
        login_inicioa_login = new javax.swing.JButton();
        bt_inicial_cadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_inicio_bemvindo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_inicio_bemvindo.setText("Seja bem vindo ao SpotiFei !!");

        painel_bemvindo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_inicio_texto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_inicio_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_inicio_texto.setText("Olá! Estamos muito felizes de ter você com a gente!");

        lbl_inicio_texto1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_inicio_texto1.setText("Spotifei é uma plataforma de musicas onde é possível");

        lbl_inicio_texto2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_inicio_texto2.setText("curtir, compartilhar e buscar músicas. Você também");

        lbl_inicio_texto3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_inicio_texto3.setText("pode criar playlists, adicionar ou excluir músicas");

        javax.swing.GroupLayout painel_bemvindoLayout = new javax.swing.GroupLayout(painel_bemvindo);
        painel_bemvindo.setLayout(painel_bemvindoLayout);
        painel_bemvindoLayout.setHorizontalGroup(
            painel_bemvindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_bemvindoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_bemvindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_inicio_texto1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                    .addGroup(painel_bemvindoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbl_inicio_texto3))
                    .addGroup(painel_bemvindoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbl_inicio_texto2))
                    .addComponent(lbl_inicio_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_bemvindoLayout.setVerticalGroup(
            painel_bemvindoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_bemvindoLayout.createSequentialGroup()
                .addComponent(lbl_inicio_texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_inicio_texto1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_inicio_texto2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_inicio_texto3)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        login_inicioa_login.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        login_inicioa_login.setText("Login");
        login_inicioa_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_inicioa_loginActionPerformed(evt);
            }
        });

        bt_inicial_cadastro.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bt_inicial_cadastro.setText("Cadastro");
        bt_inicial_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inicial_cadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lbl_inicio_bemvindo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(painel_bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(login_inicioa_login, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_inicial_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_inicio_bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(painel_bemvindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_inicioa_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_inicial_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void login_inicioa_loginActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.setVisible(false);
    }                                                   

    private void bt_inicial_cadastroActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
        CadastroFrame cf = new CadastroFrame();
        cf.setVisible(true);
        this.setVisible(false);
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
     //   try {
       //     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        //        if ("Nimbus".equals(info.getName())) {
          //          javax.swing.UIManager.setLookAndFeel(info.getClassName());
            //        break;
              //  }
  //          }
    //    } catch (ClassNotFoundException ex) {
     //       java.util.logging.Logger.getLogger(TelaInicialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (InstantiationException ex) {
         //   java.util.logging.Logger.getLogger(TelaInicialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (IllegalAccessException ex) {
         //   java.util.logging.Logger.getLogger(TelaInicialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         //   java.util.logging.Logger.getLogger(TelaInicialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        //}
        //</editor-fold>

        /* Create and display the form */
       // java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
         //       new TelaInicialFrame().setVisible(true);
       //     }
     //   });
   // }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt_inicial_cadastro;
    private javax.swing.JLabel lbl_inicio_bemvindo;
    private javax.swing.JLabel lbl_inicio_texto;
    private javax.swing.JLabel lbl_inicio_texto1;
    private javax.swing.JLabel lbl_inicio_texto2;
    private javax.swing.JLabel lbl_inicio_texto3;
    private javax.swing.JButton login_inicioa_login;
    private javax.swing.JPanel painel_bemvindo;
    // End of variables declaration                   
}
