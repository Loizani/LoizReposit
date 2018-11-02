package loiz.Acquisition.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.Table;
import javax.persistence.Entity;

@Entity(name="EntityJoinDetailAcquisition")
//@Table(name="TABLEACHATDENREE_TableDenrees")
public class EntityJoinDetailAcquisition {
	
    @Id
    @GeneratedValue
    @Column(name = "ID_Joint_Acquis") 
	private long id ;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDACHAT") 
	private  EntityAcquisitionDenree AttrJoinAcquisition ;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "IDDENREE") 
    private EntityDenree AttrJoinDENREE ;
    
    @Column(name = "QuantiteChoisie")
	private int iQuantiteChoisieDenree ;
    

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	

	public EntityAcquisitionDenree getAttrJoinAcquisition() {
		return AttrJoinAcquisition;
	}

	public void setListeAttrJoinAcquisition(EntityAcquisitionDenree argAttrJoinAcquisition) {
		AttrJoinAcquisition = argAttrJoinAcquisition;
	}


	public EntityDenree getAttrJoinDENREE() {
		return AttrJoinDENREE;
	}

	public void setAttrJoinDENREE(EntityDenree attrJoinDENREE) {
		this.AttrJoinDENREE = attrJoinDENREE;
	}

	public int getiQuantiteChoisieDenree() {
		return iQuantiteChoisieDenree;
	}

	public void setiQuantiteChoisieDenree(int iQuantiteChoisieDenree) {
		this.iQuantiteChoisieDenree = iQuantiteChoisieDenree;
	}
	
	
}
