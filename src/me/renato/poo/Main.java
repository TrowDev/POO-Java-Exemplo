package me.renato.poo;

import me.renato.poo.objetos.Empregado;
import me.renato.poo.objetos.Gerente;
import me.renato.poo.objetos.Secretaria;

public class Main {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setFuncionario("Renato Henrique");
		g.setUsuario("Renato");
		g.setSenha("teste123");
		g.setHorasExtra(3);
		g.setSalario(1800);
		g.setValorHora(30);
		//
		Secretaria s = new Secretaria();
		s.setFuncionario("Ana Paula");
		s.setFormacao("Administração");
		s.setIdade(25);
		s.setHorasExtra(5);
		s.setSalario(1450);
		s.setValorHora(25);
		//
		Empregado emp = new Empregado();
		emp.setFuncionario("Gabriel Inácio");
		emp.setHorasExtra(1);
		emp.setSalario(1200);
		emp.setValorHora(20);
		print("Gerente:");
		print("Nome: "+g.getFuncionario());
		print("Salário: "+g.getSalarioFinal());
		print("");
		print("Secretaria:");
		print("Nome: "+s.getFuncionario());
		print("Salário: "+s.getSalarioFinal());
		print("");
		print("Empregado:");
		print("Nome: "+emp.getFuncionario());
		print("Salário: "+emp.getSalarioFinal());
		
	}
	
	public static void print(String s){
		System.out.println(s);
	}

}
