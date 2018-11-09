package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TableAcquisitionDenrees database table.
 * 
 */
@Entity
@Table(name="TableAcquisitionDenrees")
public class TableAcquisitionDenree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IdAcquisition")
	private int idAcquisition;

	@Column(name="DateAcquisition")
	private String dateAcquisition;

	@Column(name="MontantAcquisition")
	private int montantAcquisition;

	//bi-directional many-to-one association to TableDesDenree
	@ManyToOne
	@JoinColumn(name="IdDenreeExt")
	private TableDesDenree tableDesDenree;

	//bi-directional many-to-one association to TableDesPlace
	@ManyToOne
	@JoinColumn(name="IdPlaceExt")
	private TableDesPlaces tableDesPlaces;

	public TableAcquisitionDenree() {
	}

	public int getIdAcquisition() {
		return this.idAcquisition;
	}

	public void setIdAcquisition(int idAcquisition) {
		this.idAcquisition = idAcquisition;
	}

	public String getDateAcquisition() {
		return this.dateAcquisition;
	}

	public void setDateAcquisition(String dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public int getMontantAcquisition() {
		return this.montantAcquisition;
	}

	public void setMontantAcquisition(int montantAcquisition) {
		this.montantAcquisition = montantAcquisition;
	}

	public TableDesDenree getTableDesDenree() {
		return this.tableDesDenree;
	}

	public void setTableDesDenree(TableDesDenree tableDesDenree) {
		this.tableDesDenree = tableDesDenree;
	}

	public TableDesPlaces getTableDesPlaces() {
		return this.tableDesPlaces;
	}

	public void setTableDesPlaces(TableDesPlaces tableDesPlaces) {
		this.tableDesPlaces = tableDesPlaces;
	}

}