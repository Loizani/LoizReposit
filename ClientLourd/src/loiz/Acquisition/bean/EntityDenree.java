package loiz.Acquisition.bean;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name="EntityDenree")
@Table(name="TableDenrees")
public class EntityDenree {	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDDENREE")
    private long idDenree;
	@Column(name="NomDenree")      //Nom usuel de l'aliment
	private String sNomDenree ;   
	@Column(name="UniteValeur")     //Par tonne, par kilo, par litre, metre cube
	private String sUniteValeur ;  
	@Column(name="ValeurCotation")  //Valeur en euro par unité de valeur
	private int iValeurCotation  ; 
	
	@OneToMany(targetEntity=EntityJoinDetailAcquisition.class,mappedBy = "AttrJoinDENREE")
    List<EntityJoinDetailAcquisition> attrListeAcquiDen ; 
	
	public EntityDenree() {
		super();	
	}

	public List<EntityJoinDetailAcquisition> getAttrListeAcquiDen() {
		return attrListeAcquiDen;
	}



	public void setAttrListeAcquiDen(List<EntityJoinDetailAcquisition> attrListeAcquiDen) {
		this.attrListeAcquiDen = attrListeAcquiDen;
	}



	public long getIdDenree() {
		return idDenree;
	}



	public void setIdDenree(long idDenree) {
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
