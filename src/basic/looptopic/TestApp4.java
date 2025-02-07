package basic.looptopic;


//Nested for loop
public class TestApp4 {
	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++) {
			
			int j;
			for(j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
