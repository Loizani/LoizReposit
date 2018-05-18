package test.javabeanpac ;
import java.io.Serializable;

public class Personne implements Serializable { 
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nom; 
private String prenom;  

public Personne() {}

public Personne(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}


public void setNom (String nom) { 
this.nom = nom; 
} 

 public String getNom() { 
return (this.nom); 
} 
 public void setPrenom (String prenom) { 
this.prenom = prenom; 
}  
public String getPrenom () {
 return (this.prenom); 
}  

}