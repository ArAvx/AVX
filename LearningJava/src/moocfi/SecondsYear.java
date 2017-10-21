package moocfi;

public class SecondsYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double year = 2012;
System.out.println("There are "+Calcseconds(year)+" in "+(int)year );
	}

	public static double Calcseconds(double year) {
		return ((((year % 400)== 0) || ((year % 100 != 0) && (year % 4 ==0))) ? 366*24*60 : 365*24*60);
	
	}
	
	
}
