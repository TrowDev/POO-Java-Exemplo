package me.renato.poo.objetos;

public class Empregado {
	
	private String nome; // isso e uma propriedade
	private float salario,valorHora;
	private int horasExtra;
	
	/*public Empregado(String n){
		nome = n;
	}*/
	
	public void setFuncionario(String s){
		nome=s;
	}
	
	public float getSalarioFinal(){
		return (float) ((hasHorasExtra()?(getSalario()*1.1):getSalario())+(getHorasExtra()*getValorHora()));
	}
	
	public boolean hasHorasExtra(){
		return getHorasExtra()>0;
	}
	
	public String getFuncionario(){
		return nome;
	}
	
	public float getSalario(){
		return salario;
	}
	
	public void setSalario(float f){
		salario=f;
	}
	
	public float getValorHora(){
		return valorHora;
	}
	
	public void setValorHora(float f){
		valorHora=f;
	}
	
	public void setHorasExtra(int b){
		horasExtra=b;
	}
	
	public int getHorasExtra(){
		return horasExtra;
	}
	
}
