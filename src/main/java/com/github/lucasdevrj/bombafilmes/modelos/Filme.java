package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.Date;

public class Filme {

	private Integer id;
	private String nome;
	private String sinopse;
	private Integer faixaEtaria;
	private String genero;
	private String elenco;
	private Integer duracao;
	private String imagem;
	private Date dataLancamento;
	
	public Filme(String nome, String sinopse, Integer faixaEtaria, String genero, 
			String elenco, Integer duracao, String imagem) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.faixaEtaria = faixaEtaria;
		this.genero = genero;
		this.elenco = elenco;
		this.duracao = duracao;
		this.imagem = imagem;
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
	
	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}
	
	public void setFaixaEtaria(Integer faixaEtaria) {
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
	
	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}
	
	public Integer getDuracao() {
		return duracao;
	}
	
	public String getImagem() {
		return imagem;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public Date getDataLancamento() {
		return dataLancamento;
	}
	
	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
}
