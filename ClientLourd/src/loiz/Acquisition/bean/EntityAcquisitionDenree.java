package  loiz.Acquisition.bean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="ACHATDENREE")
@Table(name="TABLEACHATDENREE")
public class EntityAcquisitionDenree {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDACHAT")
    private long id;
    
    @Column(name="LibNomPlaceFic") //
    private String sLibNomPlaceFic;
    
    @Column(name="DateAcquisition") 
    private String dateAcquisition;   

	@OneToMany(targetEntity=EntityJoinDetailAcquisition.class, mappedBy = "AttrJoinAcquisition")
    List<EntityJoinDetailAcquisition> attrListCotAlim ; 

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getsLibNomPlaceFic() {
		return sLibNomPlaceFic;
	}

	public void setsLibNomPlaceFic(String sLibNomPlaceFic) {
		this.sLibNomPlaceFic = sLibNomPlaceFic;
	}

	public String getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(String dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public List<EntityJoinDetailAcquisition> getAttrListCotAlim() {
		return attrListCotAlim;
	}

	public void setAttrListCotAlim(List<EntityJoinDetailAcquisition> attrListCotAlim) {
		this.attrListCotAlim = attrListCotAlim;
	}
    
 
	
    
}
