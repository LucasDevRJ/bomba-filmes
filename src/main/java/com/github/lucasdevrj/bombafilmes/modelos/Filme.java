package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.Date;

public class Filme {

	private Integer id;
	private String nome;
	private String sinopse;
	private String faixaEtaria;
	private String genero;
	private String elenco;
	private String duracao;
	private String imagem;
	private String dataLancamento;
	
	public Filme(String nome, String sinopse, String faixaEtaria, String genero, 
			String elenco, String duracao, String imagem, String dataLancamento) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.faixaEtaria = faixaEtaria;
		this.genero = genero;
		this.elenco = elenco;
		this.duracao = duracao;
		this.imagem = imagem;
		this.dataLancamento = dataLancamento;
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
	
	public Integer getId() {
		return id;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public String getDuracao() {
		return duracao;
	}
	
	public String getImagem() {
		return imagem;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
