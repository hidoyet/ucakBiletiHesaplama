package ucakBiletiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age,range,ticketType;
		double price,discountedPrice;
		
		System.out.println("Yaşınızı giriniz:");
		age=scanner.nextInt();
		if(age<0) {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		System.out.println("Gideceğiniz mesafeyi km cinsinden giriniz:");
		range=scanner.nextInt();
		if(range<0) {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		price=range*0.1;
		System.out.println("Tek yön bilet için 1,gidiş-dönüş bilet için 2'yi seçiniz");
		ticketType=scanner.nextInt();
		if(ticketType<0&&ticketType>2) {
		System.out.println("Hatalı Veri Girdiniz !");
		}
		//12 yaþ altı için bilet fiyatı
		if(age<12&&ticketType==1) {
			
			discountedPrice=price*0.5;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		if(age<12&&ticketType==2) {
			
			discountedPrice=price*0.5*0.8;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		
		//12-24 yaş arası için bilet fiyatı

		if(age>=12&&age<=24&&ticketType==2) {
			discountedPrice=price*0.9*0.8;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		if(age>=12&&age<=24&&ticketType==1) {
			discountedPrice=price*0.9;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		
		//24-65 arası bilet fiyatı
		if(age>=25&&age<=65&&ticketType==2) {
			discountedPrice=price*0.8;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		if(age>=25&&age<=65&&ticketType==1) {
			discountedPrice=price;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		//65 yaş üstü için
		if(age>65&&ticketType==1) {
			
			discountedPrice=price*0.7;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}
		if(age>65&&ticketType==2) {
			
			discountedPrice=price*0.7*0.8;
			System.out.println("Bilet fiyatınız: " + discountedPrice + "TL");
		}

	}

}
