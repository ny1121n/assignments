//Objective : My Second lab
//Name : Nayeon Kim 
//Student no : 7432471
//File name : NayeonKim_Lab_2.java
//Declaration : This is my own work and I did not violate uow's plagiarism rules. 

import java.util.Scanner;
import java.util.*;
class NayeonKim_Lab2 {
	private static String encrypt_num;
	private static int encrypt_num2;
		
	public static int[] encrypt(int n) {
		int divisor1 = 10;
		int divisor10 = 100;
	    int divisor100 = 1000;
					
		int a = (Math.round(n/divisor100) + 7)%divisor1; 
		int b = (Math.round((n%divisor100)/100) + 7)%divisor1;
		int c = (Math.round((n%divisor10)/divisor1) + 7)%divisor1; 
		int d = (Math.round(n%divisor1) + 7)%divisor1;
			
		int temp = a;
		a = c;
		c = temp;
		
				
		int temp2 = b;
		b = d;
		d = temp2;
		
		int[] encrypted = {a, b, c, d};
		return encrypted;
		
	}
	
	public static int[] decrypt(int z) {
		int divisor1 = 10;
		int divisor10 = 100;
	    int divisor100 = 1000;
		
		int q = (Math.round(z/divisor100) + 3)%divisor1;
		int w = (Math.round((z%divisor100)/divisor10) + 3)%divisor1;
		int e = (Math.round((z%divisor10)/divisor1) + 3)%divisor1;
		int r = (Math.round(z%divisor1) + 3)%divisor1;
		
		int tmp = q;
		q = e;
		e = tmp;
		
		int tmp2 = w;
		w = r;
		r = tmp2;
		
		int[] decrypted = {q, w, e, r};
		return decrypted;
	}
	
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
		System.out.println("Enter 4 digits integer to be encrypted: ");
		int n = obj.nextInt();
		int encrypt_n[];
        
		encrypt_n = new int[4];

	    for (int i = 0;i < encrypt_n.length; i++ ) {
			encrypt_n[i] = encrypt(n)[i];        	
		}
		System.out.print("Encrypted integer is: " + encrypt_n[0] + encrypt_n[1] + encrypt_n[2] + encrypt_n[3]);
		System.out.println();
		
		System.out.println("\rEnter 4 digits integer to be decrypted: ");
        int z = obj.nextInt();
		
		int decrypt_n[];

		decrypt_n = new int[4];
		     
        
        for (int j = 0;j < decrypt_n.length; j++ ) {
		    decrypt_n[j] = decrypt(z)[j];
		}

	    System.out.println("Decrypted integer is: " + decrypt_n[0] + decrypt_n[1] + decrypt_n[2] + decrypt_n[3]);
		
	}
}

//birthday is 08/10/1951. He did not tell lie. 