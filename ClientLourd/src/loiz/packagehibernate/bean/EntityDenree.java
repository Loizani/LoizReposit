package loiz.packagehibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="EntityDenree")
@Table(name="TableDenrees")

public class EntityDenree {	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDDENREE")
    private Integer idDenree;
	@Column(name="NomDenree")      //Nom usuel de l'aliment
	private String sNomDenree ;   
	@Column(name="UniteValeur")     //Par tonne, par kilo, par litre, metre cube
	private String sUniteValeur ;  
	@Column(name="ValeurCotation")  //Valeur en euro par unité de valeur
	private int iValeurCotation  ; 
	
	public EntityDenree() {
		super();	
	}



	public Integer getIdDenree() {
		return idDenree;
	}



	public void setIdDenree(Integer idDenree) {
		this.idDenree = idDenree;
	}



	public String getsNomDenree() {
		return sNomDenree;
	}



	public void setsNomDenree(String sNomDenree) {
		this.sNomDenree = sNomDenree;
	}



	public String getsUniteValeur() {
		return sUniteValeur;
	}

	public void setsUniteValeur(String sUniteValeur) {
		this.sUniteValeur = sUniteValeur;
	}

	public int getiValeurCotation() {
		return iValeurCotation;
	}

	public void setiValeurCotation(int iValeurCotation) {
		this.iValeurCotation = iValeurCotation;
	}

	

}
