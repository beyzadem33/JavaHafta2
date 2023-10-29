package odev2;


public class soru7 {

	public static void main(String[] args) {
	
		int res =SigNum(2);

	}
	
	public static int SigNum(int number)
	{
		if(number>0)
			return 1;
		else if (number<0)
			return -1;
		return 0;
	}

}
