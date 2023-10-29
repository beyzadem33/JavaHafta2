package odev2;

import javax.swing.JOptionPane;

public class soru4 {

	public static void main(String[] args) {

		String sayi1 = JOptionPane.showInputDialog("Birinci Sayýyý Giriniz !");
		String sayi2 = JOptionPane.showInputDialog("Ýkinci Sayýyý Giriniz !");

		double num1 = Double.parseDouble(sayi1);
		double num2 = Double.parseDouble(sayi2);
		String[]  operations = {"Toplama","Çýkarma","Çarpma","Bölme"};
		
		int userChoice = JOptionPane.showOptionDialog(null, "Ýþlem Seç", "Ýþlem", 
				0, 0, null, operations,operations[0]);
		
		double result = 0;
		
		switch (userChoice) 
		{
		case 0: {
			result =num1 + num2;
			break;
		}
		case 1: {
			result =num1-num2;
			break;
		}
		case 2: {
			result =num1*num2;
			break;
		}
		case 3: {
			if(num2 != 0)
			{
				result =num1/num2;	
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null,"0 a bölemezsin.");
				return;
			}
			
		}
			
		}
		System.out.println(result);
	}

}
