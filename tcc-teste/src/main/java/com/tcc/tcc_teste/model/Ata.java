package com.tcc.tcc_teste.model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ata {
	private char titulo;
	private String dataEmissao;
	private String inicio;
	private String termino;
	private char pauta;
	private char descriçao;
	private char palavrasChaves;
	private char tipo;
	private char status;
	private Scanner scanner;
	
	public Ata() {
		scanner=new Scanner(System.in);
	}
	
	public void emitir() {
		System.out.println("Inicio (formato:dd/mm/yyyy): ");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDate date1 = LocalDate.parse(inicio, formatter1);  

		System.out.println("Termino: ");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDate date2 = LocalDate.parse(termino, formatter2);  
		
		System.out.println("Setor: ");
		
		System.out.println("Título: ");
		titulo=scanner.next().charAt(0);
		
		System.out.println("Pauta: ");
		pauta=scanner.next().charAt(0);
		
		System.out.println("Descrição: ");
		descriçao=scanner.next().charAt(0);
		
		System.out.println("Tipo: ");
		tipo=scanner.next().charAt(0);
		
		System.out.println("Palavras chaves: ");
		palavrasChaves=scanner.next().charAt(0);
		
		System.out.println("Membro externo: ");
		
		System.out.println("Matricula: ");
		
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
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getTermino() {
		return termino;
	}
	public void setTermino(String termino) {
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
}