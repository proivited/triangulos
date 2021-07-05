package triangulo;

import java.util.Scanner;
public class Triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cateto1;
		int cateto2;
		int cateto3;
		int angulo1;
		int angulo2;
		int angulo3;
		String mensaje = "";
		Scanner leerCateto1 = new Scanner(System.in);
		Scanner leerCateto2 = new Scanner(System.in);
		Scanner leerCateto3 = new Scanner(System.in);
		Scanner leerAngulo1 = new Scanner(System.in);
		Scanner leerAngulo2 = new Scanner(System.in);
		Scanner leerAngulo3 = new Scanner(System.in);
		
		
		System.out.println("Introduce tu primer cateto:");
		cateto1 = leerCateto1.nextInt();
		
		System.out.println("Introduce tu segundo cateto:");
		cateto2 = leerCateto2.nextInt();
		
		System.out.println("Introduce tu tercer cateto:");
		cateto3 = leerCateto3.nextInt();
		
		System.out.println("Introduce tu primer angulo:");
		angulo1 = leerAngulo1.nextInt();
		
		System.out.println("Introduce tu segundo angulo:");
		angulo2 = leerAngulo2.nextInt();
		
		System.out.println("Introduce tu tercer angulo:");
		angulo3 = leerAngulo3.nextInt();
		
		if((cateto1 + cateto2) > cateto3 && (cateto2 + cateto3) > cateto1
				&& (cateto1 +cateto3) > cateto2) {
			System.out.println("El triangulo existe por catetos");
		}else {
			System.out.println("El triangulo no existe por catetos");
		}
		
		if((angulo1 + angulo2 + angulo3) == 180) {
			System.out.println("El triangulo existe por angulos");
		}else {
			System.out.println("El triangulo no existe por angulos");
		}
		
	}

}
