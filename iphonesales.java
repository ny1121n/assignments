//Objective : My First Assignment 
//Name : Nayeon Kim 
//Full Time, L01
//Tutorial Group 8 (T08)
//Student no : 7432471
//File name : NayeonKim_A1.java
//Declaration : This is my own work and I did not violate uow's plagiarism rule, I have never shared this work with any of my friends. I am willing to accept any penalty given to me, if I have violated any of the rules. 

import java.util.Scanner;
class NayeonKim_Assn1 {
	public static void main (String[] args) {
		//task 1
		Scanner obj = new Scanner(System.in).useDelimiter("\n"); //enters iPhones to be sold and info
		System.out.println("Welcome to iPhones online service");
		System.out.println("-----------------------------");
		System.out.println("Enter three iPhones to be sold");
		System.out.print("1. ");
		String a = obj.next();
		System.lineSeparator();
		System.out.print("2. ");
		String b = obj.next();
		System.lineSeparator();
		System.out.print("3. ");
		String c = obj.next();
		System.out.println();
		
		System.out.println("Some other info");
		System.out.println("---------------");
		System.out.print("Delivery address: ");
		String d = obj.next();
		System.lineSeparator();
		System.out.print("Postal code: ");
		String e = obj.next();
		obj.nextLine();
		System.lineSeparator();
		System.out.print("Country: ");
		String f = obj.next();
		System.out.println();

		Scanner obj2 = new Scanner(System.in);
		
		//task 2
		System.out.printf("Enter the quantities and price of %s: ", a); //enters quantity and price of selling iPhones
		int g = obj2.nextInt();
		double h = obj2.nextDouble();
		
		
		System.out.printf("Enter the quantities and price of %s: ", b);
		int i = obj2.nextInt();
		double j = obj2.nextDouble();
		
		System.out.printf("Enter the quantities and price of %s: ", c);
		int k = obj2.nextInt();
		double l = obj2.nextDouble();
		System.out.println();
		
		System.out.println("Summary of iPhones");
		System.out.println("----------------");
		System.out.println();
		
		System.out.printf("%-20s" + "%-10s" + "%10s%n", "iPhone", "Quantity", "Price");
		System.out.println("------------------------------------------");
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", a, g, h);
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", b, i, j);
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", c, k, l);
		System.out.println("------------------------------------------");
		             
		//task 3
		
		String temp = a; //first and second iPhones being swapped
		a = b;
		b = temp;
		
		int t1 = g;
		g = i;
		i = t1;
		
		double t2 = h;
		h = j;
		j = t2;
		
		System.out.println();
		System.out.println("Summary of iPhones after the swaps");
		System.out.println("---------------------------------");
		System.out.println();
		
		System.out.printf("%-20s" + "%-10s" + "%10s%n", "iPhone", "Quantity", "Price");
		System.out.println("------------------------------------------");
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", a, g, h);
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", b, i, j);
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", c, k, l);
		System.out.println("------------------------------------------");
		
		
		//task 4
		System.out.println(); //now customer places their order
		System.out.println("Please place your order");
		System.out.println("-------------------------");
		System.out.printf("No of %s: ", a);
		int m = obj2.nextInt();
		System.out.printf("No of %s: ", b);
		int n = obj2.nextInt();
		System.out.printf("No of %s: ", c);
		int o = obj2.nextInt();
		
		System.out.println();
		double costA = m * h;
		double costB = n * j;
		double costC = o * l;
		double sub = costA + costB + costC;
		double gst = sub * 0.07;
		double tc = sub + gst; 
		
		System.out.println("Summary of your order");
		System.out.println("---------------------");
		System.out.println();
		System.out.printf("%-20s" + "%-10s" + "%10s%n", "iPhone", "Quantity", "Cost");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", a, m, costA);
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", b, n, costB);
		System.out.printf("%-20s" + "%-10d" + "%10.2f%n", c, o, costC);
		System.out.println("------------------------------------------------------");
		System.out.printf("%-20s" + "%20.2f%n", "Subtotal:", sub);
		System.out.printf("%-20s" + "%20.2f%n", "GST (7%):", gst);
		System.out.printf("%-20s" + "%20.2f%n", "Total cost:", tc);
		System.out.println("------------------------------------------------------");
		System.out.println();
		
		//task 5
		int balA = g - m; //final balance report appears
		int balB = i - n;
		int balC = k - o;
		
		System.out.println("Balance report");
		System.out.println("---------------");
		System.out.println();
		System.out.printf("%-20s" + "%-10s" + "%-10s" + "%-10s%n", "iPhone", "Quantity", "Sold", "Balance");
		System.out.println("------------------------------------------------------");
		System.out.printf("%-20s" + "%-10d" + "%-10d" + "%-10d%n", a, g, m, balA);
		System.out.printf("%-20s" + "%-10d" + "%-10d" + "%-10d%n", b, i, n, balB);
		System.out.printf("%-20s" + "%-10d" + "%-10d" + "%-10d%n", c, k, o, balC);
		System.out.println("------------------------------------------------------");
		
		
		
		
	}
}