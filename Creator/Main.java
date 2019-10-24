package Creator;

import java.util.Scanner;
//import Creator.Member; //only use if class is in a different package

public class Main {

    public static void main(String[] args) {

        System.out.println("===Family Tree Creator===");
        System.out.println("Enter name of family: ");

        Scanner kb = new Scanner(System.in);
        String familyName = kb.next();

        System.out.println("Your family name is: " + familyName);

        try {
            System.out.println("Add a new family member? 1 = yes; 0 = no");
            int choice = kb.nextInt();

            if (choice == 0) {
                System.out.println("exiting!");
            }else if (choice == 1) {
                createMember();
            }else{
                System.out.println("invalid number.");
            }

        } catch(Exception e) {
            System.out.println("Invalid input.");
        }

        //class cannot be accessed from here, need to find a way to do that later

        //TODO: add checking for numbers, must only be chars
        //TODO: add saving for family tree on a file, also to be retrieved


    }

    public static void createMember() {
        /*
        for (int i = 0; i < 0; i++) {
            Member m = new Member(i);
        }
        */
        Member m = new Member();
        Scanner kb = new Scanner(System.in);

        System.out.print("enter first name: ");
        try {
            m.addFirstName(kb.next());
        }catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("Is there a middle name? Yes = 1, No = 0");
        int middle = kb.nextInt();
        if (middle == 1) {
            System.out.print("enter middle name: ");
            try {
                m.addMiddleName(kb.next());
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        System.out.print("enter last name: ");
        try {
            m.addLastName(kb.next());
        }catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("This member's name is: " + m.getFirstName() + m.getMiddleName() + m.getLastName() + ".");

    }

}
