package Bilioteca;

import java.util.Scanner;

public class voltea {
	
	
		Scanner entrada=new Scanner(System.in);
		int num;
		int num2;
		int numeroInvertido;
	//	public voltea() {}
		public   voltea() {
			System.out.println("escribe un numero");
			num=entrada.nextInt();
			while(num>0) {
				num2=num%10;
				System.out.println(num2);
				num=num/10;
				System.out.println(num);
				
				numeroInvertido=(num/10)+(num2*10)+(num%10);
				System.out.println(numeroInvertido);
			}
			
		}
		
	}

	