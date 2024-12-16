package m2tiw.CatalogueProduits.Entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Produit implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long ref;
	private String desc;
	private double pu;
	@ManyToOne
	@JoinColumn(name="idCat")
	private Categorie cat;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(long ref, String desc, double pu, Categorie cat) {
		super();
		this.ref = ref;
		this.desc = desc;
		this.pu = pu;
		this.cat = cat;
	}

	public long getRef() {
		return ref;
	}

	public void setRef(long ref) {
		this.ref = ref;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPu() {
		return pu;
	}

	public void setPu(double pu) {
		this.pu = pu;
	}

	public Categorie getCat() {
		return cat;
	}

	public void setCat(Categorie cat) {
		this.cat = cat;
	}

	

}
