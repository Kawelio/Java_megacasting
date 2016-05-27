/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Annonceur;
import ClassDAO.AnnonceurDAO;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;

/**
 *
 * @author
 * Alexis
 */
public class AcceuilForm extends javax.swing.JPanel {

    private MaFenetrePrincipale mafenetreprincipal;
    
    public AcceuilForm(MaFenetrePrincipale maFenetrePrincipale){
        this.mafenetreprincipal = maFenetrePrincipale;
        initComponents();
    }
    
    /**
     * Creates
     * new
     * form
     * Acceuil
     */
    public AcceuilForm() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel_acceuil = new javax.swing.JPanel();
        jButton_metier = new javax.swing.JButton();
        jButton_diffuseur = new javax.swing.JButton();
        jButton_media = new javax.swing.JButton();
        jButton_offre = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jButton_domaine = new javax.swing.JButton();
        jButton_annonceur = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_retour = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jPanel_acceuil.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_acceuil.setPreferredSize(new java.awt.Dimension(720, 500));

        jButton_metier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_metier.setForeground(new java.awt.Color(51, 51, 51));
        jButton_metier.setText("Metier");
        jButton_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_metierActionPerformed(evt);
            }
        });

        jButton_diffuseur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_diffuseur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_diffuseur.setText("Diffuseur");
        jButton_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_diffuseurActionPerformed(evt);
            }
        });

        jButton_media.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_media.setForeground(new java.awt.Color(51, 51, 51));
        jButton_media.setText("Media");
        jButton_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_mediaActionPerformed(evt);
            }
        });

        jButton_offre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_offre.setForeground(new java.awt.Color(51, 51, 51));
        jButton_offre.setText("Offre");
        jButton_offre.setToolTipText("");
        jButton_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_offreActionPerformed(evt);
            }
        });

        jLabel_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jLabel_Image.setMaximumSize(new java.awt.Dimension(620, 250));
        jLabel_Image.setMinimumSize(new java.awt.Dimension(620, 250));

        jButton_domaine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_domaine.setForeground(new java.awt.Color(51, 51, 51));
        jButton_domaine.setText("Domaine");
        jButton_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_domaineActionPerformed(evt);
            }
        });

        jButton_annonceur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_annonceur.setForeground(new java.awt.Color(51, 51, 51));
        jButton_annonceur.setText("Annonceur");
        jButton_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_annonceurActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/footer.png"))); // NOI18N

        jButton_retour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_retour.setForeground(new java.awt.Color(51, 51, 51));
        jButton_retour.setText("Retour");
        jButton_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_retourActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_acceuilLayout = new javax.swing.GroupLayout(jPanel_acceuil);
        jPanel_acceuil.setLayout(jPanel_acceuilLayout);
        jPanel_acceuilLayout.setHorizontalGroup(
            jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_acceuilLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_offre, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jButton_annonceur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_acceuilLayout.createSequentialGroup()
                        .addGroup(jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_media, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jButton_metier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        jPanel_acceuilLayout.setVerticalGroup(
            jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_acceuilLayout.createSequentialGroup()
                .addComponent(jLabel_Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_media, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_acceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_retour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_metierActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "metierCard");
        MetierForm.jLabel_message_ajout.setVisible(false);
        MetierForm.jLabel_message_ajouter_nom.setVisible(false);
        MetierForm.jLabel_message_modifier.setVisible(false);
        MetierForm.jLabel_message_modifier_id.setVisible(false);
        MetierForm.jLabel_message_modifier_nom.setVisible(false);
        MetierForm.jLabel_message_rechercher_nom.setVisible(false);
        MetierForm.jLabel_message_supprimer.setVisible(false);
        MetierForm.jLabel_message_supprimer_id.setVisible(false);
        MetierForm.jPanel_resultat.setVisible(false);     
        
    }//GEN-LAST:event_jButton_metierActionPerformed

    private void jButton_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_diffuseurActionPerformed
       CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "diffuseurCard");
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
        DiffuseurForm.jButton_modifier_diffuseur.setVisible(false);
        DiffuseurForm.jLabel_message_modifier_id.setVisible(false);
        DiffuseurForm.jLabel_message_modifier.setVisible(false);
        DiffuseurForm.jLabel_message_rechercher_nom.setVisible(false);
        DiffuseurForm.jLabel_message_supprimer_id.setVisible(false);
        DiffuseurForm.jLabel_message_supprimer.setVisible(false);
        DiffuseurForm.jPanel_modifier.setVisible(false);
        DiffuseurForm.jLabel_message_ajouter_password.setVisible(false);
        DiffuseurForm.jButton_charger.setVisible(true);
    }//GEN-LAST:event_jButton_diffuseurActionPerformed

    private void jButton_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_mediaActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "mediaCard");
        MediaForm.jLabel_message_modifier.setVisible(false);
        MediaForm.jLabel_message_modifier_id.setVisible(false);
        MediaForm.jLabel_message_modifier_nom.setVisible(false);
        MediaForm.jLabel_message_rechercher_nom.setVisible(false);
        MediaForm.jPanel_resultat.setVisible(false);
        MediaForm.jLabel_message_ajout_media.setVisible(false);
        MediaForm.jLabel_message_ajout_media.setVisible(false);
        MediaForm.jLabel_message_ajouter_poid_media.setVisible(false);
        MediaForm.jLabel_message_modifier.setVisible(false);
        MediaForm.jLabel_message_modifier_id.setVisible(false);
        MediaForm.jLabel_message_modifier_nom.setVisible(false);
        MediaForm.jLabel_message_rechercher_nom.setVisible(false);
        MediaForm.jLabel_message_ajouter_url_media.setVisible(false);
        MediaForm.jLabel_message_supprimer.setVisible(false);
        MediaForm.jLabel_message_supprimer_id.setVisible(false);
    }//GEN-LAST:event_jButton_mediaActionPerformed

    private void jButton_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_offreActionPerformed
       CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "offreCard");    
        OffreForm.jLabel_message_ajout.setVisible(false);
        OffreForm.jLabel_message_ajouter_des.setVisible(false);
        OffreForm.jLabel_message_ajouter_int.setVisible(false);
        OffreForm.jLabel_message_ajouter_loc.setVisible(false);
        OffreForm.jLabel_message_rechercher_int.setVisible(false);
        OffreForm.jLabel_message_ajouter_ref.setVisible(false);
        OffreForm.jLabel_message_modifier.setVisible(false);
        OffreForm.jLabel_message_modifier_id.setVisible(false);
        OffreForm.jLabel_message_modifier_desc.setVisible(false);
        OffreForm.jLabel_message_modifier_int.setVisible(false);
        OffreForm.jLabel_message_modifier_loc.setVisible(false);
        OffreForm.jLabel_message_modifier_ref.setVisible(false);
        OffreForm.jLabel_message_supprimer.setVisible(false);
        OffreForm.jLabel_message_supprimer_id.setVisible(false);
        OffreForm.jPanel_resultat.setVisible(false);
        
    }//GEN-LAST:event_jButton_offreActionPerformed

    private void jButton_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_domaineActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "domaineCard");
        DomaineFrom.jLabel_message_ajout.setVisible(false);    
        DomaineFrom.jLabel_message_ajouter_nom.setVisible(false);   
        DomaineFrom.jPanel_resultat.setVisible(false);
        DomaineFrom.jLabel_message_modifier_id.setVisible(false);
        DomaineFrom.jLabel_message_modifier_nom.setVisible(false);
        DomaineFrom.jLabel_message_modifier.setVisible(false);
        DomaineFrom.jLabel_message_rechercher_nom.setVisible(false);
        DomaineFrom.jLabel_message_supprimer_id.setVisible(false);
        DomaineFrom.jLabel_message_supprimer.setVisible(false);
    }//GEN-LAST:event_jButton_domaineActionPerformed

    private void jButton_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_annonceurActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "annonceurCard");
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
        AnnonceurForm.jPanel_modifier.setVisible(false);
        AnnonceurForm.jButton_modifier_annonceur.setVisible(false);
        AnnonceurForm.jLabel_message_modifier_id.setVisible(false);   
        AnnonceurForm.jLabel_message_modifier.setVisible(false);
        AnnonceurForm.jLabel_message_rechercher_nom.setVisible(false);
        AnnonceurForm.jLabel_message_supprimer_id.setVisible(false);
        AnnonceurForm.jLabel_message_supprimer.setVisible(false);
        AnnonceurForm.jLabel_message_ajouter_password.setVisible(false);
        AnnonceurForm.jButton_charger.setVisible(true);
               
    }//GEN-LAST:event_jButton_annonceurActionPerformed

    private void jButton_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retourActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "redirectionCard");        
    }//GEN-LAST:event_jButton_retourActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_annonceur;
    private javax.swing.JButton jButton_diffuseur;
    private javax.swing.JButton jButton_domaine;
    private javax.swing.JButton jButton_media;
    private javax.swing.JButton jButton_metier;
    private javax.swing.JButton jButton_offre;
    private javax.swing.JButton jButton_retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel_acceuil;
    // End of variables declaration//GEN-END:variables
}
