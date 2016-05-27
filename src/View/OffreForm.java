/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Class.Annonceur;
import Class.Contrat;
import Class.Diffuseur;
import Class.Domaine;
import Class.Media;
import Class.Metier;
import Class.Offre;
import ClassDAO.AnnonceurDAO;
import ClassDAO.ContratDAO;
import ClassDAO.DiffuseurDAO;
import ClassDAO.DomaineDAO;
import ClassDAO.MediaDAO;
import ClassDAO.MetierDAO;
import ClassDAO.OffreDAO;
import ClassDAO.Offre_Diffuseur;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 * Alexis
 */
public class OffreForm extends javax.swing.JPanel {

    private MaFenetrePrincipale mafenetreprincipal;

    
    public OffreForm(MaFenetrePrincipale mafenetreprincipal) {
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
            
            AnnonceurDAO annonceurDAO = new AnnonceurDAO();
            Collection<Annonceur> annonceurs = AnnonceurDAO.ListerAnonceur(cnx);
            for (Annonceur a : annonceurs){                          
                OffreForm.jComboBox_annonceur.addItem(a.getNom_annonceur());
            } 
            
            MediaDAO mediaDAO = new MediaDAO();
            Collection<Media> medias = MediaDAO.ListerMedia(cnx);
            for (Media m : medias){                          
                OffreForm.jComboBox_media.addItem(m.getUrl_media());
            } 
            DiffuseurDAO diffuseurDAO = new DiffuseurDAO();
            Collection<Diffuseur> diffuseurs = DiffuseurDAO.ListerDiffuseur(cnx);
            for (Diffuseur d : diffuseurs){                          
                OffreForm.jComboBox_diffuseur.addItem(d.getNom_diffuseur());
            } 
            DomaineDAO domaineDAO = new DomaineDAO();
            Collection<Domaine> domaines = DomaineDAO.ListerDomaine(cnx);
            for (Domaine d : domaines){                          
                OffreForm.jComboBox_domaine.addItem(d.getLib_domaine());
            }   
            ContratDAO contratDAO = new ContratDAO();
            Collection<Contrat> contrats = ContratDAO.ListerContrat(cnx);
            for (Contrat c : contrats){                          
                OffreForm.jComboBox_contrat.addItem(c.getLib_contrat());
            } 
            
            MetierDAO metierDAO = new MetierDAO();
            Collection<Metier> metiers = MetierDAO.ListerMetier(cnx);
            for (Metier m : metiers){                          
                OffreForm.jComboBox_metier.addItem(m.getLib_metier());
            }
            
            // Chargement pour la Jpanel Modifier offre. 
            
            AnnonceurDAO annonceurDAO_modifier = new AnnonceurDAO();
            Collection<Annonceur> annonceurs_modifier = AnnonceurDAO.ListerAnonceur(cnx);
            for (Annonceur a : annonceurs_modifier){                          
                OffreForm.jComboBox_modifier_annonceur.addItem(a.getNom_annonceur());
            } 
            
            MediaDAO mediaDAO_modifier = new MediaDAO();
            Collection<Media> medias_modifier = MediaDAO.ListerMedia(cnx);
            for (Media m : medias_modifier){                          
                OffreForm.jComboBox_modifier_media.addItem(m.getUrl_media());
            } 
            DiffuseurDAO diffuseurDAO_modifier = new DiffuseurDAO();
            Collection<Diffuseur> diffuseurs_modifier = DiffuseurDAO.ListerDiffuseur(cnx);
            for (Diffuseur d : diffuseurs_modifier){                          
                OffreForm.jComboBox_modifier_diffuseur.addItem(d.getNom_diffuseur());
            } 
            DomaineDAO domaineDAO_modifier = new DomaineDAO();
            Collection<Domaine> domaines_modifier = DomaineDAO.ListerDomaine(cnx);
            for (Domaine d : domaines_modifier){                          
                OffreForm.jComboBox_modifier_domaine.addItem(d.getLib_domaine());
            }   
            ContratDAO contratDAO_modifier = new ContratDAO();
            Collection<Contrat> contrats_modifier = ContratDAO.ListerContrat(cnx);
            for (Contrat c : contrats_modifier){                          
                OffreForm.jComboBox_modifier_contrat.addItem(c.getLib_contrat());
            }     
            MetierDAO metierDAO_modifier = new MetierDAO();
            Collection<Metier> metiers_modifier = MetierDAO.ListerMetier(cnx);
            for (Metier m : metiers_modifier){                          
                OffreForm.jComboBox_modifier_metier.addItem(m.getLib_metier());
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
     * Offre
     */
    public OffreForm() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel_offre = new javax.swing.JPanel();
        jTabbedPane22 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel50 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField_ajouter_ref = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField_ajouter_int = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField_ajouter_des = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField_ajouter_loc = new javax.swing.JTextField();
        jSpinner_ajouter_duree = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSpinner_ajouter_date_cast = new javax.swing.JSpinner();
        jSpinner_ajouter_date_deb = new javax.swing.JSpinner();
        jComboBox_annonceur = new javax.swing.JComboBox();
        jComboBox_contrat = new javax.swing.JComboBox();
        jComboBox_metier = new javax.swing.JComboBox();
        jComboBox_domaine = new javax.swing.JComboBox();
        jLabel63 = new javax.swing.JLabel();
        jComboBox_diffuseur = new javax.swing.JComboBox();
        jLabel_message_ajouter_int = new javax.swing.JLabel();
        jLabel_message_ajouter_loc = new javax.swing.JLabel();
        jLabel_message_ajouter_ref = new javax.swing.JLabel();
        jLabel_message_ajouter_des = new javax.swing.JLabel();
        jComboBox_media = new javax.swing.JComboBox();
        jButton_ajouter_offre = new javax.swing.JButton();
        jLabel_message_ajout = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField_modifier_ref = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField_modifier_loc = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField_modifier_int = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jTextField_modifier_desc = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField_modifier_id = new javax.swing.JTextField();
        jLabel_message_modifier_id = new javax.swing.JLabel();
        jComboBox_modifier_annonceur = new javax.swing.JComboBox();
        jComboBox_modifier_metier = new javax.swing.JComboBox();
        jComboBox_modifier_domaine = new javax.swing.JComboBox();
        jComboBox_modifier_diffuseur = new javax.swing.JComboBox();
        jLabel78 = new javax.swing.JLabel();
        jComboBox_modifier_contrat = new javax.swing.JComboBox();
        jLabel_message_modifier_ref = new javax.swing.JLabel();
        jLabel_message_modifier_loc = new javax.swing.JLabel();
        jLabel_message_modifier_desc = new javax.swing.JLabel();
        jSpinner_modifier_date_cast = new javax.swing.JSpinner();
        jSpinner_modifier_duree = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinner_modifier_date_deb = new javax.swing.JSpinner();
        jComboBox_modifier_media = new javax.swing.JComboBox();
        jLabel_message_modifier_int = new javax.swing.JLabel();
        jButton_modifier_offre = new javax.swing.JButton();
        jLabel_message_modifier = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_offre = new javax.swing.JTable();
        jLabel85 = new javax.swing.JLabel();
        jButton_lister_offre = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextField_rechercher_int = new javax.swing.JTextField();
        jLabel_message_rechercher_int = new javax.swing.JLabel();
        jPanel_resultat = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_ref = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_int = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_desc = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_loc = new javax.swing.JTextField();
        jTextField_rechercher_resultat_media = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_annonceur = new javax.swing.JTextField();
        jTextField_rechercher_resultat_metier = new javax.swing.JTextField();
        jTextField_rechercher_resultat_contrat = new javax.swing.JTextField();
        jTextField_rechercher_resultat_domaine = new javax.swing.JTextField();
        jTextField_rechercher_resultat_date_cast = new javax.swing.JTextField();
        jTextField_rechercher_resultat_duree = new javax.swing.JTextField();
        jTextField_rechercher_resultat_date_deb = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jTextField_rechercher_resultat_id = new javax.swing.JTextField();
        jButton_rechercher_offre = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField_supprimer_id = new javax.swing.JTextField();
        jLabel_message_supprimer_id = new javax.swing.JLabel();
        jButton_supprimer_offre = new javax.swing.JButton();
        jLabel_message_supprimer = new javax.swing.JLabel();
        jButton_retour_ajouter_annonceur4 = new javax.swing.JButton();

        jPanel_offre.setBackground(new java.awt.Color(14, 14, 14));
        jPanel_offre.setPreferredSize(new java.awt.Dimension(720, 500));

        jPanel3.setBackground(new java.awt.Color(14, 14, 14));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        jPanel50.setBackground(new java.awt.Color(30, 30, 30));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel50.setForeground(new java.awt.Color(255, 255, 255));
        jPanel50.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel50ComponentShown(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Offre");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Intitulé :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("référence :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("durée :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("date début :");

        jTextField_ajouter_ref.setForeground(new java.awt.Color(51, 51, 51));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("date casting :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Localisation :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Description de l'offre :");

        jTextField_ajouter_int.setForeground(new java.awt.Color(51, 51, 51));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Annonceur :");

        jTextField_ajouter_des.setForeground(new java.awt.Color(51, 51, 51));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Contrat :");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Metier :");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Domaine :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Media :");

        jTextField_ajouter_loc.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("jours");

        jSpinner_ajouter_date_cast.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.WEEK_OF_YEAR));

        jSpinner_ajouter_date_deb.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MONTH));

        jComboBox_annonceur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_annonceurMouseClicked(evt);
            }
        });
        jComboBox_annonceur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_annonceurItemStateChanged(evt);
            }
        });
        jComboBox_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_annonceurActionPerformed(evt);
            }
        });

        jComboBox_contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_contratActionPerformed(evt);
            }
        });

        jComboBox_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_metierActionPerformed(evt);
            }
        });

        jComboBox_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_domaineActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 204));
        jLabel63.setText("Diffuseur");

        jComboBox_diffuseur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aucun" }));
        jComboBox_diffuseur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_diffuseurMouseClicked(evt);
            }
        });
        jComboBox_diffuseur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_diffuseurItemStateChanged(evt);
            }
        });
        jComboBox_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_diffuseurActionPerformed(evt);
            }
        });

        jLabel_message_ajouter_int.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_int.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_int.setText("Renseigner un intulé à l'offre.");

        jLabel_message_ajouter_loc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_loc.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_loc.setText("Renseigner une localisation d'offre valide.");

        jLabel_message_ajouter_ref.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_ref.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_ref.setText("Renseigner une référence d'offre valide.");

        jLabel_message_ajouter_des.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_ajouter_des.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_ajouter_des.setText("Renseigner une description d'offre valide.");

        jComboBox_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_mediaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTextField_ajouter_int, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_ajouter_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel_message_ajouter_int)
                    .addComponent(jLabel_message_ajouter_ref)
                    .addComponent(jLabel_message_ajouter_loc)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_ajouter_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner_ajouter_date_cast, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel50Layout.createSequentialGroup()
                                .addComponent(jSpinner_ajouter_duree, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSpinner_ajouter_date_deb, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_message_ajouter_des)
                    .addComponent(jLabel30)
                    .addComponent(jTextField_ajouter_des, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(jTextField_ajouter_int))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_message_ajouter_int)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_ajouter_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_message_ajouter_ref))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_ajouter_des, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_ajouter_date_cast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_ajouter_duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_ajouter_date_deb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ajouter_loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_message_ajouter_loc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel50Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_message_ajouter_des)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton_ajouter_offre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ajouter_offre.setForeground(new java.awt.Color(51, 51, 51));
        jButton_ajouter_offre.setText("Ajouter");
        jButton_ajouter_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ajouter_offreActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_ajouter_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel_message_ajout)
                        .addGap(55, 55, 55)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_message_ajout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_ajouter_offre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane22.addTab("Ajouter", jPanel3);

        jPanel15.setBackground(new java.awt.Color(14, 14, 14));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel15.setForeground(new java.awt.Color(153, 153, 153));

        jPanel51.setBackground(new java.awt.Color(30, 30, 30));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel51.setForeground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Offre");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Intitulé :");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(204, 204, 204));
        jLabel37.setText("référence :");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("durée :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(204, 204, 204));
        jLabel39.setText("date début :");

        jTextField_modifier_ref.setForeground(new java.awt.Color(51, 51, 51));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("date casting :");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Localisation :");

        jTextField_modifier_loc.setForeground(new java.awt.Color(51, 51, 51));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("Description de l'offre :");

        jTextField_modifier_int.setForeground(new java.awt.Color(51, 51, 51));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("Annonceur :");

        jTextField_modifier_desc.setForeground(new java.awt.Color(51, 51, 51));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Contrat :");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(204, 204, 204));
        jLabel45.setText("Metier :");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(204, 204, 204));
        jLabel46.setText("Domaine :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(204, 204, 204));
        jLabel47.setText("Media :");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(204, 204, 204));
        jLabel52.setText("Identifiant :");

        jTextField_modifier_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_modifier_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_id.setText("Renseigner l'identifiant d'une offre.");

        jComboBox_modifier_annonceur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_modifier_annonceurMouseClicked(evt);
            }
        });
        jComboBox_modifier_annonceur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_modifier_annonceurItemStateChanged(evt);
            }
        });
        jComboBox_modifier_annonceur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modifier_annonceurActionPerformed(evt);
            }
        });

        jComboBox_modifier_metier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modifier_metierActionPerformed(evt);
            }
        });

        jComboBox_modifier_domaine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modifier_domaineActionPerformed(evt);
            }
        });

        jComboBox_modifier_diffuseur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "aucun" }));
        jComboBox_modifier_diffuseur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox_modifier_diffuseurMouseClicked(evt);
            }
        });
        jComboBox_modifier_diffuseur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_modifier_diffuseurItemStateChanged(evt);
            }
        });
        jComboBox_modifier_diffuseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modifier_diffuseurActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(204, 204, 204));
        jLabel78.setText("Diffuseur");

        jComboBox_modifier_contrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modifier_contratActionPerformed(evt);
            }
        });

        jLabel_message_modifier_ref.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_ref.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_ref.setText("Renseigner une référence d'offre valide.");

        jLabel_message_modifier_loc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_loc.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_loc.setText("Renseigner une localisation d'offre valide.");

        jLabel_message_modifier_desc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_desc.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_desc.setText("Renseigner une description d'offre valide.");

        jSpinner_modifier_date_cast.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.WEEK_OF_YEAR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("jours");

        jSpinner_modifier_date_deb.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MONTH));

        jComboBox_modifier_media.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_modifier_mediaActionPerformed(evt);
            }
        });

        jLabel_message_modifier_int.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_modifier_int.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_modifier_int.setText("Renseigner un intulé à l'offre.");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_modifier_ref)
                    .addComponent(jLabel_message_modifier_id)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField_modifier_int, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_modifier_date_cast, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel51Layout.createSequentialGroup()
                                        .addComponent(jSpinner_modifier_duree, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinner_modifier_date_deb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_modifier_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_modifier_int))
                .addGap(83, 83, 83)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel44)
                                    .addComponent(jLabel78)
                                    .addComponent(jLabel43)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_modifier_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_modifier_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_modifier_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_modifier_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_modifier_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_modifier_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel42)
                    .addComponent(jTextField_modifier_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_message_modifier_desc)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_modifier_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_modifier_loc))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel51Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel_message_modifier_id)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_modifier_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_modifier_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_message_modifier_int)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_modifier_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_message_modifier_desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel_message_modifier_loc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_modifier_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_modifier_diffuseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_modifier_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_modifier_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_modifier_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_modifier_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel51Layout.createSequentialGroup()
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_modifier_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_message_modifier_ref)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner_modifier_date_cast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner_modifier_duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner_modifier_date_deb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton_modifier_offre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_modifier_offre.setForeground(new java.awt.Color(51, 51, 51));
        jButton_modifier_offre.setText("Modifier");
        jButton_modifier_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifier_offreActionPerformed(evt);
            }
        });

        jLabel_message_modifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_modifier.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_modifier.setText("La modification a bien été effectué !");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jButton_modifier_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_message_modifier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_modifier_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_message_modifier))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Modifier", jPanel15);

        jPanel16.setBackground(new java.awt.Color(14, 14, 14));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel16.setForeground(new java.awt.Color(153, 153, 153));

        jPanel52.setBackground(new java.awt.Color(30, 30, 30));
        jPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel52.setForeground(new java.awt.Color(255, 255, 255));

        jTable_offre.setForeground(new java.awt.Color(51, 51, 51));
        jTable_offre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Intitulé", "Référence", "Date", "Durée", "Date début", "Localisation", "Description ", "Identifiant annonceur", "Identifiant contrat", "Identifiant métier", "Identifiant domaine"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_offre);

        jLabel85.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 204, 204));
        jLabel85.setText("Offre");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton_lister_offre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_lister_offre.setText("Lister");
        jButton_lister_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lister_offreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton_lister_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_lister_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane22.addTab("Lister", jPanel16);

        jPanel17.setBackground(new java.awt.Color(14, 14, 14));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jPanel54.setBackground(new java.awt.Color(30, 30, 30));
        jPanel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel54.setForeground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(204, 204, 204));
        jLabel48.setText("Offre");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(204, 204, 204));
        jLabel62.setText("Intitulé :");

        jTextField_rechercher_int.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_rechercher_int.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_rechercher_int.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_rechercher_int.setText("Renseigner un intitulé d'offre valide.");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_rechercher_int, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_message_rechercher_int))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_message_rechercher_int)
                .addContainerGap())
        );

        jPanel_resultat.setBackground(new java.awt.Color(30, 30, 30));
        jPanel_resultat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(186, 207, 226), 2));
        jPanel_resultat.setForeground(new java.awt.Color(255, 255, 255));

        jLabel64.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(204, 204, 204));
        jLabel64.setText("Resultat");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(204, 204, 204));
        jLabel65.setText("Intitulé :");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(204, 204, 204));
        jLabel66.setText("référence :");

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 204, 204));
        jLabel67.setText("durée :");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(204, 204, 204));
        jLabel68.setText("date début :");

        jTextField_rechercher_resultat_ref.setForeground(new java.awt.Color(51, 51, 51));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(204, 204, 204));
        jLabel69.setText("date casting :");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 204, 204));
        jLabel70.setText("Localisation :");

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 204, 204));
        jLabel71.setText("Description de l'offre :");

        jTextField_rechercher_resultat_int.setForeground(new java.awt.Color(51, 51, 51));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(204, 204, 204));
        jLabel72.setText("Annonceur :");

        jTextField_rechercher_resultat_desc.setForeground(new java.awt.Color(51, 51, 51));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 204, 204));
        jLabel73.setText("Contrat :");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(204, 204, 204));
        jLabel74.setText("Metier :");

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(204, 204, 204));
        jLabel75.setText("Domaine :");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(204, 204, 204));
        jLabel76.setText("Media :");

        jTextField_rechercher_resultat_loc.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_media.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("jours");

        jTextField_rechercher_resultat_annonceur.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_metier.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_contrat.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_domaine.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_date_cast.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_duree.setForeground(new java.awt.Color(51, 51, 51));

        jTextField_rechercher_resultat_date_deb.setForeground(new java.awt.Color(51, 51, 51));

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(204, 204, 204));
        jLabel79.setText("Identifiant :");

        jTextField_rechercher_resultat_id.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel_resultatLayout = new javax.swing.GroupLayout(jPanel_resultat);
        jPanel_resultat.setLayout(jPanel_resultatLayout);
        jPanel_resultatLayout.setHorizontalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_rechercher_resultat_date_deb))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_rechercher_resultat_ref, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel64)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addComponent(jTextField_rechercher_resultat_duree, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_rechercher_resultat_date_cast)))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_rechercher_resultat_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_rechercher_resultat_int, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(16, 16, 16)
                        .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_rechercher_resultat_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel71)
                            .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField_rechercher_resultat_metier, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                    .addComponent(jLabel73)
                                    .addGap(24, 24, 24)
                                    .addComponent(jTextField_rechercher_resultat_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_rechercher_resultat_media, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_resultatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(jTextField_rechercher_resultat_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_rechercher_resultat_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel_resultatLayout.setVerticalGroup(
            jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_resultatLayout.createSequentialGroup()
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_int, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_rechercher_resultat_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_ref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rechercher_resultat_metier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_rechercher_resultat_date_cast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_annonceur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_rechercher_resultat_duree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_date_deb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_resultatLayout.createSequentialGroup()
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_contrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_domaine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_resultatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_rechercher_resultat_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jButton_rechercher_offre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_rechercher_offre.setForeground(new java.awt.Color(51, 51, 51));
        jButton_rechercher_offre.setText("Rechercher");
        jButton_rechercher_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rechercher_offreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton_rechercher_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton_rechercher_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel_resultat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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
        jLabel112.setText("Offre");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("Id de l'offre :");

        jTextField_supprimer_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel_message_supprimer_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_message_supprimer_id.setForeground(new java.awt.Color(204, 0, 0));
        jLabel_message_supprimer_id.setText("Renseigner un nom de diffuseur valide.");

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
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jButton_supprimer_offre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_supprimer_offre.setForeground(new java.awt.Color(51, 51, 51));
        jButton_supprimer_offre.setText("Supprimer");
        jButton_supprimer_offre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_supprimer_offreActionPerformed(evt);
            }
        });

        jLabel_message_supprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_message_supprimer.setForeground(new java.awt.Color(0, 153, 51));
        jLabel_message_supprimer.setText("La suppression a bien été effectué !");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jButton_supprimer_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel_message_supprimer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_supprimer_offre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_message_supprimer)
                .addContainerGap(171, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel_offreLayout = new javax.swing.GroupLayout(jPanel_offre);
        jPanel_offre.setLayout(jPanel_offreLayout);
        jPanel_offreLayout.setHorizontalGroup(
            jPanel_offreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_offreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel_offreLayout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_offreLayout.setVerticalGroup(
            jPanel_offreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_offreLayout.createSequentialGroup()
                .addComponent(jTabbedPane22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_retour_ajouter_annonceur4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_offre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_offre, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ajouter_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ajouter_offreActionPerformed
       
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                   
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_ajouter_int.getText().equals("")){
           jLabel_message_ajouter_int.setVisible(true);
           erreur = false;
       } 
       if(jTextField_ajouter_des.getText().equals("")){
           jLabel_message_ajouter_des.setVisible(true);
           erreur = false;
       } 
       if(jTextField_ajouter_loc.getText().equals("")){
           jLabel_message_ajouter_loc.setVisible(true);
           erreur = false;
       }     
       if(jTextField_ajouter_ref.getText().equals("")){
           jLabel_message_ajouter_ref.setVisible(true);
           erreur = false;
       } 
       
       if (erreur == true){
            try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            int validation_offre = 0;
            
            System.out.println("Connexion réussi !");   
            Annonceur annonceur = AnnonceurDAO.TrouverAnnonceurNom(cnx, jComboBox_annonceur.getSelectedItem().toString());
            Contrat contrat = ContratDAO.TrouverContratNom(cnx, jComboBox_contrat.getSelectedItem().toString());
            Metier metier = MetierDAO.TrouverMetierNom(cnx, jComboBox_metier.getSelectedItem().toString());
            Domaine domaine = DomaineDAO.TrouverDomaineNom(cnx, jComboBox_domaine.getSelectedItem().toString());
            Diffuseur diffuseur = DiffuseurDAO.TrouverDiffuseurNom(cnx,jComboBox_diffuseur.getSelectedItem().toString());          
            Media media = MediaDAO.TrouverMediaUrl(cnx, jComboBox_media.getSelectedItem().toString());
            
            String dateCasting = jSpinner_ajouter_date_cast.getValue().toString();  
            String dateDebut = jSpinner_ajouter_date_deb.getValue().toString();
            
            Offre offre = new Offre(jTextField_ajouter_int.getText(), jTextField_ajouter_ref.getText(), dateCasting, Integer.parseInt(jSpinner_ajouter_duree.getValue().toString()), dateDebut, jTextField_ajouter_loc.getText(), jTextField_ajouter_des.getText(), validation_offre, annonceur, contrat, metier, domaine);
            offre.setMedia(media);       
            OffreDAO.CreerOffre(cnx, offre);
            
            if(jComboBox_diffuseur.getSelectedItem().toString().equals("aucun")){
                 System.out.println("L'offre à été créer sans diffuseur");
            } else {
                Offre_Diffuseur.CreerOffre_Diffuseur(cnx, diffuseur, offre);
                TextFieldBlanc();
            }
           
            
            
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
       
    }//GEN-LAST:event_jButton_ajouter_offreActionPerformed

    private void jButton_lister_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lister_offreActionPerformed
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                   
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
             
            DefaultTableModel model = (DefaultTableModel) jTable_offre.getModel();
            model.setRowCount(0);
            OffreDAO offreDAO = new OffreDAO();
            Collection<Offre> offres = OffreDAO.ListerOffre(cnx);


            for (Offre o : offres){
                model.addRow(new Object[] {
                    o.getId_offre(),
                    o.getInt_offre(),
                    o.getRef_offre(),
                    o.getDate_offre(),
                    o.getDuree_offre(),
                    o.getDate_deb_offre(),
                    o.getLoc_offre(),
                    o.getDesc_offre(),
                    o.getAnnonceur().getId_anonceur(),
                    o.getContrat().getId_contrat(),
                    o.getMetier().getId_metier(),
                    o.getDomaine().getId_domaine(),
               
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
       
    }//GEN-LAST:event_jButton_lister_offreActionPerformed

    private void jButton_rechercher_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rechercher_offreActionPerformed
         MessageInvisible();
            
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                   
       
       Connection cnx = null;             
       
        try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
             
           
            
            System.out.println("Connexion réussi !"); 
            
            Offre offre = OffreDAO.TrouverOffreInt(cnx, jTextField_rechercher_int.getText());
            
             if(jTextField_rechercher_int.getText().equals("")){
                 jLabel_message_rechercher_int.setVisible(true);               
              } 
             if (offre == null){
                 jLabel_message_rechercher_int.setVisible(true);             
             }
             
             if(offre != null){
                  jPanel_resultat.setVisible(true);
                  jTextField_rechercher_resultat_id.setText(Long.toString(offre.getId_offre()));
                  jTextField_rechercher_resultat_annonceur.setText(Long.toString(offre.getAnnonceur().getId_anonceur()));
                  jTextField_rechercher_resultat_contrat.setText(Long.toString(offre.getContrat().getId_contrat()));
                  jTextField_rechercher_resultat_date_cast.setText(offre.getDate_offre());
                  jTextField_rechercher_resultat_date_deb.setText(offre.getDate_deb_offre());
                  jTextField_rechercher_resultat_domaine.setText(Long.toString(offre.getDomaine().getId_domaine()));
                  jTextField_rechercher_resultat_duree.setText(Integer.toString(offre.getDuree_offre()));
                  jTextField_rechercher_resultat_id.setText(Long.toString(offre.getId_offre()));
                  jTextField_rechercher_resultat_int.setText(offre.getInt_offre());
                  jTextField_rechercher_resultat_loc.setText(offre.getLoc_offre());
                  jTextField_rechercher_resultat_ref.setText(offre.getRef_offre());
                  jTextField_rechercher_resultat_desc.setText(offre.getDesc_offre());
                  jTextField_rechercher_resultat_media.setText(Long.toString(offre.getMedia().getId_media()));
                  jTextField_rechercher_resultat_metier.setText(Long.toString(offre.getMetier().getId_metier()));
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
    }//GEN-LAST:event_jButton_rechercher_offreActionPerformed

    private void jButton_supprimer_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_supprimer_offreActionPerformed
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
       
       if (erreur == true){
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            Offre offre  = OffreDAO.TrouverOffreId(cnx, Integer.parseInt(jTextField_supprimer_id.getText()));
            
            if(offre == null){
                jLabel_message_supprimer_id.setVisible(true);
            } else {
                Offre_Diffuseur.SupprimerOffre_Diffuseur(cnx, offre);
                OffreDAO.SupprimerOffre(cnx, offre);
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
    }//GEN-LAST:event_jButton_supprimer_offreActionPerformed

    private void jButton_retour_ajouter_annonceur4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_retour_ajouter_annonceur4ActionPerformed
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
    }//GEN-LAST:event_jButton_retour_ajouter_annonceur4ActionPerformed

    private void jButton_modifier_offreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifier_offreActionPerformed
        MessageInvisible();
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1/megacasting";
        String utilisateur = "root";
        String password = "";                
       
       Connection cnx = null;             
       
       Boolean erreur = true;
       
       if(jTextField_modifier_int.getText().equals("")){
           jLabel_message_modifier_int.setVisible(true);
           erreur = false;
       } 
       if(jTextField_modifier_id.getText().equals("")){
           jLabel_message_modifier_id.setVisible(true);
            erreur = false;
       } 
        if(jTextField_modifier_loc.getText().equals("")){
           jLabel_message_modifier_loc.setVisible(true);
            erreur = false;
       } 
       if(jTextField_modifier_ref.getText().equals("")){
           jLabel_message_modifier_ref.setVisible(true);
            erreur = false;
       } 
        if(jTextField_modifier_desc.getText().equals("")){
           jLabel_message_modifier_desc.setVisible(true);
            erreur = false;
       } 
        
       if(erreur == true) {
           try {
            cnx = DriverManager.getConnection(url, utilisateur, password);
            
            System.out.println("Connexion réussi !"); 
            
            int validation_offre = 0;
            
            Annonceur annonceur = AnnonceurDAO.TrouverAnnonceurNom(cnx, jComboBox_modifier_annonceur.getSelectedItem().toString());
            Contrat contrat = ContratDAO.TrouverContratNom(cnx, jComboBox_modifier_contrat.getSelectedItem().toString());
            Metier metier = MetierDAO.TrouverMetierNom(cnx, jComboBox_modifier_metier.getSelectedItem().toString());
            Domaine domaine = DomaineDAO.TrouverDomaineNom(cnx, jComboBox_modifier_domaine.getSelectedItem().toString());
            Diffuseur diffuseur = DiffuseurDAO.TrouverDiffuseurNom(cnx,jComboBox_modifier_diffuseur.getSelectedItem().toString()); 
            Media media = MediaDAO.TrouverMediaUrl(cnx, jComboBox_modifier_media.getSelectedItem().toString());
            
            String dateCasting = jSpinner_modifier_date_cast.getValue().toString();  
            String dateDebut = jSpinner_modifier_date_deb.getValue().toString();
            Offre offre = new Offre(jTextField_modifier_int.getText(), jTextField_modifier_ref.getText(), dateCasting, Integer.parseInt(jSpinner_modifier_duree.getValue().toString()), dateDebut, jTextField_modifier_loc.getText(), jTextField_modifier_desc.getText(), validation_offre, annonceur, contrat, metier, domaine);
            offre.setId_offre(Integer.parseInt(jTextField_modifier_id.getText()));
            offre.setMedia(media);   
            OffreDAO.ModifierOffre(cnx, offre);
            
            jLabel_message_modifier.setVisible(true);
            
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
             
    }//GEN-LAST:event_jButton_modifier_offreActionPerformed

    private void jComboBox_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_annonceurActionPerformed
         
    }//GEN-LAST:event_jComboBox_annonceurActionPerformed

    private void jComboBox_contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_contratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_contratActionPerformed

    private void jComboBox_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_metierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_metierActionPerformed

    private void jComboBox_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_domaineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_domaineActionPerformed

    private void jComboBox_annonceurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_annonceurItemStateChanged
           
    }//GEN-LAST:event_jComboBox_annonceurItemStateChanged

    private void jComboBox_annonceurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_annonceurMouseClicked
      
    }//GEN-LAST:event_jComboBox_annonceurMouseClicked

    private void jComboBox_diffuseurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_diffuseurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_diffuseurMouseClicked

    private void jComboBox_diffuseurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_diffuseurItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_diffuseurItemStateChanged

    private void jComboBox_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_diffuseurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_diffuseurActionPerformed

    private void jComboBox_modifier_annonceurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_modifier_annonceurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_annonceurMouseClicked

    private void jComboBox_modifier_annonceurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_modifier_annonceurItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_annonceurItemStateChanged

    private void jComboBox_modifier_annonceurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modifier_annonceurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_annonceurActionPerformed

    private void jComboBox_modifier_metierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modifier_metierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_metierActionPerformed

    private void jComboBox_modifier_domaineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modifier_domaineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_domaineActionPerformed

    private void jComboBox_modifier_diffuseurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox_modifier_diffuseurMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_diffuseurMouseClicked

    private void jComboBox_modifier_diffuseurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_modifier_diffuseurItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_diffuseurItemStateChanged

    private void jComboBox_modifier_diffuseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modifier_diffuseurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_diffuseurActionPerformed

    private void jComboBox_modifier_contratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modifier_contratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_contratActionPerformed

    private void jComboBox_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_mediaActionPerformed

    private void jComboBox_modifier_mediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_modifier_mediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_modifier_mediaActionPerformed

    private void jPanel50ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel50ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel50ComponentShown

    private void MessageInvisible(){
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
        OffreForm.jLabel_message_supprimer_id.setVisible(false);
        OffreForm.jPanel_resultat.setVisible(false);
    }
    private void TextFieldBlanc(){
        jTextField_ajouter_des.setText("");
        jTextField_ajouter_int.setText("");
        jTextField_ajouter_loc.setText("");  
        jTextField_ajouter_ref.setText("");
      
        
        jTextField_modifier_id.setText("");
        jTextField_modifier_int.setText("");
        jTextField_modifier_loc.setText("");
        jTextField_modifier_ref.setText("");
        
        jTextField_rechercher_resultat_annonceur.setText("");
        jTextField_rechercher_resultat_contrat.setText("");
        jTextField_rechercher_resultat_date_cast.setText("");
        jTextField_rechercher_resultat_date_deb.setText("");
        jTextField_rechercher_resultat_desc.setText("");
        jTextField_rechercher_resultat_domaine.setText(""); 
        jTextField_rechercher_resultat_duree.setText("");
        jTextField_rechercher_int.setText("");
        jTextField_rechercher_resultat_int.setText("");
        jTextField_rechercher_resultat_loc.setText("");
        jTextField_rechercher_resultat_media.setText("");
        jTextField_rechercher_resultat_metier.setText("");
        jTextField_rechercher_resultat_ref.setText("");
        jTextField_supprimer_id.setText("");
   }
   
    private void RetourMenu(){ 
        TextFieldBlanc();
        CardLayout c1 = (CardLayout) MaFenetrePrincipale.Panel_principal.getLayout();
        c1.show(MaFenetrePrincipale.Panel_principal, "acceuilCard");
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ajouter_offre;
    private javax.swing.JButton jButton_lister_offre;
    private javax.swing.JButton jButton_modifier_offre;
    private javax.swing.JButton jButton_rechercher_offre;
    private javax.swing.JButton jButton_retour_ajouter_annonceur4;
    private javax.swing.JButton jButton_supprimer_offre;
    public static javax.swing.JComboBox jComboBox_annonceur;
    public static javax.swing.JComboBox jComboBox_contrat;
    public static javax.swing.JComboBox jComboBox_diffuseur;
    public static javax.swing.JComboBox jComboBox_domaine;
    public static javax.swing.JComboBox jComboBox_media;
    public static javax.swing.JComboBox jComboBox_metier;
    public static javax.swing.JComboBox jComboBox_modifier_annonceur;
    public static javax.swing.JComboBox jComboBox_modifier_contrat;
    public static javax.swing.JComboBox jComboBox_modifier_diffuseur;
    public static javax.swing.JComboBox jComboBox_modifier_domaine;
    public static javax.swing.JComboBox jComboBox_modifier_media;
    public static javax.swing.JComboBox jComboBox_modifier_metier;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel85;
    public static javax.swing.JLabel jLabel_message_ajout;
    public static javax.swing.JLabel jLabel_message_ajouter_des;
    public static javax.swing.JLabel jLabel_message_ajouter_int;
    public static javax.swing.JLabel jLabel_message_ajouter_loc;
    public static javax.swing.JLabel jLabel_message_ajouter_ref;
    public static javax.swing.JLabel jLabel_message_modifier;
    public static javax.swing.JLabel jLabel_message_modifier_desc;
    public static javax.swing.JLabel jLabel_message_modifier_id;
    public static javax.swing.JLabel jLabel_message_modifier_int;
    public static javax.swing.JLabel jLabel_message_modifier_loc;
    public static javax.swing.JLabel jLabel_message_modifier_ref;
    public static javax.swing.JLabel jLabel_message_rechercher_int;
    public static javax.swing.JLabel jLabel_message_supprimer;
    public static javax.swing.JLabel jLabel_message_supprimer_id;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel86;
    protected javax.swing.JPanel jPanel_offre;
    public static javax.swing.JPanel jPanel_resultat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_ajouter_date_cast;
    private javax.swing.JSpinner jSpinner_ajouter_date_deb;
    private javax.swing.JSpinner jSpinner_ajouter_duree;
    private javax.swing.JSpinner jSpinner_modifier_date_cast;
    private javax.swing.JSpinner jSpinner_modifier_date_deb;
    private javax.swing.JSpinner jSpinner_modifier_duree;
    private javax.swing.JTabbedPane jTabbedPane22;
    private javax.swing.JTable jTable_offre;
    private javax.swing.JTextField jTextField_ajouter_des;
    private javax.swing.JTextField jTextField_ajouter_int;
    private javax.swing.JTextField jTextField_ajouter_loc;
    private javax.swing.JTextField jTextField_ajouter_ref;
    private javax.swing.JTextField jTextField_modifier_desc;
    private javax.swing.JTextField jTextField_modifier_id;
    private javax.swing.JTextField jTextField_modifier_int;
    private javax.swing.JTextField jTextField_modifier_loc;
    private javax.swing.JTextField jTextField_modifier_ref;
    private javax.swing.JTextField jTextField_rechercher_int;
    private javax.swing.JTextField jTextField_rechercher_resultat_annonceur;
    private javax.swing.JTextField jTextField_rechercher_resultat_contrat;
    private javax.swing.JTextField jTextField_rechercher_resultat_date_cast;
    private javax.swing.JTextField jTextField_rechercher_resultat_date_deb;
    private javax.swing.JTextField jTextField_rechercher_resultat_desc;
    private javax.swing.JTextField jTextField_rechercher_resultat_domaine;
    private javax.swing.JTextField jTextField_rechercher_resultat_duree;
    private javax.swing.JTextField jTextField_rechercher_resultat_id;
    private javax.swing.JTextField jTextField_rechercher_resultat_int;
    private javax.swing.JTextField jTextField_rechercher_resultat_loc;
    private javax.swing.JTextField jTextField_rechercher_resultat_media;
    private javax.swing.JTextField jTextField_rechercher_resultat_metier;
    private javax.swing.JTextField jTextField_rechercher_resultat_ref;
    private javax.swing.JTextField jTextField_supprimer_id;
    // End of variables declaration//GEN-END:variables
}
