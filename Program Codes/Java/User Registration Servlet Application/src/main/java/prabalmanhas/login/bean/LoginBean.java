package prabalmanhas.login.bean;

import java.io.Serializable;

public class LoginBean implements Serializable {
    
	/** PRABAL MANHAS 20BCS4513
     * WORKSHEET 3.3 PBLJ 
     */
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String country;
    private String contact;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}