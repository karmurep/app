package in.yash.dailystatusupdateapp.util;

import java.util.List;
import java.util.Scanner;

import in.yash.dailystatusupdateapp.modal.User;
import in.yash.dailystatusupdateapp.service.UserService;
import in.yash.dailystatusupdateapp.serviceimpl.UserServiceImpl;

public class UserMenu {
	UserService userService;

	public UserMenu() {

		userService = new UserServiceImpl();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String contiChoice;
		do {
			showMenu();
			System.out.println("Enter your choice:");
			int menuChoice = sc.nextInt();

			switch (menuChoice) {
			case 1:
				createUser(sc);
				break;
			case 2:
				showUsers();
				break;
			case 3:
				System.out.println("Delete User");
				break;
			case 4:
				System.out.println("Update User");
				break;
			case 0:
				System.out.println("Thanks for visit!!");
				System.exit(0);

			default:
				System.out.println("Invalid choice.try again!");
				break;
			}
			System.out.println("Do you want to continue: (yes/no)");
			contiChoice = sc.next();

		} while (contiChoice.equals("yes"));
	}

	private void showUsers() {
		System.out.println("------List of  Contacts-------");
		List<User> users = userService.showUser();
		for (User user : users) {
			System.out.println(user);
		}
	}

	private void createUser(Scanner sc) {
		System.out.println("Fill details to create User:");
		User user = new User();
		sc.nextLine();
		System.out.println("Enter Name: ");
		user.setName(sc.nextLine());
//	
		System.out.println("Enter Contact: ");
		user.setContact(sc.next());
		System.out.println("Enter Login Name: ");
		user.setLoginname(sc.next());
		sc.nextLine(); // \n from buffer memory will assign to nextLine();
		System.out.println("Enter Password: ");
		user.setPassword(sc.nextLine());

		System.out.println("Enter Status: ");
		user.setStatus(sc.nextLine());
		System.out.println("Enter Role: ");
		user.setRole(sc.nextLine());
		userService.addUser(user);
		System.out.println("Success!! User added.");

	}

	private void showMenu() {
		System.out.println("1. Add User");
		System.out.println("2. List User");
		System.out.println("3. Delete User");
		System.out.println("4. Update User");
	}

}
