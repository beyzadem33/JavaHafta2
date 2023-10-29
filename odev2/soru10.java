package odev2;

import java.util.Scanner;

public class soru10 {

	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Bir tane sayý gir");

	        int sayi = scanner.nextInt();
	        int bolen = 2;
	        for (int i = 1; i < sayi; i++) {
	            if (sayi % bolen == 0) {
	                System.out.println(bolen);
	                sayi = sayi / bolen;
	            }
	            else {
	                bolen++;


	            }

	        }

	        }
}