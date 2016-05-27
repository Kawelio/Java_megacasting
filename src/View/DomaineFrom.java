/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Diffuseur;
import Class.Domaine;
import Class.Information;
import ClassDAO.DiffuseurDAO;
import ClassDAO.DomaineDAO;
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
public class DomaineFrom extends javax.swing.JPanel {

     private MaFenetrePrincipale mafenetreprincipal;

    public DomaineFrom(MaFenetrePrincipale mafenetreprincipal) {
        this.mafenetreprincipal = mafenetreprincipal;
        initComponents();
    }
     
     
    /**
     * Creates
     * new
     * form
     * Domaine
     */
    public DomaineFrom() {
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

        jPanel_domaine = new javax.swing.JPanel();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField_ajouter_nom = new javax.swing.JTextField();
        jLabel_message_ajouter_nom = new javax.swing.JLabel();
        jButton_ajouter_domaine = new javax.swing.JButton();
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
        jButton_modifier_domaine = new javax.swing.JButton();
        jLabel_message_modifier = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_lister_domaine = new javax.swing.JTable();
        jButton_lister_domaine = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton_rechercher_domaine = new javax.swing.JButton();
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
        jButton_supprimer_domaine = new javax.swing.JButton();
        jLabel_message_supprimer = new javax.swing.JLabel();
        jButton_retour_ajouter_annonceur4 = new javax.swing.JButton();

        jPanel_domaine.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_domaine.setPreferredSize(new java.awt.Dimension(720, 500));

        jTabbedPane22.setBackground(new java.awt.Color(14, 14, 14));

        jPanel3.setBackground(new java.awt.Color(14, 14, 14));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jPanel50.setBackground(new java.awt.Color(30, 30, 30));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel50.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Domaine");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("nom domaine");

        jTextField_ajouter_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_ajouter_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_nom.setText("Renseigner un nom de domaine.");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_nom))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(27, 27, 27)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_nom)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jButton_ajouter_domaine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_domaine.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_domaine.setText("Ajouter");
        jButton_ajouter_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_domaineActionPerformed(evt);
            }
        });

        jLabel_message_ajout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_ajout.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_ajout.setText("L'ajout a bien été effectué !");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jButton_ajouter_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel_message_ajout)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ajouter_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_ajout)
                .addContainerGap(122, Short.MAX_VALUE))
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
        jLabel52.setText("Domaine");

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
        jLabel_message_modifier_id.setText("Renseigner un identifiant de domaine.");

        jLabel_message_modifier_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_nom.setText("Renseigner un nom de domaine.");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addGroup(jPanel80Layout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel_message_modifier_id))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel_message_modifier_nom)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel_message_modifier_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_modifier_nom)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jButton_modifier_domaine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_domaine.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_domaine.setText("Modifier");
        jButton_modifier_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_domaineActionPerformed(evt);
            }
        });

        jLabel_message_modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_modifier.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_modifier.setText("La modification à bien été effectué !");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton_modifier_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel_message_modifier)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 214, Short.MAX_VALUE)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_modifier_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_modifier)
                .addContainerGap(118, Short.MAX_VALUE))
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
        jLabel85.setText("Domaine");

        jTable_lister_domaine.setForeground(new java.awt.Color(51, 51, 51));
        jTable_lister_domaine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant domaine", "Nom domaine"
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
        jScrollPane1.setViewportView(jTable_lister_domaine);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addGap(594, 594, 594))
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

        jButton_lister_domaine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_domaine.setForeground(new java.awt.Color(51, 51, 51));
        jButton_lister_domaine.setText("Lister");
        jButton_lister_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_domaineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton_lister_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_lister_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane22.addTab("Lister", jPanel16);

        jPanel17.setBackground(new java.awt.Color(14, 14, 14));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jButton_rechercher_domaine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_domaine.setText("Rechercher");
        jButton_rechercher_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_domaineActionPerformed(evt);
            }
        });

        jPanel87.setBackground(new java.awt.Color(30, 30, 30));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel87.setForeground(new java.awt.Color(255, 255, 255));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Domaine");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 204, 204));
        jLabel108.setText("Recherche par nom :");

        jTextField_rechercher_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_rechercher_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_rechercher_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_rechercher_nom.setText("Renseigner un nom de domaine valide.");

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
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel95)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addComponent(jLabel103)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        jPanel_resultatLayout.setVerticalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104))
                .addGap(0, 12, Short.MAX_VALUE))
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
                        .addGap(18, 18, 18)
                        .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton_rechercher_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_resultat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jButton_rechercher_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
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
        jLabel112.setText("Domaine");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("Id du domaine :");

        jTextField_supprimer_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_supprimer_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_supprimer_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_supprimer_id.setText("Renseigner un id de domaine.");

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

        jButton_supprimer_domaine.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_supprimer_domaine.setForeground(new java.awt.Color(51, 51, 51));
        jButton_supprimer_domaine.setText("Supprimer");
        jButton_supprimer_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_supprimer_domaineActionPerformed(evt);
            }
        });

        jLabel_message_supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_supprimer.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_supprimer.setText("Le domaine à bien été supprimé !");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel_message_supprimer))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jButton_supprimer_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 162, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton_supprimer_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_supprimer)
                .addContainerGap(108, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel_domaineLayout = new javax.swing.GroupLayout(jPanel_domaine);
        jPanel_domaine.setLayout(jPanel_domaineLayout);
        jPanel_domaineLayout.setHorizontalGroup(
            jPanel_domaineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_domaineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_domaineLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_domaineLayout.setVerticalGroup(
            jPanel_domaineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_domaineLayout.createSequentialGroup()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_domaine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_domaine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ajouter_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_domaineActionPerformed
        
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
       if (erreur == true){
            try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Domaine domaine = new Domaine(jTextField_ajouter_nom.getText());
                   
            DomaineDAO.CreerDomaine(cnx, domaine);
            TextFieldBlanc();        
            jLabel_message_ajout.setVisible(true);
            
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
         
    }//GEN-LAST:event_jButton_ajouter_domaineActionPerformed

    private void jButton_modifier_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_domaineActionPerformed
        
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
             
            Domaine domaine =  DomaineDAO.TrouverDomaineId(cnx, Long.parseLong(jTextField_modifier_id.getText()));         
           
            
            if (domaine == null){
                 jLabel_message_modifier_id.setVisible(true);
            }else{
              domaine.setLib_domaine(jTextField_modifier_nom.getText());
              DomaineDAO.ModifierDomaine(cnx, domaine);      
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
         
    }//GEN-LAST:event_jButton_modifier_domaineActionPerformed

    private void jButton_lister_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_domaineActionPerformed
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
             
            DefaultTableModel model = (DefaultTableModel) jTable_lister_domaine.getModel();
             model.setRowCount(0);
            DomaineDAO domaineDAO = new DomaineDAO();
            Collection<Domaine> domaines = DomaineDAO.ListerDomaine(cnx);


            for (Domaine d : domaines){
                model.addRow(new Object[] {
                    d.getId_domaine(),
                    d.getLib_domaine(),           
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
    }//GEN-LAST:event_jButton_lister_domaineActionPerformed

    private void jButton_rechercher_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_domaineActionPerformed
        
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
        
        if(erreur = true){
            try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Domaine domaine = DomaineDAO.TrouverDomaineNom(cnx, jTextField_rechercher_nom.getText());
             
             if(domaine == null){
                 jLabel_message_rechercher_nom.setVisible(true); 
             }else {
                 jPanel_resultat.setVisible(true);
                jTextField_rechercher_resultat_id.setText(Long.toString(domaine.getId_domaine()));
                jTextField_rechercher_resultat_nom.setText(domaine.getLib_domaine());
                
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
    }//GEN-LAST:event_jButton_rechercher_domaineActionPerformed

    private void jButton_supprimer_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_supprimer_domaineActionPerformed
        
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";         
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_supprimer_id.getText().equals("")){
           jLabel_message_supprimer_id.setVisible(true);
           erreur = false;
       }
       if(erreur == true ){
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Domaine domaine = DomaineDAO.TrouverDomaineId(cnx, Integer.parseInt(jTextField_supprimer_id.getText())); 
            if (domaine == null){
                jLabel_message_supprimer_id.setVisible(true);
            }else{
                DomaineDAO.SupprimerDomaine(cnx, domaine);   
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
         
    }//GEN-LAST:event_jButton_supprimer_domaineActionPerformed

      private void TextFieldBlanc(){
        jTextField_ajouter_nom.setText("");   
        jTextField_modifier_id.setText("");
        jTextField_modifier_nom.setText("");
        jTextField_rechercher_nom.setText("");        
        jTextField_rechercher_resultat_id.setText("");   
        jTextField_rechercher_resultat_nom.setText("");  
        jTextField_supprimer_id.setText("");
   }
    private void MessageInvisible(){
        DomaineFrom.jLabel_message_ajout.setVisible(false);    
        DomaineFrom.jLabel_message_ajouter_nom.setVisible(false);   
        DomaineFrom.jPanel_resultat.setVisible(false);
        DomaineFrom.jLabel_message_modifier_id.setVisible(false);
        DomaineFrom.jLabel_message_modifier_nom.setVisible(false);
        DomaineFrom.jLabel_message_modifier.setVisible(false);
        DomaineFrom.jLabel_message_rechercher_nom.setVisible(false);
        DomaineFrom.jLabel_message_supprimer_id.setVisible(false);
        DomaineFrom.jLabel_message_supprimer.setVisible(false);
    }
    
    private void jButton_retour_ajouter_annonceur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_ajouter_annonceur4ActionPerformed
        RetourMenu();
    }//GEN-LAST:event_jButton_retour_ajouter_annonceur4ActionPerformed

    
     private void RetourMenu(){  
        TextFieldBlanc(); 
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_domaine;
    private javax.swing.JButton jButton_lister_domaine;
    private javax.swing.JButton jButton_modifier_domaine;
    private javax.swing.JButton jButton_rechercher_domaine;
    private javax.swing.JButton jButton_retour_ajouter_annonceur4;
    private javax.swing.JButton jButton_supprimer_domaine;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    protected javax.swing.JPanel jPanel_domaine;
    public static javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTable jTable_lister_domaine;
    private javax.swing.JTextField jTextField_ajouter_nom;
    private javax.swing.JTextField jTextField_modifier_id;
    private javax.swing.JTextField jTextField_modifier_nom;
    private javax.swing.JTextField jTextField_rechercher_nom;
    private javax.swing.JTextField jTextField_rechercher_resultat_id;
    private javax.swing.JTextField jTextField_rechercher_resultat_nom;
    private javax.swing.JTextField jTextField_supprimer_id;
    // End of variables declaration//GEN-END:variables
}
