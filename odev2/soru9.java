package odev2;

public class soru9 {

	public static void main(String[] args) {
		
		getTime(3954);
	}

	public static void getTime(long sec)
	{
		
        int hours=0,mins=0,seconds=0;

		if( sec/3600 > 0)
		{
			hours = (int)sec/3600 ;
			sec -= hours*3600;
		}
		
		if(sec/60 > 0 )
		{
			mins = (int)sec/60;
			sec-= mins*60;
		}
		seconds = (int)sec;
		System.out.println("Saat:"+hours+" Dakika:"+mins+" Saniye:"+seconds);
		
	}
}
