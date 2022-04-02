package defaultt;

public class FreshMain {

	public static void main(String[] args) {

		// Scrivere un programma che stampi
		// a video i primi dieci numeri interi

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

		// Scrivere un programma che stampi a video i primi dieci
		// interi pari compresi fra 20 e 0, partendo da 20.

//		for(int i = 20; i>0; i--) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}

		// tabellinaV(3);

		// Scrivere un programma che stampi le tabellina del numero dato come argomento

//	public static void tabellinaV(int x) {
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(x * i);
//		}
//	}

//	Stampare a video la seguente figura:
//		******
//		*****
//		****
//		***
//		**
//		*
		// METODO 1 PIU LONG
//		int v[];
//		v = new int[6];
//		
//		for(int i = 1; i<=v.length; i++) {
//			System.out.print("*");
//			
//		}System.out.println();
//		for(int i = 1; i<=v.length-1; i++) {
//			System.out.print("*");
//			
//		}System.out.println();
//		for(int i = 1; i<=v.length-2; i++) {
//			System.out.print("*");
//			
//		}System.out.println();
//		for(int i = 1; i<=v.length-3; i++) {
//			System.out.print("*");
//			
//		}System.out.println();
//		for(int i = 1; i<=v.length-4; i++) {
//			System.out.print("*");
//			
//		}System.out.println();
//		for(int i = 1; i<=v.length-5; i++) {
//			System.out.print("*");	
//		}

		// METODO DUE, PIU SEMPLICE
//		for (int i = 1; i <= 6; i++) {
//
//			for (int j = 6; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

//		Stampare a video la seguente figura:
//			#
//			##
//			###
//			####
//			#####
//			######

//funzia bene
//		for (int i = 1; i <= 6; i++) {
//			
//			for (int j =0; j < i; j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//	}

//		Stampare a video la seguente figura:
//			1      654321
//			12      54321
//			123      4321
//			1234      321
//			12345      21
//			123456      1

//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print(j + 1);
//			}
//			System.out.print("     ");
//			for (int k = 6; k > i; k--) {
//				System.out.print(k - i);
//			}
//			System.out.println();
//		}

		// Trovare il massimo elemento in un array (o il minimo)
//		 int[] v;
//		 v= new int[]{3, 56765, 5, 8,887};
//		 int max=v[0];
//		 for(int i = 0; i<v.length; i++) {
//			 
//			 if(max > v[i]) {
//				 max = v[i];
//			 }
//		 }
//		 System.out.println(max);
//	}

//		scrivere un metodo “boolean contains(int e, int[] array)” che 
//		restituisca true se l’elemento e è presente nell’array, false altrimenti. 
//		Ripetere l’esercizio con 
//		“boolean contains(Object e, Object[] array)”, quali differenze ci sono?

		// Object[] v2;
		// v2 = new Object[] { 3, 56765, 5, 8, 887 };

		// containsObj(465, v2);
		// contains(324, v2);
//	}
//
//	public static boolean contains(int e, int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == e) {
//				System.out.println("Il Numero c'è: " + e);
//				return true;
//			}
//		}
//		System.out.println("Il Numero NON c'è: " + e);
//		return false;
//	}

//	public static boolean containsObj(Object e, Object[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i].equals(e)) {
//				System.out.println("L'oggetto c'è: " + e);
//				return true;
//			}
//		}
//		System.out.println("L'oggetto NON c'è: " + e);
//		return false;
//	}

//		Scrivere un programma StampaZigZag che, dato un array di 10 numeri interi
//		contenente valori a piacere, ne stampa gli elementi secondo il seguente ordine: 
//			il primo, l’ultimo, il secondo, il penultimo, il terzo, il terz’ultimo, ecc…

		int[] v = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		stampaZigZag(v);

	}

	public static void stampaZigZag(int[] arr) {
		System.out.print(arr[0] + " ");
		for (int i = 1; i < arr.length - 1; i++) {

			System.out.print(" " + arr[arr.length - i]);
			
			System.out.print(" " + arr[i]);
		}
		System.out.print(" " + arr[arr.length - 1]);
	}

}
