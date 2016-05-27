/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Media;
import Class.Metier;
import Class.Type_Media;
import ClassDAO.MediaDAO;
import ClassDAO.MetierDAO;
import ClassDAO.Type_MediaDAO;
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
public class MediaForm extends javax.swing.JPanel {

      private MaFenetrePrincipale mafenetreprincipal;

    public MediaForm(MaFenetrePrincipale mafenetreprincipal) {
        this.mafenetreprincipal = mafenetreprincipal;
        initComponents();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";               
       
       Connection cnx = null;  
      
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Type_MediaDAO type_MediaDAO = new Type_MediaDAO();
            Collection<Type_Media> type_Medias = Type_MediaDAO.ListerType_Media(cnx);
            for (Type_Media t : type_Medias){                          
                MediaForm.jComboBox_media.addItem(t.getLib_type_media());
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
      
      
    /**
     * Creates
     * new
     * form
     * Media
     */
    public MediaForm() {
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

        jPanel_media = new javax.swing.JPanel();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_ajouter_url_media = new javax.swing.JTextField();
        jLabel_message_ajouter_url_media = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ajouter_poid_media = new javax.swing.JTextField();
        jLabel_message_ajouter_poid_media = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_ajouter_media = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox_media = new javax.swing.JComboBox();
        jLabel_message_ajout_media = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField_modifier_url = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel_message_modifier_id = new javax.swing.JLabel();
        jLabel_message_modifier_nom = new javax.swing.JLabel();
        jTextField_modifier_id = new javax.swing.JTextField();
        jButton_modifier_media = new javax.swing.JButton();
        jLabel_message_modifier = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_lister_media = new javax.swing.JTable();
        jButton_lister_media = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton_rechercher_media = new javax.swing.JButton();
        jPanel87 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField_rechercher_url = new javax.swing.JTextField();
        jLabel_message_rechercher_nom = new javax.swing.JLabel();
        jPanel_resultat = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_id = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_url = new javax.swing.JTextField();
        jTextField_rechercher_resultat_poids = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_id_type = new javax.swing.JTextField();
        jPanel_media_supprimer = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField_supprimer_media = new javax.swing.JTextField();
        jLabel_message_supprimer_id = new javax.swing.JLabel();
        jButton_spprimer_media = new javax.swing.JButton();
        jLabel_message_supprimer = new javax.swing.JLabel();
        jButton_retour_ajouter_annonceur4 = new javax.swing.JButton();

        jPanel_media.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_media.setPreferredSize(new java.awt.Dimension(720, 500));

        jPanel18.setBackground(new java.awt.Color(14, 14, 14));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Media");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("url :");

        jTextField_ajouter_url_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ajouter_url_mediaActionPerformed(evt);
            }
        });

        jLabel_message_ajouter_url_media.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_url_media.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_url_media.setText("Renseigner une url de media valide.");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("poids :");

