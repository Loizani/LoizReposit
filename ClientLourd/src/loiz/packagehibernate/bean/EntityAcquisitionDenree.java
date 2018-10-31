package  loiz.packagehibernate.bean;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity(name="ACHATDENREE")
@Table(name="TABLEACHATDENREE")
public class EntityAcquisitionDenree {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IDACHAT")
    private Integer id;
    @Column(name="LibNomPlaceFic") //
    private String sLibNomPlaceFic;
    //@Transient
    @Column(name="DateAcquisition") 
    private String dateAcquisition;
    
    @OneToMany
    private List <EntityDenree> attrListCotAlim ; //L'entité est désormais constituée d'une liste   
    
    public EntityAcquisitionDenree() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(final Integer pId) {
        id = pId;
    }


	public String getsLibAcquisition() {
		return sLibNomPlaceFic;
	}


	public void setsLibAcquisition(String sLibAcquisition) {
		this.sLibNomPlaceFic = sLibAcquisition;
	}


	public String getDateAcquisition() {
		return dateAcquisition;
	}


	public void setDateAcquisition() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		Date date;
		try {
			date = formatter.parse(formatter.format(today));
			this.dateAcquisition = date.toString();
		} catch (ParseException e) {			
			e.printStackTrace();
		}		 
		
	}


	public List<EntityDenree> getAttrListCotAlim() {
		return attrListCotAlim;
	}


	public void setAttrListCotAlim(List<EntityDenree> attrListCotAlim) {
		this.attrListCotAlim = attrListCotAlim;
	}


	@Override
	public String toString() {
		return "EntityAcquisitionDenree [id=" + id + ", sLibNomPlaceFic=" + sLibNomPlaceFic + ", dateAcquisition="
				+ dateAcquisition + ", attrListCotAlim=" + attrListCotAlim + "]";
	}
    
	
    
}
