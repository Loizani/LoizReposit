package loiz.packagehibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="EntityDetailAliment")
@Table(name="DetailAliment")
public class EntityDetailAliment {	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDALIMENT")
    private Integer idAlim;
	@Column(name="NomAliment")
	private String sNomAliment ;   //nom usuel de l'aliment
	@Column(name="TypeAliment")
	private String sTypeAliment ;  //fruit, legume
	@Column(name="TypeMatiere")
	private String sTypeMatiere  ; //solide, liquide, poudre
	
	public EntityDetailAliment() {
		super();	
	}

	public String getsNomAliment() {
		return sNomAliment;
	}

	public void setsNomAliment(String sNomAliment) {
		this.sNomAliment = sNomAliment;
	}

	public String getsTypeAliment() {
		return sTypeAliment;
	}

	public void setsTypeAliment(String sTypeAliment) {
		this.sTypeAliment = sTypeAliment;
	}

	public String getsTypeMatiere() {
		return sTypeMatiere;
	}

	public void setsTypeMatiere(String sTypeMatiere) {
		this.sTypeMatiere = sTypeMatiere;
	}

	@Override
	public String toString() {
		return "EntityFullNomAliment [sNomAliment=" + sNomAliment + ", sTypeAliment=" + sTypeAliment + ", sTypeMatiere="
				+ sTypeMatiere + "]";
	}		

}
