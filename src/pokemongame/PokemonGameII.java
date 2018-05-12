/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Core I7
 */
public class PokemonGameII extends javax.swing.JFrame {
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    /**
     * Creates new form PokemonGameII
     */
    public PokemonGameII() {
        pokemons.add(new Pikachu());
        pokemons.add(new Koduck());
        pokemons.add(new Sonas());
        initComponents();
        
    }
    public static String printPokemons(ArrayList<Pokemon> pokemons,int member){
        String hp = "Pokemon: "+
                pokemons.get(member).getName()+"\nHealth: "+String.format("%.0f", pokemons.get(member).getHealth())
                +"/"+String.format("%.0f",pokemons.get(member).maxHealth);
        String weight = "\nWeight: "+
                String.format("%.02f",pokemons.get(member).getWeight());
        return hp+weight;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pikaju", "Koduck", "Sonas" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eat");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Berry", "GoldBerry", "MysteryBerry" }));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("jLabel2");

        jButton3.setText("Exercise");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pikaju", "Koduck", "Sonas" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pikaju", "Koduck", "Sonas" }));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jButton4.setText("FIGHT!!!");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("attack");
        jButton5.setToolTipText("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("attack");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton6)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jButton3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton4)
                        .addGap(13, 13, 13)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        switch(jComboBox1.getSelectedItem().toString()){
			case "Pikaju":
				jLabel1.setIcon(new ImageIcon(getClass().getResource("1.png")));
                                jTextArea1.setText(printPokemons(pokemons,0));

				break;
			case "Koduck":
				jLabel1.setIcon(new ImageIcon(getClass().getResource("2.png")));
                                jTextArea1.setText(printPokemons(pokemons,1));

				break;
			case "Sonas":
				jLabel1.setIcon(new ImageIcon(getClass().getResource("3.png")));
                                jTextArea1.setText(printPokemons(pokemons,2));

				break;
			
                                
		}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String typePokemon = jComboBox1.getSelectedItem().toString() ;
         String typeBerry = jComboBox2.getSelectedItem().toString();
         String type = typePokemon + typeBerry ;
        switch(type){
			case "PikajuBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b1.png")));
                                pokemons.get(0).eat(new Berry(0));
                                jTextArea1.setText(printPokemons(pokemons,0));

				break;
			case "PikajuGoldBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b2.png")));
                                pokemons.get(0).eat(new Berry(1));
                                jTextArea1.setText(printPokemons(pokemons,0));

				break;
			case "PikajuMysteryBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b3.png")));
                                pokemons.get(0).eat(new Berry(2));
                                jTextArea1.setText(printPokemons(pokemons,0));

				break;
                        case "KoduckBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b1.png")));
                                pokemons.get(1).eat(new Berry(0));
                                jTextArea1.setText(printPokemons(pokemons,1));

				break;
			case "KoduckGoldBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b2.png")));
                                pokemons.get(1).eat(new Berry(1));
                                jTextArea1.setText(printPokemons(pokemons,1));

				break;
			case "KoduckMysteryBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b3.png")));
                                pokemons.get(1).eat(new Berry(2));
                                jTextArea1.setText(printPokemons(pokemons,1));

				break;
                        case "SonasBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b1.png")));
                                pokemons.get(2).eat(new Berry(0));
                                jTextArea1.setText(printPokemons(pokemons,2));

				break;
			case "SonasGoldBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b2.png")));
                                pokemons.get(2).eat(new Berry(1));
                                jTextArea1.setText(printPokemons(pokemons,2));

				break;
			case "SonasMysteryBerry":
				jLabel2.setIcon(new ImageIcon(getClass().getResource("b3.png")));
                                pokemons.get(2).eat(new Berry(2));
                                jTextArea1.setText(printPokemons(pokemons,2));

				break;
        }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
        switch(jComboBox1.getSelectedItem().toString()){
			case "Pikaju":
				pokemons.get(0).move();
                                jTextArea1.setText(printPokemons(pokemons,0));

				break;
			case "Koduck":
				pokemons.get(1).move();
                                jTextArea1.setText(printPokemons(pokemons,1));

				break;
			case "Sonas":
				pokemons.get(2).move();
                                jTextArea1.setText(printPokemons(pokemons,2));

				break;
			
                                
		}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         switch(jComboBox3.getSelectedItem().toString()+jComboBox4.getSelectedItem().toString()){
			case "PikajuKoduck":
				jLabel3.setIcon(new ImageIcon(getClass().getResource("1.1.png")));
                                jLabel4.setIcon(new ImageIcon(getClass().getResource("2.1.png")));
                                
                                jTextArea2.setText(printPokemons(pokemons,0));
                                jTextArea3.setText(printPokemons(pokemons,1));

				break;
                        case "PikajuSonas":
				jLabel3.setIcon(new ImageIcon(getClass().getResource("1.1.png")));
                                jLabel4.setIcon(new ImageIcon(getClass().getResource("3.1.png")));
                                
                                jTextArea2.setText(printPokemons(pokemons,0));
                                jTextArea3.setText(printPokemons(pokemons,2));

				break;
                       
			case "KoduckPikaju":
				jLabel3.setIcon(new ImageIcon(getClass().getResource("2.1.png")));
                                jLabel4.setIcon(new ImageIcon(getClass().getResource("1.1.png")));
                                
                                jTextArea2.setText(printPokemons(pokemons,1));
                                jTextArea3.setText(printPokemons(pokemons,0));

				break;
                                
                        case "KoduckSonas":
				jLabel3.setIcon(new ImageIcon(getClass().getResource("2.1.png")));
                                jLabel4.setIcon(new ImageIcon(getClass().getResource("3.1.png")));
                                
                                jTextArea2.setText(printPokemons(pokemons,1));
                                jTextArea3.setText(printPokemons(pokemons,2));

				break;
			
                       
			case "SonasPikaju":
				jLabel3.setIcon(new ImageIcon(getClass().getResource("3.1.png")));
                                jLabel4.setIcon(new ImageIcon(getClass().getResource("1.1.png")));
                                
                                jTextArea2.setText(printPokemons(pokemons,2));
                                jTextArea3.setText(printPokemons(pokemons,0));

				break;      
                         
                        case "SonasKoduck":
				jLabel3.setIcon(new ImageIcon(getClass().getResource("3.1.png")));
                                jLabel4.setIcon(new ImageIcon(getClass().getResource("2.1.png")));
                                
                                jTextArea2.setText(printPokemons(pokemons,2));
                                jTextArea3.setText(printPokemons(pokemons,1));

				break;
                                
                                
                                
                                
                                
			
                                
		}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         switch(jComboBox3.getSelectedItem().toString()+jComboBox4.getSelectedItem().toString()){
			case "PikajuKoduck":
				
                               pokemons.get(0).attack(pokemons.get(1));
                                
                                jTextArea2.setText(printPokemons(pokemons,0));
                                jTextArea3.setText(printPokemons(pokemons,1));

				break;
                        case "PikajuSonas":
				pokemons.get(0).attack(pokemons.get(2));
                                
                                jTextArea2.setText(printPokemons(pokemons,0));
                                jTextArea3.setText(printPokemons(pokemons,2));

				break;
                       
			case "KoduckPikaju":
				pokemons.get(1).attack(pokemons.get(0));
                                
                                jTextArea2.setText(printPokemons(pokemons,1));
                                jTextArea3.setText(printPokemons(pokemons,0));

				break;
                                
                        case "KoduckSonas":
				pokemons.get(1).attack(pokemons.get(2));
                                
                                jTextArea2.setText(printPokemons(pokemons,1));
                                jTextArea3.setText(printPokemons(pokemons,2));

				break;
			
                       
			case "SonasPikaju":
				pokemons.get(2).attack(pokemons.get(0));
                                
                                jTextArea2.setText(printPokemons(pokemons,2));
                                jTextArea3.setText(printPokemons(pokemons,0));

				break;      
                         
                        case "SonasKoduck":
				pokemons.get(2).attack(pokemons.get(1));
                                
                                jTextArea2.setText(printPokemons(pokemons,2));
                                jTextArea3.setText(printPokemons(pokemons,1));

				break;
                                
                                
                                
                                
                                
			
                                
		}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        switch(jComboBox3.getSelectedItem().toString()+jComboBox4.getSelectedItem().toString()){
			case "PikajuKoduck":
				
                               pokemons.get(1).attack(pokemons.get(0));
                                
                                jTextArea2.setText(printPokemons(pokemons,0));
                                jTextArea3.setText(printPokemons(pokemons,1));

				break;
                        case "PikajuSonas":
				pokemons.get(2).attack(pokemons.get(0));
                                
                                jTextArea2.setText(printPokemons(pokemons,0));
                                jTextArea3.setText(printPokemons(pokemons,2));

				break;
                       
			case "KoduckPikaju":
				pokemons.get(0).attack(pokemons.get(1));
                                
                                jTextArea2.setText(printPokemons(pokemons,1));
                                jTextArea3.setText(printPokemons(pokemons,0));

				break;
                                
                        case "KoduckSonas":
				pokemons.get(2).attack(pokemons.get(1));
                                
                                jTextArea2.setText(printPokemons(pokemons,1));
                                jTextArea3.setText(printPokemons(pokemons,2));

				break;
			
                       
			case "SonasPikaju":
				pokemons.get(0).attack(pokemons.get(2));
                                
                                jTextArea2.setText(printPokemons(pokemons,2));
                                jTextArea3.setText(printPokemons(pokemons,0));

				break;      
                         
                        case "SonasKoduck":
				pokemons.get(1).attack(pokemons.get(2));
                                
                                jTextArea2.setText(printPokemons(pokemons,2));
                                jTextArea3.setText(printPokemons(pokemons,1));

				break;
                                
                                
                                
                                
                                
			
                                
		}
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(PokemonGameII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonGameII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonGameII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonGameII.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonGameII().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
