package m2tiw.CatalogueProduits.Control;
import m2tiw.CatalogueProduits.Entity.*;
import java.util.List;
import java.util.Optional;
import m2tiw.CatalogueProduits.Entity.Produit;
import m2tiw.CatalogueProduits.serviceDAO.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControleurCategorie {
	
	@Autowired
	private CategorieRepository catRepo;
	
	@GetMapping("/Categorie")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Categorie> categories(){
		List<Categorie> categories=(List<Categorie>) catRepo.findAll();
		return categories ;
	}
	
	

}
