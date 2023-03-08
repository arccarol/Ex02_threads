package view;

import java.util.Random;

import controller.Ex02_threads;

public class Principal {

	
		public static void main(String[] args) {
			int M[][] = new int[3][5];
			Random gerador = new Random();
			for (int l = 0; l < 3; l++) {
				for (int c = 0; c < 5; c++) {
					M[l][c] = gerador.nextInt(60) + 1;
					System.out.print(M[l][c] + " ");
				}
				System.out.println("\n");
			}

			for (int n = 0; n < 3; n++) {
				Thread t = new Ex02_threads(n, M);
				t.start();
			}
		}
	}


