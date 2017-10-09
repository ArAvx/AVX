package step1;;

public class MovieTicket {

	public static void Ticket() {
		int age = 24;
		
		if (age < 13) {
			System.out.println("Ticket price:"+ "$5");
		}
		else if (age > 13 && age < 60) {
			System.out.println("Ticket price:"+ "$8");
		}
		else if( age > 60) {
			System.out.println("Ticket price:"+ "$7");
		}
		else {
			System.out.println("Seriously??");
		}
	}
	
	public static void Month() {
		
		String name = "March";
		
		switch(name) {
		
		case "January":
		case "February":
		case "March":
			System.out.println("1");
		break;
		case "April":
		case "May":	
		case "June":
		case "July":
		case "August":
		case "September":
		case "October":
		case "November":
		case "December":
			System.out.println("0");
			break;
		default:
			System.out.println("Not a valid month");
		}

			
	}
	
	public static void Searchw() {
		int weight[] = { 66, 13, 125, 5, 16, 8, 77, 1 };
		int largest=0;
		
		for(int i=0; i<weight.length; i++) {
			if(weight[i]>largest) {
				largest=weight[i];
			}
			
		}
		
		System.out.println("Largest number:"+ largest);
		
	}
	
	public static void Design() {
		int n=6;
		for(int i=n; i>0; i--) {
			for(int j=i-1; j>0; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}  
		
	}
	
	public static void main (String args[]) {
		
	//Searchw();
	//Month();
	//Ticket();
	Design();
		
	}
	
}
