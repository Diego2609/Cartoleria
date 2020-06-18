package it.dstech.cartoleria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.cartoleria.models.Prodotto;
import it.dstech.cartoleria.repository.ProductsRepository;

@Service
@Transactional
public class ProductsService {
	@Autowired
	ProductsRepository repo;

	public void save(Prodotto prodotto) {
		repo.save(prodotto);
	}

	public List<Prodotto> listAll() {
		return (List<Prodotto>) repo.findAll();
	}

	public Prodotto get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public List<Prodotto> search(String keyword) {
		return repo.search(keyword);
	}
}
