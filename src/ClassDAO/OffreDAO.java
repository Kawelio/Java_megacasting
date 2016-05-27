/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Annonceur;
import Class.Contrat;
import Class.Diffuseur;
import Class.Domaine;
import Class.Media;
import Class.Metier;
import Class.Offre;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author
 * Alexis
 */
public class OffreDAO {
    
    public static void CreerOffre(Connection cnx, Offre off) throws Exception{
        Offre o = TrouverOffreInt(cnx, off.getInt_offre());
        if(o != null){
            throw new Exception(off.getInt_offre() + " existe déjà !");
        }      
        
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            
            int boolean_validation = 0;
            
            stmt.executeUpdate("INSERT INTO offre (int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, validation_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_media) "
                    + "VALUES ('" + off.getInt_offre() + "'"
                    + ", '" + off.getRef_offre() + "'"
                    + ", '" + off.getDate_offre() + "'"
                    + ", " + off.getDuree_offre() 
                    + ", '" + off.getDate_deb_offre() + "'"
                    + ", '" + off.getLoc_offre() + "'"
                    + ", '" + off.getDesc_offre() + "'"
                    + ", " + boolean_validation 
                    + ", " + off.getAnnonceur().getId_anonceur() 
                    + ", " + off.getContrat().getId_contrat() 
                    + ", " + off.getMetier().getId_metier() 
                    + ", " + off.getDomaine().getId_domaine() 
                    + ", " + off.getMedia().getId_media() 
                    + ")");
          
            ResultSet rs = stmt.executeQuery("SELECT MAX(id_offre) FROM offre");
            if (rs.next()){
                long id_offre = rs.getLong(1);
                off.setId_offre((int)id_offre);
            }
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
        
    }
    
