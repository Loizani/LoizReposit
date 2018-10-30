

package  loiz.packagehibernate.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.persistence.Transient;


@Entity(name="ENTITECOURSE")
@Table(name="LISTECOURSES")
public class EntityCourse {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDOBJET")
    private Integer id;
    //@Column(name="LibAliment") //si la colonne n'existe pas elle est crée en fin de table
    private String libelle;
    //@Transient
    private Integer quantite;
    @OneToOne
    private EntityDetailAliment entFuNa ;    
    
    public EntityCourse() {
		super();
	}


	public Integer getId() {
        return id;
    }

    public void setId(final Integer pId) {
        id = pId;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(final String pLibelle) {
        libelle = pLibelle;
    }

   public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(final Integer pQuantite) {
        quantite = pQuantite;
    }

	public EntityDetailAliment getEntFuNa() {
		return entFuNa;
	}

	public void setEntFuNa(EntityDetailAliment entFuNa) {
		this.entFuNa = entFuNa;
	}

    
	@Override
	public String toString() {
		return "EntityCourse [id=" + id + ", libelle=" + libelle + ", quantite=" + quantite + "]";
	}
    
    
}
