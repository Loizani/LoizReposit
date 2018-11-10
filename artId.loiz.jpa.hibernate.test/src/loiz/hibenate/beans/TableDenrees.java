package loiz.hibenate.beans;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the TableDenrees database table.
 * 
 */
@Entity
@Table(name="TableDenrees", 
uniqueConstraints=@UniqueConstraint(columnNames={"NomDenree","TypeDenree"}))

//@NamedQuery(name="TableDenree.findAll", query="SELECT t FROM TableDenree t")
public class TableDenrees implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdDenree")
	private int idDenree;

	@Column(name="NomDenree")
	private String nomDenree;

	@Column(name="TypeDenree")
	private String typeDenree;

	@Column(name="UniteDeVenteDenree")
	private String uniteDeVenteDenree;

	@Column(name="ValeurUniteDenree")
	private String valeurUniteDenree;

	//bi-directional many-to-one association to TableAcquisition
	@OneToMany(mappedBy="tableDenree")
	private List<TableAcquisition> tableAcquisitions;

	public TableDenrees() {
	}
	public TableDenrees(String Arg_nomDenree, String Arg_typeDenree, String Arg_uniteDeVenteDenree, String Arg_valeurUniteDenree) {
		this.setNomDenree(Arg_nomDenree);
		this.setTypeDenree(Arg_typeDenree);
		this.setUniteDeVenteDenree(Arg_uniteDeVenteDenree);
		this.setValeurUniteDenree(Arg_valeurUniteDenree);
	}
	public String getNomDenree() {
		return this.nomDenree;
	}

	public void setNomDenree(String nomDenree) {
		this.nomDenree = nomDenree;
	}

	public String getTypeDenree() {
		return this.typeDenree;
	}

	public void setTypeDenree(String typeDenree) {
		this.typeDenree = typeDenree;
	}

	public String getUniteDeVenteDenree() {
		return this.uniteDeVenteDenree;
	}

	public void setUniteDeVenteDenree(String uniteDeVenteDenree) {
		this.uniteDeVenteDenree = uniteDeVenteDenree;
	}

	public String getValeurUniteDenree() {
		return this.valeurUniteDenree;
	}

	public void setValeurUniteDenree(String valeurUniteDenree) {
		this.valeurUniteDenree = valeurUniteDenree;
	}

	public List<TableAcquisition> getTableAcquisitions() {
		return this.tableAcquisitions;
	}

	public void setTableAcquisitions(List<TableAcquisition> tableAcquisitions) {
		this.tableAcquisitions = tableAcquisitions;
	}

	public TableAcquisition addTableAcquisition(TableAcquisition tableAcquisition) {
		getTableAcquisitions().add(tableAcquisition);
		tableAcquisition.setTableDenree(this);

		return tableAcquisition;
	}

	public TableAcquisition removeTableAcquisition(TableAcquisition tableAcquisition) {
		getTableAcquisitions().remove(tableAcquisition);
		tableAcquisition.setTableDenree(null);

		return tableAcquisition;
	}

}