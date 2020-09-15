package view;
import controller.ThreadMatriz;
import java.util.Random;

public class Principal {
	public static void main(String[] args) {

		int i, j;
		int [][] mat = new int[3][5];
		Random aleatorio = new Random();

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 5; j++) {

				mat[i][j] = aleatorio.nextInt(10) + 1;
			}
		}

		for (i = 0; i < 3; i++) {
			Thread array = new ThreadMatriz(mat[i]);
			array.start();


		}



	}
}
