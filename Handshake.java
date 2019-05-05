public class Handshake {
	private static int n;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of people in room: ");  
		int n = input.nextInt();

		System.out.println(countDown(n) + " handshakes");
	}    
	
	public static int countDown(int n) {  
		int total = 0;

		try {
			if(n<1) 
				throw new Exception();
		}

		catch(Exception e) {
			System.out.println("There must be at least one person in the room.");
			System.exit(0);
		}

		if (n ==1) {            
			return 0;      
		}
		else if(n==2) {
			return 1;
		}     
		else {   
	       	return countDown(n-1)+(n-1);   
	    }

	}
}