package m2tiw.CatalogueProduits.Control;

import java.util.List;
import java.util.Optional;
import m2tiw.CatalogueProduits.Entity.Produit;
import m2tiw.CatalogueProduits.serviceDAO.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControleurProduit {
	
	@Autowired
	private ProduitRepository prodRepo;
	
	@GetMapping("/produits")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Produit> produits(){
		List<Produit> produits=(List<Produit>) prodRepo.findAll();
		return produits;
	}
	
	@PostMapping(value="/ajoutProduit",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes="application/json")
	@CrossOrigin(origins = "http://localhost:4200")
	Produit ajoutProduit(@RequestBody Produit p) {
		return prodRepo.save(p);
	}
	
	@GetMapping("/produits/{idCat}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Produit> produitsbyCat(@PathVariable(name="idCat") Iterable<Integer> idCat){
		List<Produit> prodbycat= (List<Produit>) prodRepo.findAllById(idCat);
		return prodbycat;
	}

}
