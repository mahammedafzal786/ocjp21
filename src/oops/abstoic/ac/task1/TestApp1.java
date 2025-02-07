package oops.abstoic.ac.task1;

import java.util.Scanner;

public class TestApp1 {
	
	public static void getVehicleInfo(Vehicle vehicle) {
		vehicle.getSpec();
		
		if(vehicle instanceof TwVehicle) {
			
			System.out.println("Hi I have TwVehicle object.");
			TwVehicle twVehicle = (TwVehicle)vehicle;
			twVehicle.getTwModelInfo();
		}else if(vehicle instanceof LmvVehicle) {
			System.out.println("Hi I have LmvVehicle object.");
			LmvVehicle lmvVehicle = (LmvVehicle)vehicle;
			lmvVehicle.getLmvModelInfo();			
		}else if(vehicle instanceof HmvVehicle) {
			System.out.println("Hi I have HmvVehicle object.");
			HmvVehicle hmvVehicle = (HmvVehicle)vehicle;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise of Vehicle : ");
		

		System.out.println("1) For Two Vehicle");
		System.out.println("2) For LightMotor Vehicle");
		System.out.println("3) For Heavy Motor Vehicle");
		int choice  =  sc.nextInt();
		
		switch(choice) 
		{
			case 1: TwVehicle tw = new TwVehicle();
					getVehicleInfo(tw);
					break;
	
			case 2: LmvVehicle lmv = new LmvVehicle();
					getVehicleInfo(lmv);
			
					break;
	
			case 3: HmvVehicle hmv = new HmvVehicle();
					getVehicleInfo(hmv);
					break;
		}
	}
}
