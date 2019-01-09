package key.objet;

public class produit {

	private String strReference ;
	private String strDesignation ;
	private int iPrix ;
	private boolean bSolded ;	
		
	public produit() {
		super();
	}
	public produit(String strReference, String strDesignation, int iPrix,
			boolean bSolded) {
		super();
		this.strReference = strReference;
		this.strDesignation = strDesignation;
		this.iPrix = iPrix;
		this.bSolded = bSolded;
	}
	public String getStrReference() {
		return strReference;
	}
	public void setStrReference(String strReference) {
		this.strReference = strReference;
	}
	public String getStrDesignation() {
		return strDesignation;
	}
	public void setStrDesignation(String strDesignation) {
		this.strDesignation = strDesignation;
	}
	public int getiPrix() {
		return iPrix;
	}
	public void setiPrix(int iPrix) {
		this.iPrix = iPrix;
	}
	public boolean isbSolded() {
		return bSolded;
	}
	public void setbSolded(boolean bSolded) {
		this.bSolded = bSolded;
	} 
	
	
}
