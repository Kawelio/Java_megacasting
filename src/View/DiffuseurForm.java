/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Annonceur;
import Class.Diffuseur;
import Class.Information;
import ClassDAO.AnnonceurDAO;
import ClassDAO.DiffuseurDAO;
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
public class DiffuseurForm extends javax.swing.JPanel {

     private MaFenetrePrincipale mafenetreprincipal;

    public DiffuseurForm(MaFenetrePrincipale mafenetreprincipal) {
        this.mafenetreprincipal = mafenetreprincipal;
         initComponents();
    }
     
     
    /**
     * Creates
     * new
     * form
     * Diffuseur
     */
    public DiffuseurForm() {
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

        jPanel_diffuseur = new javax.swing.JPanel();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
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
        jLabel_message_ajouter_numfixe = new javax.swing.JLabel();
        jLabel_message_ajouter_mail = new javax.swing.JLabel();
        jLabel_message_ajouter_numport = new javax.swing.JLabel();
        jLabel_message_ajouter_rue = new javax.swing.JLabel();
        jLabel_message_ajouter_ville = new javax.swing.JLabel();
        jLabel_message_ajouter_cp = new javax.swing.JLabel();
        jLabel_message_ajouter_pays = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField_ajouter_nom = new javax.swing.JTextField();
        jLabel_message_ajouter_nom = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField_ajouter_password = new javax.swing.JTextField();
        jLabel_message_ajouter_password = new javax.swing.JLabel();
        jButton_ajouter_diffuseur = new javax.swing.JButton();
        jLabel_message_ajout = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton_modifier_diffuseur = new javax.swing.JButton();
        jLabel_message_modifier = new javax.swing.JLabel();
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
        jPanel80 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jTextField_modfier_identifiant = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel_message_modifier_id = new javax.swing.JLabel();
        jButton_charger = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_diffuseur = new javax.swing.JTable();
        jButton_lister_diffuseur = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton_rechercher_diffuseur = new javax.swing.JButton();
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
        jPanel18 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField_supprimer_diffuseur = new javax.swing.JTextField();
        jLabel_message_supprimer_id = new javax.swing.JLabel();
        jButton_supprimer_diffuseur = new javax.swing.JButton();
        jLabel_message_supprimer = new javax.swing.JLabel();
        jButton_retour_diffuseur = new javax.swing.JButton();

        setBackground(new java.awt.Color(14, 14, 14));

        jPanel_diffuseur.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_diffuseur.setPreferredSize(new java.awt.Dimension(720, 500));

        jTabbedPane22.setBackground(new java.awt.Color(14, 14, 14));

        jPanel3.setBackground(new java.awt.Color(14, 14, 14));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jPanel49.setBackground(new java.awt.Color(30, 30, 30));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel49.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Information");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("adresse mail");

        jTextField_ajouter_telfixe.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_rue.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_mail.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_ajouter_telport.setForeground(new java.awt.Color(51, 51, 51));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("téléphone  portable");

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

        jLabel_message_ajouter_numfixe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_numfixe.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_numfixe.setText("Renseigner un numéro fixe.");

        jLabel_message_ajouter_mail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_mail.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_mail.setText("Renseigner une adresse mail");

        jLabel_message_ajouter_numport.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_numport.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_numport.setText("Renseigner un numéro portable.");

        jLabel_message_ajouter_rue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_rue.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_rue.setText("Renseigner une adresse mail");

        jLabel_message_ajouter_ville.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_ville.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_ville.setText("Renseigner une adresse mail");

        jLabel_message_ajouter_cp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_cp.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_cp.setText("Renseigner une adresse mail");

        jLabel_message_ajouter_pays.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_pays.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_pays.setText("Renseigner une adresse mail");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel_message_ajouter_mail)
                    .addComponent(jLabel_message_ajouter_numfixe)
                    .addComponent(jLabel_message_ajouter_numport)
                    .addComponent(jLabel_message_ajouter_rue)
                    .addComponent(jLabel_message_ajouter_ville)
                    .addComponent(jLabel_message_ajouter_cp)
                    .addComponent(jLabel_message_ajouter_pays)
                    .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(19, 19, 19)
                            .addComponent(jTextField_ajouter_telport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_ajouter_mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel_message_ajouter_numfixe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ajouter_telport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel_message_ajouter_numport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_rue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel_message_ajouter_rue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel_message_ajouter_ville)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel_message_ajouter_cp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField_ajouter_pays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel_message_ajouter_pays))
        );

        jPanel50.setBackground(new java.awt.Color(30, 30, 30));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel50.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Diffuseur");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("mot de passe");

        jTextField_ajouter_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_ajouter_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_nom.setText("Renseigner un nom de diffuseur valide.");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("nom diffuseur");

        jTextField_ajouter_password.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_ajouter_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_password.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_password.setText("Renseigner un mot de passe pour le diffuseur.");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_nom)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_ajouter_password))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ajouter_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_nom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ajouter_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_ajouter_password)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jButton_ajouter_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_diffuseur.setText("Ajouter");
        jButton_ajouter_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_diffuseurActionPerformed(evt);
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton_ajouter_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel_message_ajout))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton_ajouter_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_message_ajout)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Ajouter", jPanel3);

        jPanel15.setBackground(new java.awt.Color(14, 14, 14));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel15.setForeground(new java.awt.Color(153, 153, 153));

        jButton_modifier_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_diffuseur.setText("Modifier");
        jButton_modifier_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_diffuseurActionPerformed(evt);
            }
        });

        jLabel_message_modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_modifier.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_modifier.setText("La modification à bien été effectué !");

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
                .addContainerGap(83, Short.MAX_VALUE))
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

        jPanel80.setBackground(new java.awt.Color(30, 30, 30));
        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel80.setForeground(new java.awt.Color(255, 255, 255));

        jLabel52.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Diffuseur");

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
                .addGap(3, 3, 3)
                .addComponent(jLabel_message_modifier_id)
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

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_charger, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_modifier_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel_message_modifier)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_modifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton_charger, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_modifier_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_message_modifier)))
                .addContainerGap(95, Short.MAX_VALUE))
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
        jLabel85.setText("Diffuseur");

        jTable_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jTable_diffuseur.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant diffuseur", "Nom diffuseur", "Identifiant information", "Email", "Téléphone fixe", "Téléphone portable", "Rue", "Ville", "Code Postal", "Pays"
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
        jScrollPane1.setViewportView(jTable_diffuseur);

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85)
                .addGap(587, 587, 587))
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

        jButton_lister_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_lister_diffuseur.setText("Lister");
        jButton_lister_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_diffuseurActionPerformed(evt);
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
                        .addGap(256, 256, 256)
                        .addComponent(jButton_lister_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton_lister_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane22.addTab("Lister", jPanel16);

        jPanel17.setBackground(new java.awt.Color(14, 14, 14));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jButton_rechercher_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_rechercher_diffuseur.setText("Rechercher");
        jButton_rechercher_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_diffuseurActionPerformed(evt);
            }
        });

        jPanel87.setBackground(new java.awt.Color(30, 30, 30));
        jPanel87.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel87.setForeground(new java.awt.Color(255, 255, 255));

        jLabel107.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 204, 204));
        jLabel107.setText("Diffuseur");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 204, 204));
        jLabel108.setText("Recherche par nom :");

        jTextField_rechercher_nom.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_rechercher_nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_rechercher_nom.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_rechercher_nom.setText("Renseigner un nom de diffuseur valide.");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_rechercher_nom)
                .addContainerGap())
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel105)
                                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel109))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_rechercher_resultat_telfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_id_info, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel110)
                                    .addComponent(jLabel111)
                                    .addComponent(jLabel114)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel116))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_rechercher_resultat_pays, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_rue, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_rechercher_resultat_telport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        jPanel_resultatLayout.setVerticalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_rechercher_resultat_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_rechercher_resultat_id_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton_rechercher_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jButton_rechercher_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
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
        jLabel112.setText("Diffuseur");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("Id du diffuseur :");

        jTextField_supprimer_diffuseur.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_supprimer_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_supprimer_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_supprimer_id.setText("Renseigner un identifiant de diffuseur.");

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
                        .addComponent(jTextField_supprimer_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField_supprimer_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_message_supprimer_id)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jButton_supprimer_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_supprimer_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_supprimer_diffuseur.setText("Supprimer");
        jButton_supprimer_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_supprimer_diffuseurActionPerformed(evt);
            }
        });

        jLabel_message_supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_supprimer.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_supprimer.setText("La suppression a bien été effectué !");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_supprimer_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_supprimer)
                .addGap(220, 220, 220))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_supprimer_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_supprimer)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Supprimer", jPanel18);

        jButton_retour_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_retour_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_retour_diffuseur.setText("Retour");
        jButton_retour_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retour_diffuseurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_diffuseurLayout = new javax.swing.GroupLayout(jPanel_diffuseur);
        jPanel_diffuseur.setLayout(jPanel_diffuseurLayout);
        jPanel_diffuseurLayout.setHorizontalGroup(
            jPanel_diffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_diffuseurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_diffuseurLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_retour_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );
        jPanel_diffuseurLayout.setVerticalGroup(
            jPanel_diffuseurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_diffuseurLayout.createSequentialGroup()
                .addComponent(jTabbedPane22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_retour_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_diffuseur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_diffuseur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ajouter_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_diffuseurActionPerformed
       
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                
       
        Boolean erreur = true;
        
       Connection cnx = null;             
       
       if(jTextField_ajouter_nom.getText().equals("")){
           jLabel_message_ajouter_nom.setVisible(true);
           erreur = false;
       } 
       
       if(jTextField_ajouter_password.getText().equals("")){
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
          
          if  (erreur == true){
               try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !");
            
            int level_information = 2; //2 correspond au diffuseur.
            
            Information information = new Information(jTextField_ajouter_mail.getText(),Integer.parseInt(jTextField_ajouter_telfixe.getText()), Integer.parseInt(jTextField_ajouter_telport.getText()), jTextField_ajouter_rue.getText(), jTextField_ajouter_ville.getText(), Integer.parseInt(jTextField_ajouter_cp.getText()), jTextField_ajouter_pays.getText());          
            information.setLevel_information(level_information);
            information.setPassword_information(jTextField_ajouter_password.getText());
            Diffuseur diffuseur = new Diffuseur(jTextField_ajouter_nom.getText(), information);
                   
            DiffuseurDAO.CreerDiffuseur(cnx, diffuseur);
            
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
        
    }//GEN-LAST:event_jButton_ajouter_diffuseurActionPerformed

    private void jButton_modifier_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_diffuseurActionPerformed
        
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";        
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Information information = null;          
            Diffuseur diffuseur =  new Diffuseur(jTextField_modifier_nom.getText(), information);         
            diffuseur.setId_diffuseur(Integer.parseInt(jTextField_modfier_identifiant.getText()));
            
            DiffuseurDAO.ModifierDiffuseur(cnx, diffuseur);
            
            jLabel_message_modifier.setVisible(true);
            TextFieldBlanc();
            jPanel_modifier.setVisible(false);
            jButton_charger.setVisible(true);
            jButton_modifier_diffuseur.setVisible(false);
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
        
        
    }//GEN-LAST:event_jButton_modifier_diffuseurActionPerformed

    private void jButton_lister_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_diffuseurActionPerformed
       
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";          
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
             
            DefaultTableModel model = (DefaultTableModel) jTable_diffuseur.getModel();
            model.setRowCount(0);
            DiffuseurDAO diffuseurDAO = new DiffuseurDAO();
            Collection<Diffuseur> diffuseurs = DiffuseurDAO.ListerDiffuseur(cnx);


            for (Diffuseur d : diffuseurs){
                model.addRow(new Object[] {
                    d.getId_diffuseur(),
                    d.getNom_diffuseur(),
                    d.getInformation().getId_information(),
                    d.getInformation().getMail_information(),
                    d.getInformation().getTel_fixe_information(),
                    d.getInformation().getTel_port_information(),
                    d.getInformation().getRue_information(),
                    d.getInformation().getVille_information(),
                    d.getInformation().getCp_information(),
                    d.getInformation().getPays_information()
                
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
       
    }//GEN-LAST:event_jButton_lister_diffuseurActionPerformed

    private void jButton_rechercher_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_diffuseurActionPerformed
        
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";         
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Diffuseur diffuseur = DiffuseurDAO.TrouverDiffuseurNom(cnx, jTextField_rechercher_nom.getText());
            
            if(jTextField_rechercher_nom.getText().equals("")){
                 jLabel_message_rechercher_nom.setVisible(true);               
              } 
             if(diffuseur != null){
            jPanel_resultat.setVisible(true);
            jTextField_rechercher_resultat_id.setText(Long.toString(diffuseur.getId_diffuseur()));
            jTextField_rechercher_resultat_nom.setText(diffuseur.getNom_diffuseur());
            jTextField_rechercher_resultat_id_info.setText(Long.toString(diffuseur.getInformation().getId_information()));
            jTextField_rechercher_resultat_email.setText(diffuseur.getInformation().getMail_information());
            jTextField_rechercher_resultat_telfixe.setText(Long.toString(diffuseur.getInformation().getTel_fixe_information()));
            jTextField_rechercher_resultat_telport.setText(Long.toString(diffuseur.getInformation().getTel_port_information()));
            jTextField_rechercher_resultat_rue.setText(diffuseur.getInformation().getRue_information());
            jTextField_rechercher_resultat_ville.setText(diffuseur.getInformation().getVille_information());
            jTextField_rechercher_resultat_cp.setText(Long.toString(diffuseur.getInformation().getCp_information()));
            jTextField_rechercher_resultat_pays.setText(diffuseur.getInformation().getPays_information());
             } else {
                 jLabel_message_rechercher_nom.setVisible(true);      
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
    }//GEN-LAST:event_jButton_rechercher_diffuseurActionPerformed

    private void jButton_supprimer_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_supprimer_diffuseurActionPerformed
        
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";         
       
       Connection cnx = null;   
       
       Boolean erreur = true;
       
       if(jTextField_supprimer_diffuseur.getText().equals("")){
           jLabel_message_supprimer_id.setVisible(true);
           erreur = false;
       }
       
       if(erreur == true){
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Diffuseur diffuseur  = DiffuseurDAO.TrouverDiffuseurId(cnx, Integer.parseInt(jTextField_supprimer_diffuseur.getText()));
            
            if (diffuseur == null){
                jLabel_message_supprimer_id.setVisible(true);
            } else {
                DiffuseurDAO.SupprimerDiffuseur(cnx, diffuseur);      
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
        
    }//GEN-LAST:event_jButton_supprimer_diffuseurActionPerformed

    private void jButton_retour_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_diffuseurActionPerformed
        RetourMenu();
    }//GEN-LAST:event_jButton_retour_diffuseurActionPerformed

    private void jTextField_modifier_cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_modifier_cpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_modifier_cpActionPerformed

    private void jButton_chargerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_chargerActionPerformed
        MessageInvisible();
         
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";

        Connection cnx = null;
        
        Boolean erreur = true;
        
        if(jTextField_modfier_identifiant.getText().equals("")){
            jLabel_message_modifier_id.setVisible(true);
            erreur = false;
        }
        
        if (erreur == true ){
          try {
            cnx = DriverManager.getConnection(url, utilisateur, password);

            System.out.println("Connexion réussi !");

            Diffuseur diffuseur = DiffuseurDAO.TrouverDiffuseurId(cnx, Long.parseLong(jTextField_modfier_identifiant.getText()));

            if(diffuseur == null){
                jLabel_message_modifier_id.setVisible(true);
            } else {
                jPanel_modifier.setVisible(true);
                jButton_modifier_diffuseur.setVisible(true);
                jTextField_modifier_nom.setText(diffuseur.getNom_diffuseur());
                jTextField_modifier_cp.setText(Long.toString(diffuseur.getInformation().getCp_information()));
                jTextField_modifier_email.setText(diffuseur.getInformation().getMail_information());
                jTextField_modifier_tel_fixe.setText(Long.toString(diffuseur.getInformation().getTel_fixe_information()));
                jTextField_modifier_tel_port.setText(Long.toString(diffuseur.getInformation().getTel_port_information()));
                jTextField_modifier_rue.setText(diffuseur.getInformation().getRue_information());
                jTextField_modifier_ville.setText(diffuseur.getInformation().getVille_information());
                jTextField_modifier_info.setText(Long.toString(diffuseur.getInformation().getId_information()));
                jTextField_modifier_pays.setText(diffuseur.getInformation().getPays_information());
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

    private void TextFieldBlanc(){
        jTextField_ajouter_nom.setText("");
        jTextField_ajouter_mail.setText("");
        jTextField_ajouter_telfixe.setText("");
        jTextField_ajouter_telport.setText("");
        jTextField_ajouter_rue.setText("");
        jTextField_ajouter_ville.setText("");
        jTextField_ajouter_cp.setText("");
        jTextField_ajouter_pays.setText("");    
        jTextField_modfier_identifiant.setText("");
        jTextField_rechercher_nom.setText("");
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
        jTextField_supprimer_diffuseur.setText("");
   }
    private void MessageInvisible(){
        DiffuseurForm.jLabel_message_ajout.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_cp.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_mail.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_nom.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_numfixe.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_numport.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_pays.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_rue.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_ville.setVisible(false);
        DiffuseurForm.jPanel_resultat.setVisible(false);
        DiffuseurForm.jLabel_message_modifier_id.setVisible(false);
        DiffuseurForm.jLabel_message_modifier.setVisible(false);
        DiffuseurForm.jLabel_message_rechercher_nom.setVisible(false);
        DiffuseurForm.jLabel_message_supprimer_id.setVisible(false);
        DiffuseurForm.jLabel_message_supprimer.setVisible(false);
    }
    private void RetourMenu(){
        TextFieldBlanc();
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_diffuseur;
    public static javax.swing.JButton jButton_charger;
    private javax.swing.JButton jButton_lister_diffuseur;
    public static javax.swing.JButton jButton_modifier_diffuseur;
    private javax.swing.JButton jButton_rechercher_diffuseur;
    private javax.swing.JButton jButton_retour_diffuseur;
    private javax.swing.JButton jButton_supprimer_diffuseur;
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
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    protected javax.swing.JPanel jPanel_diffuseur;
    public static javax.swing.JPanel jPanel_modifier;
    public static javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTable jTable_diffuseur;
    private javax.swing.JTextField jTextField_ajouter_cp;
    private javax.swing.JTextField jTextField_ajouter_mail;
    private javax.swing.JTextField jTextField_ajouter_nom;
    private javax.swing.JTextField jTextField_ajouter_password;
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
    private javax.swing.JTextField jTextField_rechercher_nom;
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
    private javax.swing.JTextField jTextField_supprimer_diffuseur;
    // End of variables declaration//GEN-END:variables
}
