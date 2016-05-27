/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author alexis
 */
public class Authentification {
    private String email_authentification;
    private String password_authentification;

    public Authentification(String email_authentification, String password_authentification) {
        this.email_authentification = email_authentification;
        this.password_authentification = password_authentification;
    }

    public String getEmail_authentification() {
        return email_authentification;
    }

    public void setEmail_authentification(String email_authentification) {
        this.email_authentification = email_authentification;
    }

    public String getPassword_authentification() {
        return password_authentification;
    }

    public void setPassword_authentification(String password_authentification) {
        this.password_authentification = password_authentification;
    }
    
    
}
