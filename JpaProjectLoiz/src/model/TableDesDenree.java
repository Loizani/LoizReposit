package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TableDesDenrees database table.
 * 
 */
@Entity
@Table(name="TableDesDenrees")
public class TableDesDenree implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="IdDenree")
	private int idDenree;

	@Column(name="NomDenree")
	private String nomDenree;

	@Column(name="PrixParUnite")
	private int prixParUnite;

	@Column(name="UniteValeurDenree")
	private String uniteValeurDenree;

	//bi-directional many-to-one association to TableAcquisitionDenree
	@OneToMany(mappedBy="tableDesDenree")
	private List<TableAcquisitionDenree> tableAcquisitionDenrees;

	public TableDesDenree() {
	}

	public int getIdDenree() {
		return this.idDenree;
	}

	public void setIdDenree(int idDenree) {
		this.idDenree = idDenree;
	}

	public String getNomDenree() {
		return this.nomDenree;
	}

	public void setNomDenree(String nomDenree) {
		this.nomDenree = nomDenree;
	}

	public int getPrixParUnite() {
		return this.prixParUnite;
	}

	public void setPrixParUnite(int prixParUnite) {
		this.prixParUnite = prixParUnite;
	}

	public String getUniteValeurDenree() {
		return this.uniteValeurDenree;
	}

	public void setUniteValeurDenree(String uniteValeurDenree) {
		this.uniteValeurDenree = uniteValeurDenree;
	}

	public List<TableAcquisitionDenree> getTableAcquisitionDenrees() {
		return this.tableAcquisitionDenrees;
	}

	public void setTableAcquisitionDenrees(List<TableAcquisitionDenree> tableAcquisitionDenrees) {
		this.tableAcquisitionDenrees = tableAcquisitionDenrees;
	}

	public TableAcquisitionDenree addTableAcquisitionDenree(TableAcquisitionDenree tableAcquisitionDenree) {
		getTableAcquisitionDenrees().add(tableAcquisitionDenree);
		tableAcquisitionDenree.setTableDesDenree(this);

		return tableAcquisitionDenree;
	}

	public TableAcquisitionDenree removeTableAcquisitionDenree(TableAcquisitionDenree tableAcquisitionDenree) {
		getTableAcquisitionDenrees().remove(tableAcquisitionDenree);
		tableAcquisitionDenree.setTableDesDenree(null);

		return tableAcquisitionDenree;
	}

}