package com.github.lucasdevrj.bombafilmes.modelos;

public class Filme {

	private Integer id;
	private String nome;
	private String sinopse;
	private String faixaEtaria;
	private String genero;
	private String elenco;
	private String urlImagem;
	
	public Filme(String nome, String sinopse, String faixaEtaria, String genero, 
			String elenco, String urlImagem) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.faixaEtaria = faixaEtaria;
		this.genero = genero;
		this.elenco = elenco;
		this.urlImagem = urlImagem;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getElenco() {
		return elenco;
	}
	
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	
	public String getUrlImagem() {
		return urlImagem;
	}
	
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	public Integer getId() {
		return id;
	}
}
