import java.util.Scanner;

public class Vectores {

	final static int N = 10;

	public static void leer(int[] vector) {
		//Leer vector
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce " + N + " numeros");

		for (int i = 0; i < vector.length; i++) {
			vector[i] = sc.nextInt();
		}
	}
	
	public static int sumar(int[] vector) {
		// Calcular suma
		int suma = 0;
		for (int i = 0; i < N; i++) {
			suma = suma + vector[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {

		int i;
		int v[], v2[];
		v = new int[10];
		v2 = new int[5];

		leer(v);

		int res = sumar(v);
		System.out.println("La suma es " + res);

		leer(v2);
		System.out.println("Adéu!");
	}
}

