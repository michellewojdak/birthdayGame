/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miwoj2051
 */
public class Birthday extends javax.swing.JFrame {

    /**
     * Creates new form Birthday
     */
    public Birthday() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        birthdayPanel = new javax.swing.JPanel();
        greeting = new javax.swing.JLabel();
        namePrompt = new javax.swing.JLabel();
        birthdayPrompt = new javax.swing.JLabel();
        enterName = new javax.swing.JTextField();
        enterBirthdate = new javax.swing.JTextField();
        birthdayOutput = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        birthdayCakeImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        exitProgram = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        birthdayPanel.setBackground(new java.awt.Color(60, 100, 200));

        greeting.setFont(new java.awt.Font("A.C.M.E. Secret Agent", 0, 24)); // NOI18N
        greeting.setForeground(new java.awt.Color(240, 240, 240));
        greeting.setText("Happy Birthday!");

        namePrompt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namePrompt.setForeground(new java.awt.Color(240, 240, 240));
        namePrompt.setText("Name:");

        birthdayPrompt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthdayPrompt.setForeground(new java.awt.Color(240, 240, 240));
        birthdayPrompt.setText("Birthdate:");

        enterName.setBackground(new java.awt.Color(200, 40, 70));
        enterName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterName.setForeground(new java.awt.Color(240, 240, 240));

        enterBirthdate.setBackground(new java.awt.Color(200, 40, 70));
        enterBirthdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enterBirthdate.setForeground(new java.awt.Color(240, 240, 240));
        enterBirthdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBirthdateActionPerformed(evt);
            }
        });

        birthdayOutput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        birthdayOutput.setForeground(new java.awt.Color(240, 240, 240));

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        birthdayCakeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Birthday cake.png"))); // NOI18N
        birthdayCakeImage.setText("jLabel5");

        javax.swing.GroupLayout birthdayPanelLayout = new javax.swing.GroupLayout(birthdayPanel);
        birthdayPanel.setLayout(birthdayPanelLayout);
        birthdayPanelLayout.setHorizontalGroup(
            birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, birthdayPanelLayout.createSequentialGroup()
                .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, birthdayPanelLayout.createSequentialGroup()
                        .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, birthdayPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namePrompt)
                                    .addComponent(birthdayPrompt))
                                .addGap(18, 18, 18)
                                .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, birthdayPanelLayout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(enterButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, birthdayPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdayCakeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(birthdayPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(birthdayOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        birthdayPanelLayout.setVerticalGroup(
            birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthdayPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(birthdayPanelLayout.createSequentialGroup()
                        .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namePrompt)
                            .addComponent(enterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(birthdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdayPrompt)
                            .addComponent(enterBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(enterButton))
                    .addComponent(birthdayCakeImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthdayOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        file.setText("File");

        exitProgram.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitProgram.setText("Exit");
        exitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProgramActionPerformed(evt);
            }
        });
        file.add(exitProgram);

        jMenuBar1.add(file);

        edit.setText("Edit");
        jMenuBar1.add(edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(birthdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(birthdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterBirthdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBirthdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterBirthdateActionPerformed

    private void exitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProgramActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitProgramActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        String name= "";
        String birthday= "";
        birthday = enterBirthdate.getText();
        name= enterName.getText();
        birthdayOutput.setText("Hello " + name + ", your birthday is "+ birthday + "!!!");        // TODO add your handling code here:
    }//GEN-LAST:event_enterButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Birthday.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Birthday().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthdayCakeImage;
    private javax.swing.JLabel birthdayOutput;
    private javax.swing.JPanel birthdayPanel;
    private javax.swing.JLabel birthdayPrompt;
    private javax.swing.JMenu edit;
    private javax.swing.JTextField enterBirthdate;
    private javax.swing.JButton enterButton;
    private javax.swing.JTextField enterName;
    private javax.swing.JMenuItem exitProgram;
    private javax.swing.JMenu file;
    private javax.swing.JLabel greeting;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel namePrompt;
    // End of variables declaration//GEN-END:variables
}
