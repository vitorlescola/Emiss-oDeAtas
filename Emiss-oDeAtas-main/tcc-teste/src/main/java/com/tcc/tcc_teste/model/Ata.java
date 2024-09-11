package com.tcc.tcc_teste.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ata {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private char titulo;
	private Date dataEmissao;
	private Date inicio;
	private Date termino;
	private char pauta;
	private char descriçao;
	private char palavrasChaves;
	private char tipo;
	private char status;
	
	public void emitir() {
		
	}
	public void selecionar() {
		
	}
	public void concluir() {
		
	}
	public void enviarRevisao() {
		
	}
	
	
	
	public char getTitulo() {
		return titulo;
	}
	public void setTitulo(char titulo) {
		this.titulo = titulo;
	}
	public Date getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public Date getInicio() {
		return inicio;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public Date getTermino() {
		return termino;
	}
	public void setTermino(Date termino) {
		this.termino = termino;
	}
	public char getPauta() {
		return pauta;
	}
	public void setPauta(char pauta) {
		this.pauta = pauta;
	}
	public char getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(char descriçao) {
		this.descriçao = descriçao;
	}
	public char getPalavrasChaves() {
		return palavrasChaves;
	}
	public void setPalavrasChaves(char palavrasChaves) {
		this.palavrasChaves = palavrasChaves;
	}
	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}