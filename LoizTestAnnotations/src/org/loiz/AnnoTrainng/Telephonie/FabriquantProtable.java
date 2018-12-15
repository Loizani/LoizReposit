package org.loiz.AnnoTrainng.Telephonie;

public class FabriquantProtable {

	private String FP_NomFabricantCellular ;
	private String FP_Composant ;
	private int    FP_Prix ;
	
	public FabriquantProtable(String fP_NomFabricantCellular,
			String fP_Composant, int fP_Prix) {
		super();
		FP_NomFabricantCellular = fP_NomFabricantCellular;
		FP_Composant = fP_Composant;
		FP_Prix = fP_Prix;
	}

	@Override
	public String toString() {
		return "FabriquantProtable [FP_NomFabricantCellular="
				+ FP_NomFabricantCellular + ", FP_Composant=" + FP_Composant
				+ ", FP_Prix=" + FP_Prix + "]";
	}

	public String getFP_NomFabricantCellular() {
		return FP_NomFabricantCellular;
	}

	public void setFP_NomFabricantCellular(String fP_NomFabricantCellular) {
		FP_NomFabricantCellular = fP_NomFabricantCellular;
	}

	public String getFP_Composant() {
		return FP_Composant;
	}

	public void setFP_Composant(String fP_Composant) {
		FP_Composant = fP_Composant;
	}

	public int getFP_Prix() {
		return FP_Prix;
	}

	public void setFP_Prix(int fP_Prix) {
		FP_Prix = fP_Prix;
	}		
	
	
	
}
