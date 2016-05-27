/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Authentification;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author alexis
 */
public class AuthentificationDAO {
    public static Boolean Connexion(Connection cnx, Authentification auth){
        Boolean connexion_ok = false;
        Statement stmt = null;
        
        try{
            stmt =  cnx.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT login_compte, password_compte"
                    + " FROM compte"
                    + " WHERE login_compte = '" + auth.getEmail_authentification() + "' AND password_compte= '" + auth.getPassword_authentification() + "'");
            
             if (rs.next()){
                    connexion_ok = true;
                    return connexion_ok; 
                    
               }else{
                    return connexion_ok; 
             }
            
        } catch (Exception e) {
            
        }finally {
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException ex) {
                }
            }
        }
        return null;
    }
}
