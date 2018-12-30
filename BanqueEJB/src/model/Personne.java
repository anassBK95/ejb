package model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Personne implements Serializable {
    @Id
    @GeneratedValue
    private Integer id ;
    private String nom ;
    private String prenom ;
    private String mail ;
    private String ville ;
    private String tel ;
    @OneToOne(fetch=FetchType.LAZY)
    private User user ;

    public Personne() {
    	
    }

   
    public Personne(String nom, String prenom, String mail, String ville, String tel, User user) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.ville = ville;
		this.tel = tel;
		this.user = user;
	}


	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
    
	

   
}