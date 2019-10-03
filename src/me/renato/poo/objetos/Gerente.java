package me.renato.poo.objetos;

public class Gerente extends Empregado{

	private String usuario,senha;

	public String getUsuario(){
		return usuario;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setUsuario(String s){
		usuario=s;
	}
	
	public void setSenha(String s){
		senha=s;
	}
	
}
