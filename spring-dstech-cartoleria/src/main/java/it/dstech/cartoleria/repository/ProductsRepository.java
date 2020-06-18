package it.dstech.cartoleria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.dstech.cartoleria.models.Prodotto;

public interface ProductsRepository extends CrudRepository<Prodotto, Long> {
	@Query(value = "SELECT p FROM Prodotto p WHERE p.idProdotto LIKE '%' || :keyword || '%'"
			+ " OR p.nome LIKE '%' || :keyword || '%'" + " OR p.qtaProdotto LIKE '%' || :keyword || '%'")
	public List<Prodotto> search(@Param("keyword") String keyword);

}
