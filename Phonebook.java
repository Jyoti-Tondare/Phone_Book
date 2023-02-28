import java.util.*;

class PhoneBook {
    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public void updateContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.put(name, phoneNumber);
            System.out.println(name + " has been updated with new phone number " + phoneNumber);
        } else {
            System.out.println(name + " is not in the phone book");
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println(name + " has been deleted from the phone book");
        } else {
            System.out.println(name + " is not in the phone book");
        }
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println(name + "'s phone number is " + contacts.get(name));
        } else {
            System.out.println(name + " is not in the phone book");
        }
    }
}

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        boolean running = true;
        while (running) {
            System.out.println("Enter a command: add, update, delete, search, exit");
            String command = sc.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = sc.nextLine();
                    phoneBook.addContact(name, phoneNumber);
                    break;
                case "update":
                    System.out.println("Enter name:");
                    name = sc.nextLine();
                    System.out.println("Enter new phone number:");
                    phoneNumber = sc.nextLine();
                    phoneBook.updateContact(name, phoneNumber);
                    break;
                case "delete":
                    System.out.println("Enter name:");
                    name = sc.nextLine();
                    phoneBook.deleteContact(name);
                    break;
                case "search":
                    System.out.println("Enter name:");
                    name = sc.nextLine();
                    phoneBook.searchContact(name);
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }
}
