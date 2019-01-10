package key.objet.beans;

public class magasin {

	private String strNomMag ;
	private String strAdresseMag ;
	private boolean bGrandEnseigne ;	
		
	public magasin() {
		super();
	}

	public magasin(String strNomMag, String strAdresseMag,
			boolean bGrandEnseigne) {
		super();
		this.strNomMag = strNomMag;
		this.strAdresseMag = strAdresseMag;
		this.bGrandEnseigne = bGrandEnseigne;
	}

	public String getStrNomMag() {
		return strNomMag;
	}

	public void setStrNomMag(String strNomMag) {
		this.strNomMag = strNomMag;
	}

	public String getStrAdresseMag() {
		return strAdresseMag;
	}

	public void setStrAdresseMag(String strAdresseMag) {
		this.strAdresseMag = strAdresseMag;
	}

	public boolean isbGrandEnseigne() {
		return bGrandEnseigne;
	}

	public void setbGrandEnseigne(boolean bGrandEnseigne) {
		this.bGrandEnseigne = bGrandEnseigne;
	}
	
	
	
}
