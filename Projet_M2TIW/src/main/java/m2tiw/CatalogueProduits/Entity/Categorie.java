package m2tiw.CatalogueProduits.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Categorie implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue
	@Column(name="idCat")
	private long idCat;
	private String descCategorie;
	
	@OneToMany(mappedBy="cat")
	private List<Produit> produits;
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categorie(long idCat, String descCategorie, List<Produit> produits) {
		super();
		this.idCat = idCat;
		this.descCategorie = descCategorie;
		this.produits = produits;
	}


	public long getIdCat() {
		return idCat;
	}


	public void setIdCat(long idCat) {
		this.idCat = idCat;
	}


	public String getDescCategorie() {
		return descCategorie;
	}


	public void setDescCategorie(String descCategorie) {
		this.descCategorie = descCategorie;
	}


	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
	

	
}
