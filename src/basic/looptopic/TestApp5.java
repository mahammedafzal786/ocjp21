package basic.looptopic;


//Nested while loop
public class TestApp5 {
	public static void main(String[] args) {
		int i= 1;
		while(i<=5){
			
			int j=1;
			while(j<=5){
				
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
