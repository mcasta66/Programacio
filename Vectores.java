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

	public static void main(String[] args) {

		int i;
		int v[], v2[];
		v = new int[10];
		v2 = new int[5];

		leer(v);
		// Calcular suma
		int suma = 0;
		for (i = 0; i < N; i++) {
			suma = suma + v[i];
		}
		System.out.println("La suma es " + suma);

		leer(v2);
		System.out.println("Adéu!");
	}
}