        jTextField_ajouter_poid_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ajouter_poid_mediaActionPerformed(evt);
            }
        });

        jLabel_message_ajouter_poid_media.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_poid_media.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_poid_media.setText("Renseigner un poid de media valide.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Mo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField_ajouter_url_media, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_url_media)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_ajouter_poid_media, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jLabel_message_ajouter_poid_media))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_ajouter_url_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_url_media)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField_ajouter_poid_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_poid_media)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton_ajouter_media.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_media.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_media.setText("Ajouter");
        jButton_ajouter_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_mediaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Type de media");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("extension du media :");

        jComboBox_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_mediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jLabel_message_ajout_media.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_ajout_media.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_ajout_media.setText("L'ajout a bien été effectué !");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_ajout_media)
                .addGap(103, 103, 103))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_ajouter_media, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButton_ajouter_media, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_ajout_media)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Ajouter", jPanel18);

        jPanel15.setBackground(new java.awt.Color(14, 14, 14));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel15.setForeground(new java.awt.Color(153, 153, 153));

        jPanel80.setBackground(new java.awt.Color(30, 30, 30));
        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel80.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Media");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 204, 204));
        jLabel53.setText("url :");

        jTextField_modifier_url.setForeground(new java.awt.Color(51, 51, 51));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Identifiant :");

        jLabel_message_modifier_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_id.setText("Renseigner un identifiant de media.");

        jLabel_message_modifier_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_nom.setText("Renseigner une url de media.");

        jTextField_modifier_id.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel_message_modifier_nom)
                    .addComponent(jLabel_message_modifier_id)
                    .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel80Layout.createSequentialGroup()
                            .addComponent(jLabel54)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel80Layout.createSequentialGroup()
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField_modifier_url, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel_message_modifier_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_modifier_nom)
                .addGap(28, 28, 28))
        );

        jButton_modifier_media.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_media.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_media.setText("Modifier");
        jButton_modifier_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_mediaActionPerformed(evt);
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
                        .addGap(210, 210, 210)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_message_modifier)
                            .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton_modifier_media, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton_modifier_media, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_modifier)
                .addContainerGap(106, Short.MAX_VALUE))
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
        jLabel85.setText("Media");

        jTable_lister_media.setForeground(new java.awt.Color(51, 51, 51));
        jTable_lister_media.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Url", "Poids", "Identifiant Type_Media"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_lister_media);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addGap(610, 610, 610))
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

        jButton_lister_media.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_media.setForeground(new java.awt.Color(51, 51, 51));
        jButton_lister_media.setText("Lister");
        jButton_lister_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_mediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jButton_lister_media, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_lister_media, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane22.addTab("Lister", jPanel16);

        jPanel17.setBackground(new java.awt.Color(14, 14, 14));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jButton_rechercher_media.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_media.setForeground(new java.awt.Color(51, 51, 51));
        jButton_rechercher_media.setText("Rechercher");
        jButton_rechercher_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_mediaActionPerformed(evt);
            }
        });

        jPanel87.setBackground(new java.awt.Color(30, 30, 30));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel87.setForeground(new java.awt.Color(255, 255, 255));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Media");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 204, 204));
        jLabel108.setText("Recherche par url :");

        jTextField_rechercher_url.setForeground(new java.awt.Color(51, 51, 51));

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
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_rechercher_url, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_rechercher_nom))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addComponent(jLabel107)
                .addGap(18, 18, 18)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_rechercher_nom)
                .addGap(0, 8, Short.MAX_VALUE))
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
        jLabel104.setText("Url :");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(204, 204, 204));
        jLabel105.setText("Poids :");

        jTextField_rechercher_resultat_url.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_poids.setForeground(new java.awt.Color(51, 51, 51));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setText("Identifiant Type :");

        jTextField_rechercher_resultat_id_type.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_resultatLayout = new javax.swing.GroupLayout(jPanel_resultat);
        jPanel_resultat.setLayout(jPanel_resultatLayout);
        jPanel_resultatLayout.setHorizontalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addComponent(jLabel105)
                    .addComponent(jLabel104)
                    .addComponent(jLabel103)
                    .addComponent(jLabel106))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_rechercher_resultat_poids, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id_type, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_url, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
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
                    .addComponent(jTextField_rechercher_resultat_url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_poids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton_rechercher_media, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton_rechercher_media, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Rechercher", jPanel17);

        jPanel_media_supprimer.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_media_supprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_media_supprimer.setForeground(new java.awt.Color(153, 153, 153));

        jPanel86.setBackground(new java.awt.Color(30, 30, 30));
        jPanel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel86.setForeground(new java.awt.Color(255, 255, 255));

        jLabel112.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setText("Media");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("Id du media :");

        jTextField_supprimer_media.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_supprimer_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_supprimer_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_supprimer_id.setText("Renseigner un id de media.");

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
                        .addComponent(jTextField_supprimer_media, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField_supprimer_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_supprimer_id)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jButton_spprimer_media.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_spprimer_media.setForeground(new java.awt.Color(51, 51, 51));
        jButton_spprimer_media.setText("Supprimer");
        jButton_spprimer_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_spprimer_mediaActionPerformed(evt);
            }
        });

        jLabel_message_supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_supprimer.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_supprimer.setText("Le media à bien été supprimé !");

        javax.swing.GroupLayout jPanel_media_supprimerLayout = new javax.swing.GroupLayout(jPanel_media_supprimer);
        jPanel_media_supprimer.setLayout(jPanel_media_supprimerLayout);
        jPanel_media_supprimerLayout.setHorizontalGroup(
            jPanel_media_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_media_supprimerLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(jPanel_media_supprimerLayout.createSequentialGroup()
                .addGroup(jPanel_media_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_media_supprimerLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton_spprimer_media, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_media_supprimerLayout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel_message_supprimer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_media_supprimerLayout.setVerticalGroup(
            jPanel_media_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_media_supprimerLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_spprimer_media, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_supprimer)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Supprimer", jPanel_media_supprimer);

        jButton_retour_ajouter_annonceur4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_retour_ajouter_annonceur4.setForeground(new java.awt.Color(51, 51, 51));
        jButton_retour_ajouter_annonceur4.setText("Retour");
        jButton_retour_ajouter_annonceur4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_ajouter_annonceur4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_mediaLayout = new javax.swing.GroupLayout(jPanel_media);
        jPanel_media.setLayout(jPanel_mediaLayout);
        jPanel_mediaLayout.setHorizontalGroup(
            jPanel_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_mediaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        jPanel_mediaLayout.setVerticalGroup(
            jPanel_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mediaLayout.createSequentialGroup()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_modifier_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_mediaActionPerformed
        
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
        Boolean erreur = true;
        
       Connection cnx = null;    
       
       if(jTextField_modifier_id.getText().equals("")){
           jLabel_message_modifier_id.setVisible(true);
           erreur = false;
       } 
       if(jTextField_modifier_url.getText().equals("")){
           jLabel_message_modifier_nom.setVisible(true);
           erreur = false;
       } 
       
       if(erreur == true){
            try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Media media = MediaDAO.TrouverMediaId(cnx, Integer.parseInt(jTextField_modifier_id.getText()));           
            media.setUrl_media(jTextField_modifier_url.getText());
            
            MediaDAO.ModifierMedia(cnx, media);
            
            jLabel_message_modifier.setVisible(true);
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
                                
    }//GEN-LAST:event_jButton_modifier_mediaActionPerformed

    private void jButton_lister_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_mediaActionPerformed
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
             
            DefaultTableModel model = (DefaultTableModel) jTable_lister_media.getModel();
            model.setRowCount(0);
            MediaDAO mediaDAO = new MediaDAO();
            Collection<Media> medias = MediaDAO.ListerMedia(cnx);


            for (Media m : medias){
                model.addRow(new Object[] {
                   m.getId_media(),
                   m.getUrl_media(),
                   m.getPoi_media(),
                   m.getType_media().getId_type_media()
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
    }//GEN-LAST:event_jButton_lister_mediaActionPerformed

    private void jButton_rechercher_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_mediaActionPerformed
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";           
       
       Connection cnx = null;             
       
        if(jTextField_rechercher_url.getText().equals("")){
                 jLabel_message_rechercher_nom.setVisible(true); 
                 jPanel_resultat.setVisible(false);
        } 
        
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Media media = MediaDAO.TrouverMediaUrl(cnx, jTextField_rechercher_url.getText());
            
             if(media == null){
                    jLabel_message_rechercher_nom.setVisible(true);   
                    jPanel_resultat.setVisible(false);
             } else {
                    jPanel_resultat.setVisible(true);
                    jTextField_rechercher_resultat_id.setText(Long.toString(media.getId_media()));
                    jTextField_rechercher_resultat_url.setText(media.getUrl_media());
                    jTextField_rechercher_resultat_poids.setText(Integer.toString(media.getPoi_media()));
                    jTextField_rechercher_resultat_id_type.setText(Long.toString(media.getType_media().getId_type_media()));
                    jLabel_message_rechercher_nom.setVisible(false); 
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
    }//GEN-LAST:event_jButton_rechercher_mediaActionPerformed

    private void jButton_retour_ajouter_annonceur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_ajouter_annonceur4ActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }//GEN-LAST:event_jButton_retour_ajouter_annonceur4ActionPerformed

    private void jTextField_ajouter_url_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ajouter_url_mediaActionPerformed
        
    }//GEN-LAST:event_jTextField_ajouter_url_mediaActionPerformed

    private void jButton_ajouter_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_mediaActionPerformed
         MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_ajouter_url_media.getText().equals("")){
           jLabel_message_ajouter_url_media.setVisible(true);
           erreur = false;
       } 
       if(jTextField_ajouter_poid_media.getText().equals("")){
           jLabel_message_ajouter_poid_media.setVisible(true);
           erreur = false;
       }
       
       if(erreur == true ){
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Type_Media type_media = Type_MediaDAO.TrouverType_MediaNom(cnx, jComboBox_media.getSelectedItem().toString());
            Media media = new Media(jTextField_ajouter_url_media.getText(), Integer.parseInt(jTextField_ajouter_poid_media.getText()), type_media);          
                   
            MediaDAO.CreerMedia(cnx, media);
            
            jLabel_message_ajout_media.setVisible(true);
                    
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
        
    }//GEN-LAST:event_jButton_ajouter_mediaActionPerformed

    private void jComboBox_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_mediaActionPerformed

    private void jButton_spprimer_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_spprimer_mediaActionPerformed

        MessageInvisible();

        Boolean erreur = true;

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = ""; 

        Connection cnx = null;

        if(jTextField_supprimer_media.getText().equals("")){
            jLabel_message_supprimer_id.setVisible(true);
            erreur = false;
        }

        if(erreur == true){
            try {
                cnx = DriverManager.getConnection(url, utilisateur, password);

                System.out.println("Connexion réussi !");

                Media media  = MediaDAO.TrouverMediaId(cnx, Integer.parseInt(jTextField_supprimer_media.getText()));
                if(media == null){
                    jLabel_message_supprimer_id.setVisible(true);
                } else {
                    MediaDAO.SupprimerMedia(cnx, media);
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

    }//GEN-LAST:event_jButton_spprimer_mediaActionPerformed

    private void jTextField_ajouter_poid_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ajouter_poid_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ajouter_poid_mediaActionPerformed
    
    private void MessageInvisible(){
        jLabel_message_ajout_media.setVisible(false);
        jLabel_message_ajouter_url_media.setVisible(false);
        jLabel_message_ajouter_poid_media.setVisible(false);
        jLabel_message_modifier.setVisible(false);
        jLabel_message_modifier_id.setVisible(false);
        jLabel_message_modifier_nom.setVisible(false);
        jLabel_message_rechercher_nom.setVisible(false);
        jLabel_message_supprimer_id.setVisible(false);
    }
    
    private void TextFieldBlanc(){    
        jTextField_rechercher_resultat_id.setText("");
        jTextField_modifier_id.setText("");
        jTextField_modifier_url.setText("");
        jTextField_rechercher_resultat_id_type.setText("");
        jTextField_rechercher_resultat_poids.setText("");
        jTextField_rechercher_resultat_url.setText("");
        jTextField_rechercher_url.setText("");
        jTextField_ajouter_url_media.setText("");
        jTextField_ajouter_poid_media.setText("");
        jTextField_supprimer_media.setText("");
        
   }
    
    private void RetourMenu(){   
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
        TextFieldBlanc();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_media;
    private javax.swing.JButton jButton_lister_media;
    private javax.swing.JButton jButton_modifier_media;
    private javax.swing.JButton jButton_rechercher_media;
    private javax.swing.JButton jButton_retour_ajouter_annonceur4;
    private javax.swing.JButton jButton_spprimer_media;
    public static javax.swing.JComboBox jComboBox_media;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel95;
    public static javax.swing.JLabel jLabel_message_ajout_media;
    public static javax.swing.JLabel jLabel_message_ajouter_poid_media;
    public static javax.swing.JLabel jLabel_message_ajouter_url_media;
    public static javax.swing.JLabel jLabel_message_modifier;
    public static javax.swing.JLabel jLabel_message_modifier_id;
    public static javax.swing.JLabel jLabel_message_modifier_nom;
    public static javax.swing.JLabel jLabel_message_rechercher_nom;
    public static javax.swing.JLabel jLabel_message_supprimer;
    public static javax.swing.JLabel jLabel_message_supprimer_id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    protected javax.swing.JPanel jPanel_media;
    private javax.swing.JPanel jPanel_media_supprimer;
    public static javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTable jTable_lister_media;
    private javax.swing.JTextField jTextField_ajouter_poid_media;
    private javax.swing.JTextField jTextField_ajouter_url_media;
    private javax.swing.JTextField jTextField_modifier_id;
    private javax.swing.JTextField jTextField_modifier_url;
    private javax.swing.JTextField jTextField_rechercher_resultat_id;
    private javax.swing.JTextField jTextField_rechercher_resultat_id_type;
    private javax.swing.JTextField jTextField_rechercher_resultat_poids;
    private javax.swing.JTextField jTextField_rechercher_resultat_url;
    private javax.swing.JTextField jTextField_rechercher_url;
    private javax.swing.JTextField jTextField_supprimer_media;
    // End of variables declaration//GEN-END:variables
}
