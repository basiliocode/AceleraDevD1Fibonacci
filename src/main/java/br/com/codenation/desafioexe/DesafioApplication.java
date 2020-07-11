package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	static List<Integer> list = new ArrayList<>();
	public static List<Integer> fibonacci() {
		int a = 0;
		int b = 1;
		int aux;
		while (a < 350){
			list.add(a);
			aux = a; //guardar o valor antes de sobreescrever variavel a
			a = a + b;
			b = aux; //recuperando o valor para o proximo loop
		}
		return list;
	}

	public static Boolean isFibonacci(Integer a) {
		return list.contains(a);
	}

}