    public static void ModifierOffre(Connection cnx, Offre off) throws Exception{
        
        
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("UPDATE offre SET"                
                    +" int_offre = '" + off.getInt_offre()  + "',"
                    +" ref_offre = '" + off.getRef_offre()  + "',"
                    +" date_offre = '" + off.getDate_offre()  + "',"
                    +" duree_offre = " + off.getDuree_offre()  + ","
                    +" date_deb_offre = '" + off.getDate_deb_offre()  + "',"
                    +" loc_offre = '" + off.getLoc_offre()  + "',"
                    +" desc_offre = '" + off.getDesc_offre()  + "',"
                    +" id_annonceur = " +off.getAnnonceur().getId_anonceur() + ","
                    +" id_contrat = " +off.getContrat().getId_contrat() + ","
                    +" id_metier = " +off.getMetier().getId_metier() + ","
                    +" id_domaine = " +off.getDomaine().getId_domaine() + ","
                    +" id_media = " +off.getMedia().getId_media()
                    +" WHERE id_offre = " + off.getId_offre()
            );
            
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    
    public static void SupprimerOffre(Connection cnx, Offre off) throws Exception{
             
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            stmt.executeUpdate("DELETE FROM offre "
                    +" WHERE id_offre = " + off.getId_offre() + ";");
            
          
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
    
    public static ArrayList<Offre> ListerOffre(Connection cnx){
        ArrayList<Offre> liste = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
           ResultSet rs = stmt.executeQuery("SELECT id_offre, int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, validation_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_media"
                    + " FROM offre"
                    + " WHERE validation_offre = 1;");
                                        
            while(rs.next()){
                long id = rs.getLong(1);
                String int_offre = rs.getString(2);
                String ref_offre = rs.getString(3);
                String date_offre = rs.getString(4);
                int duree_offre = rs.getInt(5);
                String date_deb_offre = rs.getString(6);
                String loc_offre = rs.getString(7);
                String desc_offre = rs.getString(8);
                int valid_offre = rs.getInt(9);
                long id_annonceur = rs.getInt(10);
                long id_contrat = rs.getInt(11);
                long id_metier = rs.getInt(12);
                long id_domaine = rs.getInt(13);    
                long id_media = rs.getLong(14);
                
                Annonceur ann = AnnonceurDAO.TrouverAnnonceurId(cnx, id_annonceur);
                Contrat con = ContratDAO.TrouverContratId(cnx, id_contrat);
                Metier met = MetierDAO.TrouverMetierId(cnx, id_metier);
                Domaine dom = DomaineDAO.TrouverDomaineId(cnx, id_domaine);           
                Media med = MediaDAO.TrouverMediaId(cnx, id_media);
                
                Offre off = new Offre(int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, valid_offre, ann, con, met, dom);
                off.setMedia(med);
                off.setId_offre((int)id);
                
                liste.add(off);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex){
                }
        }
        return liste;
    }
    
    public static ArrayList<Offre> ListerOffreNonValide(Connection cnx){
        ArrayList<Offre> liste = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_offre, int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, validation_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_media"
                    + " FROM offre"
                    + " WHERE validation_offre = 0;");
                    
            while(rs.next()){
                long id = rs.getLong(1);
                String int_offre = rs.getString(2);
                String ref_offre = rs.getString(3);
                String date_offre = rs.getString(4);
                int duree_offre = rs.getInt(5);
                String date_deb_offre = rs.getString(6);
                String loc_offre = rs.getString(7);
                String desc_offre = rs.getString(8);
                int valid_offre = rs.getInt(9);
                long id_annonceur = rs.getInt(10);
                long id_contrat = rs.getInt(11);
                long id_metier = rs.getInt(12);
                long id_domaine = rs.getInt(13);    
                long id_media = rs.getLong(14);
                
                Annonceur ann = AnnonceurDAO.TrouverAnnonceurId(cnx, id_annonceur);
                Contrat con = ContratDAO.TrouverContratId(cnx, id_contrat);
                Metier met = MetierDAO.TrouverMetierId(cnx, id_metier);
                Domaine dom = DomaineDAO.TrouverDomaineId(cnx, id_domaine);           
                Media med = MediaDAO.TrouverMediaId(cnx, id_media);
                
                Offre off = new Offre(int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, valid_offre, ann, con, met, dom);
                off.setMedia(med);
                off.setId_offre((int)id);
                
                liste.add(off);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex){
                }
        }
        return liste;
    }
    
    public static Offre TrouverOffreId(Connection cnx, long id_offre){
        Offre offre = null;
        Statement stmt = null;        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_offre, int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, validation_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_media"
                    + " FROM offre"
                    + " WHERE validation_offre = 1;");
            if(rs.next()){
                
                String int_offre = rs.getString(2);
                String ref_offre = rs.getString(3);
                String date_offre = rs.getString(4);
                int duree_offre = rs.getInt(5);
                String date_deb_offre = rs.getString(6);
                String loc_offre = rs.getString(7);        
                String desc_offre = rs.getString(8);
                int valid_offre = rs.getInt(9);
                long id_annonceur = rs.getInt(10);
                long id_contrat = rs.getInt(11);
                long id_metier = rs.getInt(12);
                long id_domaine = rs.getInt(13);    
                long id_media = rs.getLong(14);
                
                Annonceur ann = AnnonceurDAO.TrouverAnnonceurId(cnx, id_annonceur);
                Contrat con = ContratDAO.TrouverContratId(cnx, id_contrat);
                Metier met = MetierDAO.TrouverMetierId(cnx, id_metier);
                Domaine dom = DomaineDAO.TrouverDomaineId(cnx, id_domaine);           
                Media med = MediaDAO.TrouverMediaId(cnx, id_media);
                
                offre = new Offre(int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, valid_offre, ann, con, met, dom );              
                offre.setId_offre((int) id_offre);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex){
                }
        }
        return offre;
    }
    
    public static Offre TrouverOffreInt(Connection cnx, String int_offre){
        Offre offre = null;
        Statement stmt = null;        
        try {
            stmt = cnx.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_offre, int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, validation_offre, id_annonceur, id_contrat, id_metier, id_domaine, id_media"
                    + " FROM offre"
                    + " WHERE int_offre = '" + int_offre + "'");
            if(rs.next()){
                
                int id_offre = rs.getInt(1);
                String ref_offre = rs.getString(3);
                String date_offre = rs.getString(4);
                int duree_offre = rs.getInt(5);
                String date_deb_offre = rs.getString(6);
                String loc_offre = rs.getString(7);        
                String desc_offre = rs.getString(8);
                int valid_offre = rs.getInt(9);
                long id_annonceur = rs.getInt(10);
                long id_contrat = rs.getInt(11);
                long id_metier = rs.getInt(12);
                long id_domaine = rs.getInt(13);    
                long id_media = rs.getLong(14);
                
                Annonceur ann = AnnonceurDAO.TrouverAnnonceurId(cnx, id_annonceur);
                Contrat con = ContratDAO.TrouverContratId(cnx, id_contrat);
                Metier met = MetierDAO.TrouverMetierId(cnx, id_metier);
                Domaine dom = DomaineDAO.TrouverDomaineId(cnx, id_domaine);           
                Media med = MediaDAO.TrouverMediaId(cnx, id_media);
                
                offre = new Offre(int_offre, ref_offre, date_offre, duree_offre, date_deb_offre, loc_offre, desc_offre, valid_offre, ann, con, met, dom );     
                offre.setMedia(med);
                offre.setId_offre(id_offre);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException ex){
                }
        }
        return offre;
    }
    
     public static void ValiderOffre(Connection cnx, Offre off) throws Exception{
        
         System.out.println(off.getId_offre());
         
        Statement stmt = null;
        try {            
            stmt = cnx.createStatement();
            
            int validation_offre = 1;          
            stmt.executeUpdate("UPDATE offre SET"  
                    +" validation_offre = " + validation_offre
                    +" WHERE id_offre = '" + off.getId_offre() + "'"
            );
            
        } catch (Exception ex) {
         ex.printStackTrace();
        } finally {
            
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
}
