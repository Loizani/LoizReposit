package loiz.hibenate.beans;

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
	private TableDenrees tableDenree;

	//bi-directional many-to-one association to TableOperation
	@ManyToOne
	@JoinColumn(name="IdExtOperation")
	private TableOperation tableOperation;

	//bi-directional many-to-one association to TablePlace
	@ManyToOne
	@JoinColumn(name="IdExtPlace")
	private TablePlaces tablePlaces;

	public TableAcquisition(TablePlaces ArgObjtablePlaces, TableOperation ArgObjtableOperation, TableDenrees ArgObjtableDenree, double ArgmontantAcquisition ) {
		this.tablePlaces = ArgObjtablePlaces;
		this.tableOperation = ArgObjtableOperation ;
		this.tableDenree = ArgObjtableDenree ;
		this.montantAcquisition = ArgmontantAcquisition ;
	}
	
	public TableAcquisition() {
	}

	public double getMontantAcquisition() {
		return this.montantAcquisition;
	}

	public void setMontantAcquisition(double montantAcquisition) {
		this.montantAcquisition = montantAcquisition;
	}

	public TableDenrees getTableDenree() {
		return this.tableDenree;
	}

	public void setTableDenree(TableDenrees tableDenree) {
		this.tableDenree = tableDenree;
	}

	public TableOperation getTableOperation() {
		return this.tableOperation;
	}

	public void setTableOperation(TableOperation tableOperation) {
		this.tableOperation = tableOperation;
	}

	public TablePlaces getTablePlaces() {
		return this.tablePlaces;
	}

	public void setTablePlaces(TablePlaces tablePlaces) {
		this.tablePlaces = tablePlaces;
	}

}