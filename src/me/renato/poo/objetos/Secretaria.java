package me.renato.poo.objetos;

public class Secretaria extends Empregado{
	
	private String formacao;
	private int idade;
	
	public String getFormacao(){
		return formacao;
	}
	
	public void setFormacao(String s){
		formacao=s;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int b){
		idade=b;
	}
	
}
