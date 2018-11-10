package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TablePlaces database table.
 * 
 */
@Entity
@Table(name="TablePlaces", 
uniqueConstraints=@UniqueConstraint(columnNames={"NomPlace"}))
//@NamedQuery(name="TablePlace.findAll", query="SELECT t FROM TablePlace t")
public class TablePlace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdPlace")
	private int idPlace;

	@Column(name="NomPlace")
	private String nomPlace;

	@Column(name="PaysPlace")
	private String paysPlace;

	//bi-directional many-to-one association to TableAcquisition
	@OneToMany(mappedBy="tablePlace")
	private List<TableAcquisition> tableAcquisitions;

	public TablePlace() {
	}

	public String getNomPlace() {
		return this.nomPlace;
	}

	public void setNomPlace(String nomPlace) {
		this.nomPlace = nomPlace;
	}

	public String getPaysPlace() {
		return this.paysPlace;
	}

	public void setPaysPlace(String paysPlace) {
		this.paysPlace = paysPlace;
	}

	public List<TableAcquisition> getTableAcquisitions() {
		return this.tableAcquisitions;
	}

	public void setTableAcquisitions(List<TableAcquisition> tableAcquisitions) {
		this.tableAcquisitions = tableAcquisitions;
	}

	public TableAcquisition addTableAcquisition(TableAcquisition tableAcquisition) {
		getTableAcquisitions().add(tableAcquisition);
		tableAcquisition.setTablePlace(this);

		return tableAcquisition;
	}

	public TableAcquisition removeTableAcquisition(TableAcquisition tableAcquisition) {
		getTableAcquisitions().remove(tableAcquisition);
		tableAcquisition.setTablePlace(null);

		return tableAcquisition;
	}

}