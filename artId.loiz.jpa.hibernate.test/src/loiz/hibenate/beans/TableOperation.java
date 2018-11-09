package loiz.hibenate.beans;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the TableOperations database table.
 * 
 */
@Entity
@Table(name="TableOperations", 
uniqueConstraints=@UniqueConstraint(columnNames={"DateOperation","SocieteOperation"}))
//@NamedQuery(name="TableOperation.findAll", query="SELECT t FROM TableOperation t")
public class TableOperation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdOperation")
	private int idOperation;

	@Column(name="DateOperation")
	private String dateOperation;

	@Column(name="SocieteOperation")
	private String societeOperation;

	//bi-directional many-to-one association to TableAcquisition
	@OneToMany(mappedBy="tableOperation")
	private List<TableAcquisition> tableAcquisitions;

	public TableOperation() {
	}



	public String getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getSocieteOperation() {
		return this.societeOperation;
	}

	public void setSocieteOperation(String societeOperation) {
		this.societeOperation = societeOperation;
	}

	public List<TableAcquisition> getTableAcquisitions() {
		return this.tableAcquisitions;
	}

	public void setTableAcquisitions(List<TableAcquisition> tableAcquisitions) {
		this.tableAcquisitions = tableAcquisitions;
	}

	public TableAcquisition addTableAcquisition(TableAcquisition tableAcquisition) {
		getTableAcquisitions().add(tableAcquisition);
		tableAcquisition.setTableOperation(this);

		return tableAcquisition;
	}

	public TableAcquisition removeTableAcquisition(TableAcquisition tableAcquisition) {
		getTableAcquisitions().remove(tableAcquisition);
		tableAcquisition.setTableOperation(null);

		return tableAcquisition;
	}

}