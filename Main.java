package ucakBiletiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age,range,ticketType;
		double price,discountedPrice;
		
		System.out.println("Ya��n�z� giriniz:");
		age=scanner.nextInt();
		if(age<0) {
			System.out.println("Hatal� Veri Girdiniz !");
		}
		System.out.println("Gidece�iniz mesafeyi km cinsinden giriniz:");
		range=scanner.nextInt();
		if(range<0) {
			System.out.println("Hatal� Veri Girdiniz !");
		}
		price=range*0.1;
		System.out.println("Tek y�n bilet i�in 1,gidi�-d�n�� bilet i�in 2'yi se�iniz");
		ticketType=scanner.nextInt();
		if(ticketType<0&&ticketType>2) {
		System.out.println("Hatal� Veri Girdiniz !");
		}
		//12 ya� alt� i�in bilet fiyat�
		if(age<12&&ticketType==1) {
			
			discountedPrice=price*0.5;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		if(age<12&&ticketType==2) {
			
			discountedPrice=price*0.5*0.8;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		
		//12-24 ya� aras� i�in bilet fiyat�

		if(age>=12&&age<=24&&ticketType==2) {
			discountedPrice=price*0.9*0.8;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		if(age>=12&&age<=24&&ticketType==1) {
			discountedPrice=price*0.9;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		
		//24-65 aras� bilet fiyat�
		if(age>=25&&age<=65&&ticketType==2) {
			discountedPrice=price*0.8;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		if(age>=25&&age<=65&&ticketType==1) {
			discountedPrice=price;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		//65 ya� �st� i�in
		if(age>65&&ticketType==1) {
			
			discountedPrice=price*0.7;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}
		if(age>65&&ticketType==2) {
			
			discountedPrice=price*0.7*0.8;
			System.out.println("Bilet fiyat�n�z: " + discountedPrice + "TL");
		}

	}

}
