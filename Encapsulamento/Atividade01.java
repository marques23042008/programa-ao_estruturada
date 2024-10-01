package aula1;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		carro automovel=new carro();
		System.out.println("digite o modelo:");
		String modeloo= obj.next();
		System.out.println("digite o ano; ");
		int R=obj.nextInt();
		System.out.println("digite o torque: ");
		int T= obj.nextInt();
		
		automovel.setModelo(modeloo);
		automovel.setAno(R);
		automovel.setTorque(T);
		
		System.out.println(automovel.getModelo());
		System.out.println(automovel.getAno());
		System.out.println(automovel.getTorque());

	}

}
