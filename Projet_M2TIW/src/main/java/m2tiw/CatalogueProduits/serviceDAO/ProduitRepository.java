package m2tiw.CatalogueProduits.serviceDAO;

import java.util.Collection;
import java.util.List;
import m2tiw.CatalogueProduits.Entity.*;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProduitRepository extends CrudRepository<Produit,Integer>{


}
