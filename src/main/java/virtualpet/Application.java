package virtualpet;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
String commands = "Commands\n Adopt - adopt a pet\n Organic - choosing an animal pet\n Robotic - choosing a robot pet\n Feed <petname> - feeds your pet\n Play <petname> - plays with your pet\n Vet <petname> - Takes your pet to the vet to improve health\n Rest <petname> - Allows your pet to rest, and you can play with a new pet\n Shelter <petname> - Sends your current pet back to the shelter.  THIS WILL BE PERMANENT.\n Clean <petname> - Cleans your pet and its space\n Exit - Exits VPet";
	// System.out.println(commands);
	System.out.println("Type start to start. Type \"help\" for list of commands.");		
	String initPrompt = input.nextLine();	
	
	if (initPrompt.toLowerCase().equals("help")) {
		System.out.println(commands);
	} else if (initPrompt.toLowerCase().equals("start")){
		
	} else {
		System.out.println("You didn't type a proper command");
	}
		}

}