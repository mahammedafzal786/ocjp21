package basic.looptopic;


//Nested do..while loop
public class TestApp6 {
	public static void main(String[] args) {
		int i=1;
		do {
			int j=1;
			do {
				System.out.print("*");
				j++;
			}while(j<=5);
			
			System.out.println();
			
			i++;
		}while(i<=5);
	}
}
