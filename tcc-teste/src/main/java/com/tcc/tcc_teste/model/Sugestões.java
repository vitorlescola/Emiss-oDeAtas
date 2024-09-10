package com.tcc.tcc_teste.model;

import java.sql.Date;
import java.util.Scanner;

public class Sugestões {
	private Date data;
	private char descriçao;
	private Scanner scanner;
	
	public Sugestões() {
		scanner=new Scanner(System.in);
	}
	
	public void emitir() {
		
	}
	public void selecionar() {
		
	}
	
	
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public char getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(char descriçao) {
		this.descriçao = descriçao;
	}
}