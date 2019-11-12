package Creator;

import java.util.Scanner;
//import Creator.Member; //only use if class is in a different package

public class Main {
    /*

    private static void createMember(int id) {

        for (int i = 0; i < 0; i++) {
            Member m = new Member(i);
        }

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
    */

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("===Family Tree Creator===");
        System.out.println("Enter name of family: ");
        String familyName = kb.next();
        System.out.println("Your family name is: " + familyName);

        //establish allocation
        System.out.println("How many members are in your family? Type 0 for default allocation, 1024.");
        int N = kb.nextInt();
        /*
        if (N != 0) {
            //list of all family members
            //for (int i = N; i > N; --i) {
                Member[] family = new Member[N];
            //}
        }else{
            Member[] family = new Member[1024];
        }
        */

        String n1 = null;
        String n2 = null;
        String n3 = null;
        int g = 0;
        String r = null;

        System.out.print("enter first name: ");
        try {
            n1 = kb.next();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("Is there a middle name? Yes = 1, No = 0");
        int middle = kb.nextInt();
        if (middle == 1) {
            System.out.print("enter middle name, putting all middle names in spaces if necessary: ");
            try {
                n2 = kb.next();
            } catch (Exception e) {
                System.out.println("Invalid input.");
            }
        }

        System.out.print("enter last name: ");
        try {
            n3 = kb.next();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        System.out.println("Who is this related to? Use the exact name.");
        try {
            r = kb.next();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        Member[] family = new Member[1024];
        int id = 0;
        family[id] = new Member(n1, n2, n3, g, r);

        if (n2 != null) {
            System.out.println("This member's name is: " + family[id].getFirstName() + family[id].getMiddleName() + family[id].getLastName() + ".");
        }else{
            System.out.println("This member's name is: " + family[id].getFirstName() + family[id].getLastName());
        }

        id++;


        /*
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
        */
        //output the family
        //System.out.println(familyName);

        //class cannot be accessed from here, need to find a way to do that later

        //TODO: add checking for numbers, must only be chars
        //TODO: add saving for family tree on a file, also to be retrieved

    }
}

