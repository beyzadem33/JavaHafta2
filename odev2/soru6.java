package odev2;

import javax.swing.JOptionPane;


public class soru6 {

	public static void main(String[] args) {
		
		String inp1 = JOptionPane.showInputDialog("1.Değeri giriniz:");
		String inp2 = JOptionPane.showInputDialog("2.Değeri giriniz:");
		String inp3 = JOptionPane.showInputDialog("3.Değeri giriniz:");

		Double num1 = Double.parseDouble(inp1);
		Double num2 = Double.parseDouble(inp2);
		Double num3 = Double.parseDouble(inp3);
		double res= GetMiddle(num1,num2,num3);
				System.out.println(res);
	    

		
	}
	public static double GetMiddle(double num1, double num2 , double num3)
	{
	    if(num1 > num2 && num1> num3)
	    {
	    	if(num2> num3)
	    		return num2;
	    	else
	    		return num3;
	    		
	    }
	    else if(num2 > num1 && num2> num3)
	    {
	    	if(num1> num3)
	    		return num1;
	    	else
	    		return num3;
	    		
	    }
	    else if(num3 > num1 && num3> num2)
	    {
	    	if(num1> num2)
	    		return num1;
	    	else
	    		return num2;
	    		
	    }
	    return 0;
	}

}
