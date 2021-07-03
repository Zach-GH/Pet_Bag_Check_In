package petBag;
import java.util.Scanner;
public class PetBagExample {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String petType;
		String petName;
		String groomAnswer;
		String dogConfirm;
		String finalDogConfirm;
		String catConfirm;
		String finalCatConfirm;
		int petAge = 0;
		int spaceDog = 30;
		int spaceCat = 12;
		int stayedDays = 0;
		int amountDue = 0;
		int dogWeight = 0;
		
		System.out.println("Welcome to petBAG!");
		System.out.println("There are " + spaceDog + " spaces available for dogs.");
		System.out.println("There are " + spaceCat + " spaces available for cats.");
			System.out.println("Dog or Cat?: ");
			petType = scnr.next();
			if (petType == "Dog") {
				if (spaceDog >= 1) {
				System.out.println("Pet Name?: ");
				petName = scnr.next();
				System.out.println("Age?: ");
				petAge = scnr.nextInt();
				System.out.println("How long is their stay?: ");
				stayedDays = scnr.nextInt();
				if (petType == "Dog") {
					System.out.println("Dog Weight?: ");
					dogWeight = scnr.nextInt();
					if (stayedDays >= 2) {
						System.out.println("Would you like them groomed?(Y/N): ");
						groomAnswer = scnr.next();
						System.out.println("Confirm your appointment?(Y/N): ");
						dogConfirm = scnr.next();
						if (dogConfirm == "Y") {
							spaceDog = spaceDog - 1;
							System.out.println("Appointment Confirmed!");
							System.out.println("There are " + spaceDog + " dog spaces left!");
							System.out.println("Your dogs name is " + petName);
							System.out.println("Their Age is " + petAge);
							System.out.println("Their stay will be " + stayedDays + "day(s) long!");
							System.out.println("They weigh " + dogWeight + "pounds!");
							System.out.println("Grooming?" + groomAnswer);
							System.out.println("Does everything look correct?(Y/N): ");
							finalDogConfirm = scnr.next();
							if (finalDogConfirm == "Y") {
								System.out.println("Thankyou for using petBag! See you next time!");
							}
							if (finalDogConfirm == "N") {
								System.out.println("Let's change that next time! Bye!");
							}
						}
			}  
				} 

			}
		}  
			if (petType == "Cat") {
				if (spaceCat >= 1) {
					System.out.println("Confirm your appointment?(Y/N): ");
					catConfirm = scnr.next();
					if (catConfirm == "Y") {
						spaceCat = spaceCat - 1;
						System.out.println("Appointment Confirmed!");
						System.out.println("There are " + spaceCat + " cat spaces left!");
						System.out.println("Their stay will be " + stayedDays + "day(s) long!");
						System.out.println("Does everything look correct?(Y/N): ");
						finalCatConfirm = scnr.next();
						if (finalCatConfirm == "Y") {
							System.out.println("Thankyou for using petBag! See you next time!");
						}
						if (finalCatConfirm == "N") {
							System.out.println("Let's change that next time! Bye!");
				}
		} 
		}	
	}}}
