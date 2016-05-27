/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Diffuseur;
import Class.Offre;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author
 * Alexis
 */
public class Offre_Diffuseur {
     public static void CreerOffre_Diffuseur(Connection cnx, Diffuseur dif, Offre off) throws Exception{
          
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            
            stmt.executeUpdate("INSERT INTO offre_diffuseur (id_offre, id_diffuseur) "
                    + "VALUES (" + off.getId_offre()                  
                    + ", " + dif.getId_diffuseur()
                    + ")"); 
            
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
     
     public static void SupprimerOffre_Diffuseur(Connection cnx, Offre off) throws Exception{
          
        Statement stmt = null;
        
        try {
            stmt = cnx.createStatement();
            
            stmt.executeUpdate("DELETE FROM offre_diffuseur "
                    + "WHERE id_offre =" + off.getId_offre()                         
                    + ";"); 
            
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
