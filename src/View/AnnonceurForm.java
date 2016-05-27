/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Annonceur;
import Class.Domaine;
import Class.Information;
import ClassDAO.AnnonceurDAO;
import ClassDAO.InformationDAO;
import java.awt.CardLayout;
import java.awt.GradientPaint;
import java.io.IOException;
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
public class AnnonceurForm extends javax.swing.JPanel {

    private MaFenetrePrincipale mafenetreprincipal;

    public AnnonceurForm(MaFenetrePrincipale mafenetreprincipal) {
        this.mafenetreprincipal = mafenetreprincipal;
        initComponents();        
    }
    
   
    /**
     * Creates
     * new
     * form
     * Annonceur
     */
    public AnnonceurForm() {
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

        jPanel_annonceur = new javax.swing.JPanel();
        jTabbedPane_annonceur = new javax.swing.JTabbedPane();
        jPanel_annonceur_ajouter = new javax.swing.JPanel();
        jPanel_ajouter_information = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_ajouter_telfixe = new javax.swing.JTextField();
        jTextField_ajouter_rue = new javax.swing.JTextField();
        jTextField_ajouter_mail = new javax.swing.JTextField();
        jTextField_ajouter_telport = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField_ajouter_ville = new javax.swing.JTextField();
        jTextField_ajouter_cp = new javax.swing.JTextField();
        jTextField_ajouter_pays = new javax.swing.JTextField();
        jLabel_message_ajouter_mail = new javax.swing.JLabel();
        jLabel_message_ajouter_numfixe = new javax.swing.JLabel();
        jLabel_message_ajouter_numport = new javax.swing.JLabel();
        jLabel_message_ajouter_rue = new javax.swing.JLabel();
        jLabel_message_ajouter_ville = new javax.swing.JLabel();
        jLabel_message_ajouter_cp = new javax.swing.JLabel();
        jLabel_message_ajouter_pays = new javax.swing.JLabel();
        jPanel_ajouter_annonceur = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextFiel_ajouter_nom = new javax.swing.JTextField();
        jLabel_message_ajouter_nom = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextFiel_ajouter_password = new javax.swing.JTextField();
        jLabel_message_ajouter_password = new javax.swing.JLabel();
        jButton_ajouter_anonceur = new javax.swing.JButton();
        jLabel_message_ajout = new javax.swing.JLabel();
        jPanel_annonceur_modifier = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jTextField_modfier_identifiant = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel_message_modifier_id = new javax.swing.JLabel();
        jPanel_modifier = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jTextField_modifier_nom = new javax.swing.JTextField();
        jTextField_modifier_info = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jTextField_modifier_email = new javax.swing.JTextField();
        jTextField_modifier_tel_fixe = new javax.swing.JTextField();
        jTextField_modifier_tel_port = new javax.swing.JTextField();
        jTextField_modifier_rue = new javax.swing.JTextField();
        jTextField_modifier_ville = new javax.swing.JTextField();
        jTextField_modifier_cp = new javax.swing.JTextField();
        jTextField_modifier_pays = new javax.swing.JTextField();
        jButton_charger = new javax.swing.JButton();
        jLabel_message_modifier = new javax.swing.JLabel();
        jButton_modifier_annonceur = new javax.swing.JButton();
        jPanel_annonceur_lister = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_annonceur = new javax.swing.JTable();
        jButton_lister_annonceur = new javax.swing.JButton();
        jPanel_annonceur_rechercher = new javax.swing.JPanel();
        jButton_rechercher_annonceur = new javax.swing.JButton();
        jPanel87 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jTextField_rechercher_annonceur_nom = new javax.swing.JTextField();
        jLabel_message_rechercher_nom = new javax.swing.JLabel();
        jPanel_resultat = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_id = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_nom = new javax.swing.JTextField();
        jTextField_rechercher_resultat_id_info = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_email = new javax.swing.JTextField();
        jTextField_rechercher_resultat_telfixe = new javax.swing.JTextField();
        jTextField_rechercher_resultat_telport = new javax.swing.JTextField();
        jTextField_rechercher_resultat_rue = new javax.swing.JTextField();
        jTextField_rechercher_resultat_ville = new javax.swing.JTextField();
        jTextField_rechercher_resultat_cp = new javax.swing.JTextField();
        jTextField_rechercher_resultat_pays = new javax.swing.JTextField();
        jPanel_annonceur_supprimer = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField_supprimer_annonceur = new javax.swing.JTextField();
        jLabel_message_supprimer_id = new javax.swing.JLabel();
        jButton_spprimer_annonceur = new javax.swing.JButton();
        jLabel_message_supprimer = new javax.swing.JLabel();
        jButton_retour_annonceur = new javax.swing.JButton();

        setBackground(new java.awt.Color(14, 14, 14));

        jPanel_annonceur.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur.setPreferredSize(new java.awt.Dimension(720, 500));

        jTabbedPane_annonceur.setBackground(new java.awt.Color(14, 14, 14));

        jPanel_annonceur_ajouter.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur_ajouter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_ajouter.setForeground(new java.awt.Color(204, 0, 0));

        jPanel_ajouter_information.setBackground(new java.awt.Color(30, 30, 30));
        jPanel_ajouter_information.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_ajouter_information.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Information");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("adresse mail");

        jTextField_ajouter_telfixe.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_ajouter_telfixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ajouter_telfixeActionPerformed(evt);
            }
        });

        jTextField_ajouter_rue.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_mail.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_telport.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_ajouter_telport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ajouter_telportActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("portable");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("téléphone fixe");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("nom de rue");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("ville");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("code postal");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("pays");

        jTextField_ajouter_ville.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_cp.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_pays.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_ajouter_mail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_mail.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_mail.setText("Renseigner une adresse mail");

        jLabel_message_ajouter_numfixe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_numfixe.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_numfixe.setText("Renseigner un numéro de téléphone fixe");

        jLabel_message_ajouter_numport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_numport.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_numport.setText("Renseigner un numéro de portable");

        jLabel_message_ajouter_rue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_rue.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_rue.setText("Renseigner un nom de rue");

        jLabel_message_ajouter_ville.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_ville.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_ville.setText("Renseigner une ville");

        jLabel_message_ajouter_cp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_cp.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_cp.setText("Renseigner un code postal");

        jLabel_message_ajouter_pays.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_pays.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_pays.setText("Renseigner un pays");

        javax.swing.GroupLayout jPanel_ajouter_informationLayout = new javax.swing.GroupLayout(jPanel_ajouter_information);
        jPanel_ajouter_information.setLayout(jPanel_ajouter_informationLayout);
        jPanel_ajouter_informationLayout.setHorizontalGroup(
            jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ajouter_telport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_mail)
                    .addComponent(jLabel_message_ajouter_numport)
                    .addComponent(jLabel_message_ajouter_rue)
                    .addComponent(jLabel_message_ajouter_ville)
                    .addComponent(jLabel_message_ajouter_cp)
                    .addComponent(jLabel_message_ajouter_pays)
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_numfixe))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel_ajouter_informationLayout.setVerticalGroup(
            jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_ajouter_mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_ajouter_numfixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_telport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_ajouter_numport)
                .addGap(1, 1, 1)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel_message_ajouter_rue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jTextField_ajouter_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ajouter_informationLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel_message_ajouter_ville)
                .addGap(2, 2, 2)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_ajouter_cp)
                .addGap(1, 1, 1)
                .addGroup(jPanel_ajouter_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_pays)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_ajouter_annonceur.setBackground(new java.awt.Color(30, 30, 30));
        jPanel_ajouter_annonceur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_ajouter_annonceur.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Annonceur");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("nom annonceur");

        jTextFiel_ajouter_nom.setForeground(new java.awt.Color(51, 51, 51));
        jTextFiel_ajouter_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiel_ajouter_nomActionPerformed(evt);
            }
        });

        jLabel_message_ajouter_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_nom.setText("Renseigner un nom d'annonceur");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("mot de passe ");

        jTextFiel_ajouter_password.setForeground(new java.awt.Color(51, 51, 51));
        jTextFiel_ajouter_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFiel_ajouter_passwordActionPerformed(evt);
            }
        });

        jLabel_message_ajouter_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_password.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_password.setText("Renseigner un mot de passe");

        javax.swing.GroupLayout jPanel_ajouter_annonceurLayout = new javax.swing.GroupLayout(jPanel_ajouter_annonceur);
        jPanel_ajouter_annonceur.setLayout(jPanel_ajouter_annonceurLayout);
        jPanel_ajouter_annonceurLayout.setHorizontalGroup(
            jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFiel_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_nom)
                    .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFiel_ajouter_password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_password))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel_ajouter_annonceurLayout.setVerticalGroup(
            jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ajouter_annonceurLayout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(27, 27, 27)
                .addGroup(jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiel_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_nom)
                .addGap(18, 18, 18)
                .addGroup(jPanel_ajouter_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFiel_ajouter_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_password)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jButton_ajouter_anonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_anonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_anonceur.setText("Ajouter");
        jButton_ajouter_anonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_anonceurActionPerformed(evt);
            }
        });

        jLabel_message_ajout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_ajout.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_ajout.setText("L'ajout a bien été effectué !");

        javax.swing.GroupLayout jPanel_annonceur_ajouterLayout = new javax.swing.GroupLayout(jPanel_annonceur_ajouter);
        jPanel_annonceur_ajouter.setLayout(jPanel_annonceur_ajouterLayout);
        jPanel_annonceur_ajouterLayout.setHorizontalGroup(
            jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_annonceur_ajouterLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel_message_ajout))
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton_ajouter_anonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_ajouter_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jPanel_ajouter_information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel_annonceur_ajouterLayout.setVerticalGroup(
            jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_annonceur_ajouterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_ajouter_information, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_annonceur_ajouterLayout.createSequentialGroup()
                        .addComponent(jPanel_ajouter_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_ajouter_anonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_message_ajout)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Ajouter", jPanel_annonceur_ajouter);

        jPanel_annonceur_modifier.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur_modifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_modifier.setForeground(new java.awt.Color(153, 153, 153));

        jPanel80.setBackground(new java.awt.Color(30, 30, 30));
        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel80.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Annonceur");

        jTextField_modfier_identifiant.setForeground(new java.awt.Color(51, 51, 51));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(204, 204, 204));
        jLabel54.setText("Identifiant :");

        jLabel_message_modifier_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_id.setText("Renseigner un identifiant annonceur.");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_modfier_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_modifier_id))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addComponent(jLabel52)
                .addGap(31, 31, 31)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modfier_identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_modifier_id)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel_modifier.setBackground(new java.awt.Color(30, 30, 30));
        jPanel_modifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_modifier.setForeground(new java.awt.Color(255, 255, 255));

        jLabel96.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(204, 204, 204));
        jLabel96.setText("Résultat");

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(204, 204, 204));
        jLabel118.setText("Nom :");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(204, 204, 204));
        jLabel119.setText("Identifiant information:");

        jTextField_modifier_nom.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_modifier_info.setForeground(new java.awt.Color(51, 51, 51));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(204, 204, 204));
        jLabel120.setText("Email :");

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(204, 204, 204));
        jLabel121.setText("Téléphone fixe :");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(204, 204, 204));
        jLabel122.setText("Téléphone portable :");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(204, 204, 204));
        jLabel123.setText("Rue :");

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(204, 204, 204));
        jLabel124.setText("Ville :");

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(204, 204, 204));
        jLabel125.setText("Code postal :");

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(204, 204, 204));
        jLabel126.setText("Pays :");

        jTextField_modifier_email.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_modifier_tel_fixe.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_modifier_tel_port.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_modifier_rue.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_modifier_ville.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_modifier_cp.setForeground(new java.awt.Color(51, 51, 51));
        jTextField_modifier_cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_modifier_cpActionPerformed(evt);
            }
        });

        jTextField_modifier_pays.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_modifierLayout = new javax.swing.GroupLayout(jPanel_modifier);
        jPanel_modifier.setLayout(jPanel_modifierLayout);
        jPanel_modifierLayout.setHorizontalGroup(
            jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_modifierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addGroup(jPanel_modifierLayout.createSequentialGroup()
                        .addComponent(jLabel118)
                        .addGap(110, 110, 110)
                        .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_modifierLayout.createSequentialGroup()
                        .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121)
                            .addComponent(jLabel122)
                            .addComponent(jLabel123)
                            .addComponent(jLabel124)
                            .addComponent(jLabel125)
                            .addComponent(jLabel126))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_modifier_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_tel_port, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_tel_fixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_info, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel_modifierLayout.setVerticalGroup(
            jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_modifierLayout.createSequentialGroup()
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_tel_fixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_tel_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_modifier_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_charger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_charger.setForeground(new java.awt.Color(51, 51, 51));
        jButton_charger.setText("Charger");
        jButton_charger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_chargerActionPerformed(evt);
            }
        });

        jLabel_message_modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_modifier.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_modifier.setText("La modification à bien été effectué !");

        jButton_modifier_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_annonceur.setText("Modifier");
        jButton_modifier_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceur_modifierLayout = new javax.swing.GroupLayout(jPanel_annonceur_modifier);
        jPanel_annonceur_modifier.setLayout(jPanel_annonceur_modifierLayout);
        jPanel_annonceur_modifierLayout.setHorizontalGroup(
            jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_modifier_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_charger, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel_message_modifier))
                    .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel_annonceur_modifierLayout.setVerticalGroup(
            jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel_annonceur_modifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_annonceur_modifierLayout.createSequentialGroup()
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton_charger, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_modifier_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_message_modifier)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Modifier", jPanel_annonceur_modifier);

        jPanel_annonceur_lister.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur_lister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_lister.setForeground(new java.awt.Color(153, 153, 153));

        jPanel82.setBackground(new java.awt.Color(30, 30, 30));
        jPanel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel82.setForeground(new java.awt.Color(255, 255, 255));

        jLabel85.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("Annonceur");

        jTable_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jTable_annonceur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant annonceur", "Nom annonceur", "Identifiant information", "Email", "Téléphone fixe", "Téléphone portable", "Rue", "Ville", "Code Postal", "Pays"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_annonceur);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addGap(573, 573, 573))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_lister_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_lister_annonceur.setText("Lister");
        jButton_lister_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceur_listerLayout = new javax.swing.GroupLayout(jPanel_annonceur_lister);
        jPanel_annonceur_lister.setLayout(jPanel_annonceur_listerLayout);
        jPanel_annonceur_listerLayout.setHorizontalGroup(
            jPanel_annonceur_listerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_listerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jButton_lister_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_annonceur_listerLayout.setVerticalGroup(
            jPanel_annonceur_listerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_listerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jButton_lister_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Lister", jPanel_annonceur_lister);

        jPanel_annonceur_rechercher.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur_rechercher.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_rechercher.setForeground(new java.awt.Color(153, 153, 153));

        jButton_rechercher_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_rechercher_annonceur.setText("Rechercher");
        jButton_rechercher_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_annonceurActionPerformed(evt);
            }
        });

        jPanel87.setBackground(new java.awt.Color(30, 30, 30));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel87.setForeground(new java.awt.Color(255, 255, 255));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Annonceur");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 204, 204));
        jLabel108.setText("Recherche par nom :");

        jTextField_rechercher_annonceur_nom.setForeground(new java.awt.Color(51, 51, 51));

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
                        .addComponent(jTextField_rechercher_annonceur_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_rechercher_nom))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addComponent(jLabel107)
                .addGap(12, 12, 12)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_annonceur_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_rechercher_nom)
                .addContainerGap(22, Short.MAX_VALUE))
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

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(204, 204, 204));
        jLabel105.setText("Identifiant information:");

        jTextField_rechercher_resultat_nom.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_id_info.setForeground(new java.awt.Color(51, 51, 51));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setText("Email :");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(204, 204, 204));
        jLabel109.setText("Téléphone fixe :");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(204, 204, 204));
        jLabel110.setText("Téléphone portable :");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(204, 204, 204));
        jLabel111.setText("Rue :");

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(204, 204, 204));
        jLabel114.setText("Ville :");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(204, 204, 204));
        jLabel115.setText("Code postal :");

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(204, 204, 204));
        jLabel116.setText("Pays :");

        jTextField_rechercher_resultat_email.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_telfixe.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_telport.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_rue.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_ville.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_cp.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_pays.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_resultatLayout = new javax.swing.GroupLayout(jPanel_resultat);
        jPanel_resultat.setLayout(jPanel_resultatLayout);
        jPanel_resultatLayout.setHorizontalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103)
                            .addComponent(jLabel104))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109)
                            .addComponent(jLabel110)
                            .addComponent(jLabel111)
                            .addComponent(jLabel114)
                            .addComponent(jLabel115)
                            .addComponent(jLabel116))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_rechercher_resultat_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_telport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_id_info, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_resultatLayout.setVerticalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_id_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_telport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_annonceur_rechercherLayout = new javax.swing.GroupLayout(jPanel_annonceur_rechercher);
        jPanel_annonceur_rechercher.setLayout(jPanel_annonceur_rechercherLayout);
        jPanel_annonceur_rechercherLayout.setHorizontalGroup(
            jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton_rechercher_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel_annonceur_rechercherLayout.setVerticalGroup(
            jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_annonceur_rechercherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_annonceur_rechercherLayout.createSequentialGroup()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_rechercher_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Rechercher", jPanel_annonceur_rechercher);

        jPanel_annonceur_supprimer.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_annonceur_supprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_annonceur_supprimer.setForeground(new java.awt.Color(153, 153, 153));

        jPanel86.setBackground(new java.awt.Color(30, 30, 30));
        jPanel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel86.setForeground(new java.awt.Color(255, 255, 255));

        jLabel112.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setText("Annonceur");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("Id de l'annonceur :");

        jTextField_supprimer_annonceur.setForeground(new java.awt.Color(51, 51, 51));

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
                        .addComponent(jTextField_supprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField_supprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_supprimer_id)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jButton_spprimer_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_spprimer_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_spprimer_annonceur.setText("Supprimer");
        jButton_spprimer_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_spprimer_annonceurActionPerformed(evt);
            }
        });

        jLabel_message_supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_supprimer.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_supprimer.setText("L'annonceur à bien été supprimé !");

        javax.swing.GroupLayout jPanel_annonceur_supprimerLayout = new javax.swing.GroupLayout(jPanel_annonceur_supprimer);
        jPanel_annonceur_supprimer.setLayout(jPanel_annonceur_supprimerLayout);
        jPanel_annonceur_supprimerLayout.setHorizontalGroup(
            jPanel_annonceur_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_annonceur_supprimerLayout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                .addGroup(jPanel_annonceur_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel_message_supprimer))
                    .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton_spprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_annonceur_supprimerLayout.setVerticalGroup(
            jPanel_annonceur_supprimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceur_supprimerLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton_spprimer_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_supprimer)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane_annonceur.addTab("Supprimer", jPanel_annonceur_supprimer);

        jButton_retour_annonceur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_retour_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_retour_annonceur.setText("Retour");
        jButton_retour_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_annonceurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_annonceurLayout = new javax.swing.GroupLayout(jPanel_annonceur);
        jPanel_annonceur.setLayout(jPanel_annonceurLayout);
        jPanel_annonceurLayout.setHorizontalGroup(
            jPanel_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_annonceurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_retour_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel_annonceurLayout.setVerticalGroup(
            jPanel_annonceurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_annonceurLayout.createSequentialGroup()
                .addComponent(jTabbedPane_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_retour_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_annonceur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_annonceur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ajouter_anonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_anonceurActionPerformed

        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";        
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextFiel_ajouter_nom.getText().equals("")){
           jLabel_message_ajouter_nom.setVisible(true);
           erreur = false;
       } 
       
       if(jTextFiel_ajouter_password.getText().equals("")){
           jLabel_message_ajouter_password.setVisible(true);
           erreur = false;
       } 
       
       if(jTextField_ajouter_mail.getText().equals("")){
           jLabel_message_ajouter_mail.setVisible(true);
           erreur = false;
       } 
       if(jTextField_ajouter_cp.getText().equals("")){
           jLabel_message_ajouter_cp.setVisible(true);
           erreur = false;
       } 
       if(jTextField_ajouter_telfixe.getText().equals("")){
           jLabel_message_ajouter_numfixe.setVisible(true);
           erreur = false;
       } 
       if(jTextField_ajouter_telport.getText().equals("")){
           jLabel_message_ajouter_numport.setVisible(true);
           erreur = false;
       } 
        if(jTextField_ajouter_pays.getText().equals("")){
           jLabel_message_ajouter_pays.setVisible(true);
           erreur = false;
       }
         if(jTextField_ajouter_rue.getText().equals("")){
           jLabel_message_ajouter_rue.setVisible(true);
           erreur = false;
       }
          if(jTextField_ajouter_ville.getText().equals("")){
           jLabel_message_ajouter_ville.setVisible(true);
           erreur = false;
           
       }
       
       
       if (erreur == true){
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            int level_information = 1;
            
            Information information = new Information(jTextField_ajouter_mail.getText(),Integer.parseInt(jTextField_ajouter_telfixe.getText()), Integer.parseInt(jTextField_ajouter_telport.getText()), jTextField_ajouter_rue.getText(), jTextField_ajouter_ville.getText(), Integer.parseInt(jTextField_ajouter_cp.getText()), jTextField_ajouter_pays.getText());          
            information.setPassword_information(jTextFiel_ajouter_password.getText());
            information.setLevel_information(level_information);
            Annonceur annonceur = new Annonceur(jTextFiel_ajouter_nom.getText(), information);
           
            AnnonceurDAO.CreerAnnonceur(cnx, annonceur);
            
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
    }//GEN-LAST:event_jButton_ajouter_anonceurActionPerformed

    private void jButton_retour_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_annonceurActionPerformed
       RetourMenu();
    }//GEN-LAST:event_jButton_retour_annonceurActionPerformed

    private void jButton_modifier_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_annonceurActionPerformed
          
        MessageInvisible();
        
       String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
       if(jTextField_modfier_identifiant.getText().equals("")){
           jLabel_message_modifier_id.setVisible(true);
       } 
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Information information = null;          
            Annonceur annonceur =  new Annonceur(jTextField_modifier_nom.getText(), information);         
            annonceur.setId_anonceur(Integer.parseInt(jTextField_modfier_identifiant.getText()));
            
            AnnonceurDAO.ModifierAnnonceur(cnx, annonceur);
            
            jLabel_message_modifier.setVisible(true);
            TextFieldBlanc();
            jPanel_modifier.setVisible(false);
            jButton_charger.setVisible(true);
            jButton_modifier_annonceur.setVisible(false);
            
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
        
    }//GEN-LAST:event_jButton_modifier_annonceurActionPerformed

    private void jButton_lister_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_annonceurActionPerformed
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";         
        int i = 0;
        Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
   
            DefaultTableModel model = (DefaultTableModel) jTable_annonceur.getModel();
            model.setRowCount(0);
            AnnonceurDAO annonceurDAO = new AnnonceurDAO();
            Collection<Annonceur> annonceurs = AnnonceurDAO.ListerAnonceur(cnx);
            
            
            for (Annonceur a : annonceurs){
                model.addRow(new Object[] {
                    a.getId_anonceur(),
                    a.getNom_annonceur(),
                    a.getInformation().getId_information(),
                    a.getInformation().getMail_information(),
                    a.getInformation().getTel_fixe_information(),
                    a.getInformation().getTel_port_information(),
                    a.getInformation().getRue_information(),
                    a.getInformation().getVille_information(),
                    a.getInformation().getCp_information(),
                    a.getInformation().getPays_information()
                
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
       
    }//GEN-LAST:event_jButton_lister_annonceurActionPerformed

    private void jButton_rechercher_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_annonceurActionPerformed
        
         MessageInvisible();
            
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
             
           
            
            System.out.println("Connexion réussi !"); 
            
            Annonceur annonceur = AnnonceurDAO.TrouverAnnonceurNom(cnx, jTextField_rechercher_annonceur_nom.getText());
            
             if(jTextField_rechercher_annonceur_nom.getText().equals("")){
                 jLabel_message_rechercher_nom.setVisible(true);               
              } 
             if(annonceur != null){
                  jPanel_resultat.setVisible(true);
                  jTextField_rechercher_resultat_id.setText(Long.toString(annonceur.getId_anonceur()));
                  jTextField_rechercher_resultat_nom.setText(jTextField_rechercher_annonceur_nom.getText());
                  jTextField_rechercher_resultat_id_info.setText(Long.toString(annonceur.getInformation().getId_information()));
                  jTextField_rechercher_resultat_email.setText(annonceur.getInformation().getMail_information());
                  jTextField_rechercher_resultat_telfixe.setText(Long.toString(annonceur.getInformation().getTel_fixe_information()));
                  jTextField_rechercher_resultat_telport.setText(Long.toString(annonceur.getInformation().getTel_port_information()));
                  jTextField_rechercher_resultat_rue.setText(annonceur.getInformation().getRue_information());
                  jTextField_rechercher_resultat_ville.setText(annonceur.getInformation().getVille_information());
                  jTextField_rechercher_resultat_cp.setText(Long.toString(annonceur.getInformation().getCp_information()));
                  jTextField_rechercher_resultat_pays.setText(annonceur.getInformation().getPays_information());
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
    }//GEN-LAST:event_jButton_rechercher_annonceurActionPerformed

    private void jButton_spprimer_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_spprimer_annonceurActionPerformed
   
         MessageInvisible();
        
        Boolean erreur = true;
         
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";       
       
       Connection cnx = null;             
       
       
       if(jTextField_supprimer_annonceur.getText().equals("")){
           jLabel_message_supprimer_id.setVisible(true);
           erreur = false;
       }
       
       if(erreur == true){
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Annonceur annonceur  = AnnonceurDAO.TrouverAnnonceurId(cnx, Integer.parseInt(jTextField_supprimer_annonceur.getText()));
            if(annonceur == null){
                jLabel_message_supprimer_id.setVisible(true);
            } else {
                AnnonceurDAO.SupprimerAnnonceur(cnx, annonceur);        
                jLabel_message_supprimer.setVisible(true);
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
        
    }//GEN-LAST:event_jButton_spprimer_annonceurActionPerformed
    private void MessageInvisible(){
        AnnonceurForm.jLabel_message_ajout.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_cp.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_mail.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_nom.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_numfixe.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_numport.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_pays.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_rue.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_ville.setVisible(false);
        AnnonceurForm.jPanel_resultat.setVisible(false);
        AnnonceurForm.jButton_modifier_annonceur.setVisible(false);
        AnnonceurForm.jLabel_message_modifier_id.setVisible(false); 
        AnnonceurForm.jLabel_message_modifier.setVisible(false);
        AnnonceurForm.jLabel_message_rechercher_nom.setVisible(false);
        AnnonceurForm.jLabel_message_supprimer_id.setVisible(false);
        AnnonceurForm.jLabel_message_supprimer.setVisible(false);
    }
    private void TextFieldBlanc(){
        jTextFiel_ajouter_nom.setText("");
        jTextField_ajouter_mail.setText("");
        jTextField_ajouter_telfixe.setText("");
        jTextField_ajouter_telport.setText("");
        jTextField_ajouter_rue.setText("");
        jTextField_ajouter_ville.setText("");
        jTextField_ajouter_cp.setText("");
        jTextField_ajouter_pays.setText("");
        jTextField_modfier_identifiant.setText("");
        jTextField_modifier_nom.setText("");
        jTextField_rechercher_annonceur_nom.setText("");
        jTextField_rechercher_resultat_cp.setText("");
        jTextField_rechercher_resultat_email.setText("");
        jTextField_rechercher_resultat_id.setText("");
        jTextField_rechercher_resultat_id_info.setText("");
        jTextField_rechercher_resultat_nom.setText("");
        jTextField_rechercher_resultat_pays.setText(""); 
        jTextField_rechercher_resultat_rue.setText("");
        jTextField_rechercher_resultat_telfixe.setText("");
        jTextField_rechercher_resultat_telport.setText("");
        jTextField_rechercher_resultat_ville.setText("");
        jTextField_supprimer_annonceur.setText("");
   }
    
    private void RetourMenu(){
        TextFieldBlanc();
        jTable_annonceur.getModel().removeTableModelListener(jTable_annonceur);
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }
    
    private void jTextField_ajouter_telfixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ajouter_telfixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ajouter_telfixeActionPerformed

    private void jTextField_ajouter_telportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ajouter_telportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ajouter_telportActionPerformed

    private void jTextFiel_ajouter_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiel_ajouter_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiel_ajouter_nomActionPerformed

    private void jButton_chargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_chargerActionPerformed
        MessageInvisible();
            
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null; 
       
       Boolean erreur = true;
       
       if (jTextField_modfier_identifiant.getText().equals("")){
           jLabel_message_modifier_id.setVisible(true);
           erreur = false;
       }
       
       if(erreur == true ){
            try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
             
           
            
            System.out.println("Connexion réussi !"); 
            
            Annonceur annonceur = AnnonceurDAO.TrouverAnnonceurId(cnx, Long.parseLong(jTextField_modfier_identifiant.getText()));
            
             if(jTextField_rechercher_annonceur_nom.getText().equals("")){
                 jLabel_message_rechercher_nom.setVisible(true);               
              } 
             if(annonceur != null){
                  jPanel_modifier.setVisible(true); 
                  jButton_modifier_annonceur.setVisible(true);
                  jTextField_modifier_nom.setText(annonceur.getNom_annonceur());
                  jTextField_modifier_cp.setText(Long.toString(annonceur.getInformation().getCp_information()));
                  jTextField_modifier_email.setText(annonceur.getInformation().getMail_information());
                  jTextField_modifier_tel_fixe.setText(Long.toString(annonceur.getInformation().getTel_fixe_information()));
                  jTextField_modifier_tel_port.setText(Long.toString(annonceur.getInformation().getTel_port_information()));
                  jTextField_modifier_rue.setText(annonceur.getInformation().getRue_information());
                  jTextField_modifier_ville.setText(annonceur.getInformation().getVille_information());
                  jTextField_modifier_info.setText(Long.toString(annonceur.getInformation().getId_information()));
                  jTextField_modifier_pays.setText(annonceur.getInformation().getPays_information()); 
                  jButton_charger.setVisible(false);
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
       
       
    }//GEN-LAST:event_jButton_chargerActionPerformed

    private void jTextField_modifier_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_modifier_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_modifier_cpActionPerformed

    private void jTextFiel_ajouter_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFiel_ajouter_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFiel_ajouter_passwordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_anonceur;
    public static javax.swing.JButton jButton_charger;
    private javax.swing.JButton jButton_lister_annonceur;
    public static javax.swing.JButton jButton_modifier_annonceur;
    private javax.swing.JButton jButton_rechercher_annonceur;
    private javax.swing.JButton jButton_retour_annonceur;
    private javax.swing.JButton jButton_spprimer_annonceur;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    public static javax.swing.JLabel jLabel_message_ajout;
    public static javax.swing.JLabel jLabel_message_ajouter_cp;
    public static javax.swing.JLabel jLabel_message_ajouter_mail;
    public static javax.swing.JLabel jLabel_message_ajouter_nom;
    public static javax.swing.JLabel jLabel_message_ajouter_numfixe;
    public static javax.swing.JLabel jLabel_message_ajouter_numport;
    public static javax.swing.JLabel jLabel_message_ajouter_password;
    public static javax.swing.JLabel jLabel_message_ajouter_pays;
    public static javax.swing.JLabel jLabel_message_ajouter_rue;
    public static javax.swing.JLabel jLabel_message_ajouter_ville;
    public static javax.swing.JLabel jLabel_message_modifier;
    public static javax.swing.JLabel jLabel_message_modifier_id;
    public static javax.swing.JLabel jLabel_message_rechercher_nom;
    public static javax.swing.JLabel jLabel_message_supprimer;
    public static javax.swing.JLabel jLabel_message_supprimer_id;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel_ajouter_annonceur;
    private javax.swing.JPanel jPanel_ajouter_information;
    protected javax.swing.JPanel jPanel_annonceur;
    private javax.swing.JPanel jPanel_annonceur_ajouter;
    private javax.swing.JPanel jPanel_annonceur_lister;
    private javax.swing.JPanel jPanel_annonceur_modifier;
    private javax.swing.JPanel jPanel_annonceur_rechercher;
    private javax.swing.JPanel jPanel_annonceur_supprimer;
    public static javax.swing.JPanel jPanel_modifier;
    public static javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane_annonceur;
    public static javax.swing.JTable jTable_annonceur;
    private javax.swing.JTextField jTextFiel_ajouter_nom;
    private javax.swing.JTextField jTextFiel_ajouter_password;
    private javax.swing.JTextField jTextField_ajouter_cp;
    private javax.swing.JTextField jTextField_ajouter_mail;
    private javax.swing.JTextField jTextField_ajouter_pays;
    private javax.swing.JTextField jTextField_ajouter_rue;
    private javax.swing.JTextField jTextField_ajouter_telfixe;
    private javax.swing.JTextField jTextField_ajouter_telport;
    private javax.swing.JTextField jTextField_ajouter_ville;
    private javax.swing.JTextField jTextField_modfier_identifiant;
    private javax.swing.JTextField jTextField_modifier_cp;
    private javax.swing.JTextField jTextField_modifier_email;
    private javax.swing.JTextField jTextField_modifier_info;
    private javax.swing.JTextField jTextField_modifier_nom;
    private javax.swing.JTextField jTextField_modifier_pays;
    private javax.swing.JTextField jTextField_modifier_rue;
    private javax.swing.JTextField jTextField_modifier_tel_fixe;
    private javax.swing.JTextField jTextField_modifier_tel_port;
    private javax.swing.JTextField jTextField_modifier_ville;
    private javax.swing.JTextField jTextField_rechercher_annonceur_nom;
    private javax.swing.JTextField jTextField_rechercher_resultat_cp;
    private javax.swing.JTextField jTextField_rechercher_resultat_email;
    private javax.swing.JTextField jTextField_rechercher_resultat_id;
    private javax.swing.JTextField jTextField_rechercher_resultat_id_info;
    private javax.swing.JTextField jTextField_rechercher_resultat_nom;
    private javax.swing.JTextField jTextField_rechercher_resultat_pays;
    private javax.swing.JTextField jTextField_rechercher_resultat_rue;
    private javax.swing.JTextField jTextField_rechercher_resultat_telfixe;
    private javax.swing.JTextField jTextField_rechercher_resultat_telport;
    private javax.swing.JTextField jTextField_rechercher_resultat_ville;
    private javax.swing.JTextField jTextField_supprimer_annonceur;
    // End of variables declaration//GEN-END:variables
}
