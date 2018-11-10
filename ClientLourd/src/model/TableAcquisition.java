package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TableAcquisitions database table.
 * 
 */
@Entity
@Table(name="TableAcquisitions", 
uniqueConstraints=@UniqueConstraint(columnNames={"IdExtDenree", "IdExtOperation", "IdExtPlace"}))

//@NamedQuery(name="TableAcquisition.findAll", query="SELECT t FROM TableAcquisition t")
public class TableAcquisition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdAcquisition")
	private int idAcquisition;

	@Column(name="MontantAcquisition")
	private double montantAcquisition;

	//bi-directional many-to-one association to TableDenree
	@ManyToOne
	@JoinColumn(name="IdExtDenree")
	private TableDenree tableDenree;

	//bi-directional many-to-one association to TableOperation
	@ManyToOne
	@JoinColumn(name="IdExtOperation")
	private TableOperation tableOperation;

	//bi-directional many-to-one association to TablePlace
	@ManyToOne
	@JoinColumn(name="IdExtPlace")
	private TablePlace tablePlace;

	public TableAcquisition() {
	}


	public double getMontantAcquisition() {
		return this.montantAcquisition;
	}

	public void setMontantAcquisition(double montantAcquisition) {
		this.montantAcquisition = montantAcquisition;
	}

	public TableDenree getTableDenree() {
		return this.tableDenree;
	}

	public void setTableDenree(TableDenree tableDenree) {
		this.tableDenree = tableDenree;
	}

	public TableOperation getTableOperation() {
		return this.tableOperation;
	}

	public void setTableOperation(TableOperation tableOperation) {
		this.tableOperation = tableOperation;
	}

	public TablePlace getTablePlace() {
		return this.tablePlace;
	}

	public void setTablePlace(TablePlace tablePlace) {
		this.tablePlace = tablePlace;
	}

}