package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TableDesPlaces database table.
 * 
 */
@Entity
@Table(name="TableDesPlaces")
public class TableDesPlaces implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IdPlace")
	private int idPlace;

	@Column(name="NomPlace")
	private String nomPlace;

	@Column(name="Pays")
	private String pays;

	//bi-directional many-to-one association to TableAcquisitionDenree
	@OneToMany(mappedBy="tableDesPlaces")
	private List<TableAcquisitionDenree> tableAcquisitionDenrees;

	public TableDesPlaces() {
	}

	public int getIdPlace() {
		return this.idPlace;
	}

	public void setIdPlace(int idPlace) {
		this.idPlace = idPlace;
	}

	public String getNomPlace() {
		return this.nomPlace;
	}

	public void setNomPlace(String nomPlace) {
		this.nomPlace = nomPlace;
	}

	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<TableAcquisitionDenree> getTableAcquisitionDenrees() {
		return this.tableAcquisitionDenrees;
	}

	public void setTableAcquisitionDenrees(List<TableAcquisitionDenree> tableAcquisitionDenrees) {
		this.tableAcquisitionDenrees = tableAcquisitionDenrees;
	}

	public TableAcquisitionDenree addTableAcquisitionDenree(TableAcquisitionDenree tableAcquisitionDenree) {
		getTableAcquisitionDenrees().add(tableAcquisitionDenree);
		tableAcquisitionDenree.setTableDesPlaces(this);

		return tableAcquisitionDenree;
	}

	public TableAcquisitionDenree removeTableAcquisitionDenree(TableAcquisitionDenree tableAcquisitionDenree) {
		getTableAcquisitionDenrees().remove(tableAcquisitionDenree);
		tableAcquisitionDenree.setTableDesPlaces(null);

		return tableAcquisitionDenree;
	}

}