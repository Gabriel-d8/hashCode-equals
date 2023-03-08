package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client client1 = new Client(25, "Maria Joana", "mariajoana@gmail.com");
		Client client2 = new Client(38, "Maria Joana", "mariajoana@gmail.com");
		
		System.out.println("Client 1");
		System.out.println("Name: " + client1.getName());
		System.out.println("Email: " + client1.getEmail());
		
		System.out.println();
		
		System.out.println("Client 2");
		System.out.println("Name: " + client2.getName());
		System.out.println("Email: " + client2.getEmail());
		
		System.out.println();
		
		if (client1.equals(client2) == false) {
			System.out.println("Is Client 1 the same as Client 2? (false/true)");
			System.out.println(client1.equals(client2) + ". Your entries are different. |Client 1 ID: " + client1.getId() + "| Client 2 ID: " + client2.getId()  + "| So, they are not the same person.");
		}
		
		if (client1.equals(client2) == true) {
			System.out.println("Is Client 1 the same as Client 2? (false/true");
			System.out.println(client1.equals(client2) + ". Their entries are the same. |Client 1 ID: " + client1.getId() + "| Client 2 ID: " + client2.getId()  + "| So, they are the same person.");
		}
		
		System.out.println();
		
		System.out.println("The HashCode of the Client 1 is: " + client1.hashCode());
		System.out.println("The HashCode of the Client 2 is: " +client2.hashCode());
		
	}

}