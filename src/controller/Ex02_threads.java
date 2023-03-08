package controller;

public class Ex02_threads extends Thread {
	
		private int n;
		private int M[][];

		public Ex02_threads(int n, int M[][]) {
			this.n = n;
			this.M = M;
		}

		@Override
		public void run() {
			int soma = 0;
			//chamada das 5 threads;
			for (int c = 0; c < 5; c++) {
				soma += M[n][c];
			}
			System.out.println("Soma da linha " + (n + 1) + " da matriz= " + soma);	
			}

	}


