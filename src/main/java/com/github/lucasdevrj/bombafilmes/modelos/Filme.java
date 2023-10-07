package com.github.lucasdevrj.bombafilmes.modelos;

import java.util.Date;

public class Filme {

	private Integer id;
	private String nome;
	private String sinopse;
	private String faixaEtaria;
	private String genero;
	private String elenco;
	private Date duracao;
	private String imagem;
	private Integer anoLancamento;
	private Usuario usuario;
	
	public Filme(String nome, String sinopse, String faixaEtaria, String genero, 
			String elenco, Date duracao, String imagem, Integer anoLancamento, 
			Usuario usuario) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.faixaEtaria = faixaEtaria;
		this.genero = genero;
		this.elenco = elenco;
		this.duracao = duracao;
		this.imagem = imagem;
		this.anoLancamento = anoLancamento;
		this.usuario = usuario;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
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
	
	
	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}
	
	public Date getDuracao() {
		return duracao;
	}
	
	public String getImagem() {
		return imagem;
	}
	
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public String getUsuario() {
		return usuario.getLogin();
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
