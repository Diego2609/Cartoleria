package it.dstech.cartoleria.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProdotto;
	private String nome;
	private int qtaProdotto;

	public Prodotto() {
	}

	public Long getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(Long idProdotto) {
		this.idProdotto = idProdotto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtaProdotto() {
		return qtaProdotto;
	}

	public void setQtaProdotto(int qtaProdotto) {
		this.qtaProdotto = qtaProdotto;
	}

}
