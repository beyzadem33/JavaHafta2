package odev2;

import javax.swing.JOptionPane;

public class soru4 {

	public static void main(String[] args) {

		String sayi1 = JOptionPane.showInputDialog("Birinci Say�y� Giriniz !");
		String sayi2 = JOptionPane.showInputDialog("�kinci Say�y� Giriniz !");

		double num1 = Double.parseDouble(sayi1);
		double num2 = Double.parseDouble(sayi2);
		String[]  operations = {"Toplama","��karma","�arpma","B�lme"};
		
		int userChoice = JOptionPane.showOptionDialog(null, "��lem Se�", "��lem", 
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
				JOptionPane.showMessageDialog(null,"0 a b�lemezsin.");
				return;
			}
			
		}
			
		}
		System.out.println(result);
	}

}
