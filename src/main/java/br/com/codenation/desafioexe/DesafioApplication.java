package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> list = new ArrayList<>();
		int a = 0, b = 1, aux;
		do{
			list.add(a);
			aux = a; //guardar o valor antes de sobreescrever variavel a
			a = a + b;
			b = aux; //recuperando o valor para o proximo loop
		}while (aux < 350);

		return list;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}