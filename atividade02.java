package br.senac.aula02;

public class atividade02 {

public static void main(String[] args) {
		
		String dengue = "";
		dengue += verifSintomas("Dor de cabeça");
		dengue += verifSintomas("Febre");
		dengue += verifSintomas("Dor atrás dos olhos");
		dengue += verifSintomas("Dor nas articulações");
		
		System.out.println(dengue);
		
		diagnostico(dengue);
	}



	private static String verifSintomas(String dengue) {
		
		return null;
	}
	
	private static void diagnostico(String dengue) {
		boolean d1 = dengue.contains("Dor de cabeça");
		boolean d2 = dengue.contains("Febre");
		boolean d3 = dengue.contains("Dor atrás dos olhos");
		boolean d4 = dengue.contains("Dor nas articulações");
		
		boolean diagnosticoFinal = d1&&d2&&d3&&d4;
		
		System.out.println("A pessoa está com dengue?: " + diagnosticoFinal);
		
	}

}
