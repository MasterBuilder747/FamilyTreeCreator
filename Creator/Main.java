package Creator;

import java.util.Scanner;
//import Creator.Member; //only use if class is in a different package

public class Main {

    private static void createMember(int id) {
        /*
        for (int i = 0; i < 0; i++) {
            Member m = new Member(i);
        }
        */
        Member m = new Member(id);
        Scanner kb = new Scanner(System.in);

        System.out.print("enter first name: ");
        try {
            m.addFirstName(kb.next());
        } catch (Exception e) {
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
        } else {
            m.addMiddleName(null);
        }

        System.out.print("enter last name: ");
        try {
            m.addLastName(kb.next());
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("This member's name is: " + m.getFirstName() + m.getMiddleName() + m.getLastName() + ".");

        //returning a class
        //return new Member(id);
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("===Family Tree Creator===");
        System.out.println("Enter name of family: ");
        String familyName = kb.next();
        System.out.println("Your family name is: " + familyName);

        //establish allocation
        System.out.println("How many members are in your family? Type 0 for default allocation, 1024.");
        int N = kb.nextInt();
        if (N != 0) {
            //list of all family members
            //for (int i = N; i > N; --i) {
                Member[] family = new Member[N];
            //}
        }else{
            Member[] family = new Member[1024];
        }

        //add info to members
        int add = 1;
        int id = 0;
        while (add == 1) {
            try {
                System.out.println("Add a new family member? 1 = yes; 0 = no");
                int choice = kb.nextInt();

                if (choice == 0) {
                    add = 0;
                } else if (choice == 1) {
                    createMember(id);
                } else {
                    System.out.println("invalid number.");
                }

            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        //class cannot be accessed from here, need to find a way to do that later

        //TODO: add checking for numbers, must only be chars
        //TODO: add saving for family tree on a file, also to be retrieved

    }
}

