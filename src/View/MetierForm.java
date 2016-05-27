/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Domaine;
import Class.Metier;
import ClassDAO.DomaineDAO;
import ClassDAO.MetierDAO;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 * Alexis
 */
public class MetierForm extends javax.swing.JPanel {

     private MaFenetrePrincipale mafenetreprincipal;

    public MetierForm(MaFenetrePrincipale mafenetreprincipal) {
        this.mafenetreprincipal = mafenetreprincipal;
        initComponents();
    }
     
     
    /**
     * Creates
     * new
     * form
     * Metier
     */
    public MetierForm() {
        initComponents();
    }

    /**
     * This
     * method
     * is
     * called
     * from
     * within
     * the
     * constructor
     * to
     * initialize
     * the
     * form.
     * WARNING:
     * Do
     * NOT
     * modify
     * this
     * code.
     * The
     * content
     * of
     * this
     * method
     * is
     * always
     * regenerated
     * by
     * the
     * Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_metier = new javax.swing.JPanel();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField_ajouter_nom = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel_message_ajouter_nom = new javax.swing.JLabel();
        jButton_ajouter_metier = new javax.swing.JButton();
        jLabel_message_ajout = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField_modifier_id = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jTextField_modifier_nom = new javax.swing.JTextField();
        jLabel_message_modifier_id = new javax.swing.JLabel();
        jLabel_message_modifier_nom = new javax.swing.JLabel();
        jButton_modifier_metier = new javax.swing.JButton();
        jLabel_message_modifier = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_lister_metier = new javax.swing.JTable();
        jButton_lister_metier = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton_rechercher_metier = new javax.swing.JButton();
        jPanel87 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField_rechercher_nom = new javax.swing.JTextField();
        jLabel_message_rechercher_nom = new javax.swing.JLabel();
        jPanel_resultat = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_id = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_nom = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField_supprimer_id = new javax.swing.JTextField();
        jLabel_message_supprimer_id = new javax.swing.JLabel();
        jButton_supprimer_metier = new javax.swing.JButton();
        jLabel_message_supprimer = new javax.swing.JLabel();
        jButton_retour_ajouter_annonceur4 = new javax.swing.JButton();

        jPanel_metier.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_metier.setPreferredSize(new java.awt.Dimension(720, 500));

        jTabbedPane22.setForeground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(14, 14, 14));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jPanel50.setBackground(new java.awt.Color(30, 30, 30));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel50.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Metier");

        jTextField_ajouter_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("nom metier");

        jLabel_message_ajouter_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_nom.setText("Renseigner un nom d'annonceur");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22)
                    .addComponent(jLabel_message_ajouter_nom))
                .addGap(23, 52, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_ajouter_nom)
                .addContainerGap())
        );

        jButton_ajouter_metier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_metier.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_metier.setText("Ajouter");
        jButton_ajouter_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_metierActionPerformed(evt);
            }
        });

        jLabel_message_ajout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_ajout.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_ajout.setText("L'ajout a bien été effectué !");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_ajouter_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel_message_ajout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton_ajouter_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_ajout)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Ajouter", jPanel3);

        jPanel15.setBackground(new java.awt.Color(14, 14, 14));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel15.setForeground(new java.awt.Color(153, 153, 153));

        jPanel80.setBackground(new java.awt.Color(30, 30, 30));
        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel80.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Metier");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("Identifiant :");

        jTextField_modifier_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Nom :");

        jTextField_modifier_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_modifier_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_id.setText("Renseigner un identifiant annonceur.");

        jLabel_message_modifier_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_nom.setText("Renseigner un nom d'annonceur");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel_message_modifier_id)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel_message_modifier_nom)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_modifier_id)
                .addGap(1, 1, 1)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_modifier_nom)
                .addContainerGap())
        );

        jButton_modifier_metier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_metier.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_metier.setText("Modifier");
        jButton_modifier_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_metierActionPerformed(evt);
            }
        });

        jLabel_message_modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_modifier.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_modifier.setText("La modification à bien été effectué !");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_modifier_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(254, 254, 254))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_message_modifier)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_modifier_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_modifier)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Modifier", jPanel15);

        jPanel16.setBackground(new java.awt.Color(14, 14, 14));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel16.setForeground(new java.awt.Color(153, 153, 153));

        jPanel82.setBackground(new java.awt.Color(30, 30, 30));
        jPanel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel82.setForeground(new java.awt.Color(255, 255, 255));

        jLabel85.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("Metier");

        jTable_lister_metier.setForeground(new java.awt.Color(51, 51, 51));
        jTable_lister_metier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant ", "Nom "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_lister_metier);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addGap(607, 607, 607))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_lister_metier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_metier.setForeground(new java.awt.Color(51, 51, 51));
        jButton_lister_metier.setText("Lister");
        jButton_lister_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_metierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jButton_lister_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lister_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane22.addTab("Lister", jPanel16);

        jPanel17.setBackground(new java.awt.Color(14, 14, 14));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jButton_rechercher_metier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_metier.setForeground(new java.awt.Color(51, 51, 51));
        jButton_rechercher_metier.setText("Rechercher");
        jButton_rechercher_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_metierActionPerformed(evt);
            }
        });

        jPanel87.setBackground(new java.awt.Color(30, 30, 30));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel87.setForeground(new java.awt.Color(255, 255, 255));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Metier");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 204, 204));
        jLabel108.setText("Recherche par nom :");

        jTextField_rechercher_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_rechercher_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_rechercher_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_rechercher_nom.setText("Renseigner un nom d'annonceur valide.");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField_rechercher_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_rechercher_nom))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_rechercher_nom)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel_resultat.setBackground(new java.awt.Color(30, 30, 30));
        jPanel_resultat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_resultat.setForeground(new java.awt.Color(255, 255, 255));

        jLabel95.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(204, 204, 204));
        jLabel95.setText("Résultat");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(204, 204, 204));
        jLabel103.setText("Identifiant :");

        jTextField_rechercher_resultat_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(204, 204, 204));
        jLabel104.setText("Nom :");

        jTextField_rechercher_resultat_nom.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_resultatLayout = new javax.swing.GroupLayout(jPanel_resultat);
        jPanel_resultat.setLayout(jPanel_resultatLayout);
        jPanel_resultatLayout.setHorizontalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_resultatLayout.createSequentialGroup()
                            .addComponent(jLabel103)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_resultatLayout.createSequentialGroup()
                            .addComponent(jLabel104)
                            .addGap(58, 58, 58)
                            .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 70, Short.MAX_VALUE))
        );
        jPanel_resultatLayout.setVerticalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jButton_rechercher_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_rechercher_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Rechercher", jPanel17);

        jPanel18.setBackground(new java.awt.Color(14, 14, 14));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel18.setForeground(new java.awt.Color(153, 153, 153));

        jPanel86.setBackground(new java.awt.Color(30, 30, 30));
        jPanel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel86.setForeground(new java.awt.Color(255, 255, 255));

        jLabel112.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setText("Metier");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("Id du metier :");

        jTextField_supprimer_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_supprimer_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_supprimer_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_supprimer_id.setText("Renseigner un nom annonceur.");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112)
                    .addGroup(jPanel86Layout.createSequentialGroup()
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField_supprimer_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_supprimer_id))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addComponent(jLabel112)
                .addGap(27, 27, 27)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_supprimer_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_supprimer_id)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jButton_supprimer_metier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_supprimer_metier.setForeground(new java.awt.Color(51, 51, 51));
        jButton_supprimer_metier.setText("Supprimer");
        jButton_supprimer_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_supprimer_metierActionPerformed(evt);
            }
        });

        jLabel_message_supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_supprimer.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_supprimer.setText("L'annonceur à bien été supprimé !");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_supprimer_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_supprimer)
                .addGap(223, 223, 223))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton_supprimer_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_supprimer)
                .addGap(78, 78, 78))
        );

        jTabbedPane22.addTab("Supprimer", jPanel18);

        jButton_retour_ajouter_annonceur4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_retour_ajouter_annonceur4.setForeground(new java.awt.Color(51, 51, 51));
        jButton_retour_ajouter_annonceur4.setText("Retour");
        jButton_retour_ajouter_annonceur4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_ajouter_annonceur4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_metierLayout = new javax.swing.GroupLayout(jPanel_metier);
        jPanel_metier.setLayout(jPanel_metierLayout);
        jPanel_metierLayout.setHorizontalGroup(
            jPanel_metierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_metierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_metierLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_metierLayout.setVerticalGroup(
            jPanel_metierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_metierLayout.createSequentialGroup()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_metier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_metier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ajouter_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_metierActionPerformed
       MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_ajouter_nom.getText().equals("")){
           jLabel_message_ajouter_nom.setVisible(true);
           erreur = false;
       } 
       
       if(erreur == true){
          try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Metier metier = new Metier(jTextField_ajouter_nom.getText());
                   
            MetierDAO.CreerMetier(cnx, metier);
            
            jLabel_message_ajout.setVisible(true);
            TextFieldBlanc();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !");  
       }
            
    }//GEN-LAST:event_jButton_ajouter_metierActionPerformed

    private void jButton_modifier_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_metierActionPerformed
        MessageInvisible();
       
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                 
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_modifier_id.getText().equals("")){
           jLabel_message_modifier_id.setVisible(true);
           erreur = false;
       } 
       if(jTextField_modifier_nom.getText().equals("")){
           jLabel_message_modifier_nom.setVisible(true);
           erreur = false;
       } 
       
       if (erreur == true){
          try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
                   
            Metier metier = MetierDAO.TrouverMetierId(cnx, Long.parseLong(jTextField_modifier_id.getText()));
            if (metier == null){
                 jLabel_message_modifier_id.setVisible(true);
            } else{
                metier.setLib_metier(jTextField_modifier_nom.getText());
                MetierDAO.ModifierMetier(cnx, metier);        
                jLabel_message_modifier.setVisible(true);
                TextFieldBlanc();
            }
            
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !");   
       }
             
      
    }//GEN-LAST:event_jButton_modifier_metierActionPerformed

    private void jButton_lister_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_metierActionPerformed
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";               
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
             
            DefaultTableModel model = (DefaultTableModel) jTable_lister_metier.getModel();
            model.setRowCount(0);
            MetierDAO metierDAO = new MetierDAO();
            Collection<Metier> metiers = MetierDAO.ListerMetier(cnx);


            for (Metier m : metiers){
                model.addRow(new Object[] {
                   m.getId_metier(),
                   m.getLib_metier()
                });

            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                 } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !"); 
    }//GEN-LAST:event_jButton_lister_metierActionPerformed

    private void jButton_rechercher_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_metierActionPerformed
        
        jPanel_resultat.setVisible(false);
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";               
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_rechercher_nom.getText().equals("")){
           jLabel_message_rechercher_nom.setVisible(true);
           erreur = false;
       }
       
       if(erreur == true){
            try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Metier metier = MetierDAO.TrouverMetierNom(cnx, jTextField_rechercher_nom.getText());
             if(metier == null){
                 jLabel_message_rechercher_nom.setVisible(true);               
              } else {
                 
                  jPanel_resultat.setVisible(true);
                  jTextField_rechercher_resultat_id.setText(Long.toString(metier.getId_metier()));
                  jTextField_rechercher_resultat_nom.setText(metier.getLib_metier());
                  
             }
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !");  
       }
       
    }//GEN-LAST:event_jButton_rechercher_metierActionPerformed

    private void jButton_supprimer_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_supprimer_metierActionPerformed
       
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";               
       
        Boolean erreur = true;
        
       Connection cnx = null;             
       
       if(jTextField_supprimer_id.getText().equals("")){
           jLabel_message_supprimer_id.setVisible(true);
           erreur = false;
       }
       if (erreur == true){
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Metier metier = MetierDAO.TrouverMetierId(cnx, Integer.parseInt(jTextField_supprimer_id.getText()));   
           
            if(metier == null){
                jLabel_message_supprimer_id.setVisible(true);
            }else {
               MetierDAO.SupprimerMetier(cnx, metier);          
               jLabel_message_supprimer.setVisible(true); 
               TextFieldBlanc();
            }
              
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            
            if(cnx != null){
                try {
                    cnx.close();
                } catch (SQLException ex) {
                }
            }
        }
        
        System.out.println("Connexion fermé !"); 
       }
             
    }//GEN-LAST:event_jButton_supprimer_metierActionPerformed

    private void jButton_retour_ajouter_annonceur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_ajouter_annonceur4ActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }//GEN-LAST:event_jButton_retour_ajouter_annonceur4ActionPerformed

    private void RetourMenu(){ 
        TextFieldBlanc();
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }
    
     private void MessageInvisible(){
        jLabel_message_ajout.setVisible(false);
        jLabel_message_ajouter_nom.setVisible(false);
        jLabel_message_modifier.setVisible(false);
        jLabel_message_modifier_id.setVisible(false);
        jLabel_message_modifier_nom.setVisible(false);
        jLabel_message_rechercher_nom.setVisible(false);
        jLabel_message_supprimer.setVisible(false);
        jLabel_message_supprimer_id.setVisible(false);
        
        
    }
    private void TextFieldBlanc(){
        jTextField_ajouter_nom.setText("");
       
        jTextField_modifier_id.setText("");
        jTextField_modifier_nom.setText("");
        
        jTextField_rechercher_nom.setText("");
        jTextField_rechercher_resultat_id.setText("");
        jTextField_rechercher_resultat_nom.setText("");
        
        jTextField_supprimer_id.setText("");
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_metier;
    private javax.swing.JButton jButton_lister_metier;
    private javax.swing.JButton jButton_modifier_metier;
    private javax.swing.JButton jButton_rechercher_metier;
    private javax.swing.JButton jButton_retour_ajouter_annonceur4;
    private javax.swing.JButton jButton_supprimer_metier;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel95;
    public static javax.swing.JLabel jLabel_message_ajout;
    public static javax.swing.JLabel jLabel_message_ajouter_nom;
    public static javax.swing.JLabel jLabel_message_modifier;
    public static javax.swing.JLabel jLabel_message_modifier_id;
    public static javax.swing.JLabel jLabel_message_modifier_nom;
    public static javax.swing.JLabel jLabel_message_rechercher_nom;
    public static javax.swing.JLabel jLabel_message_supprimer;
    public static javax.swing.JLabel jLabel_message_supprimer_id;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    protected javax.swing.JPanel jPanel_metier;
    public static javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTable jTable_lister_metier;
    private javax.swing.JTextField jTextField_ajouter_nom;
    private javax.swing.JTextField jTextField_modifier_id;
    private javax.swing.JTextField jTextField_modifier_nom;
    private javax.swing.JTextField jTextField_rechercher_nom;
    private javax.swing.JTextField jTextField_rechercher_resultat_id;
    private javax.swing.JTextField jTextField_rechercher_resultat_nom;
    private javax.swing.JTextField jTextField_supprimer_id;
    // End of variables declaration//GEN-END:variables
}
