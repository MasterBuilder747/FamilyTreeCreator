package Creator;

import java.util.Scanner;

public class Main {

    /*
    private static Member createMember(int id) {

        Scanner kb = new Scanner(System.in);

        String n1 = null;
        String n2 = null;
        String n3 = null;
        int g = 0;
        String r = null;

        System.out.print("Enter first name: ");
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
        System.out.print("Enter last name: ");
        try {
            n3 = kb.next();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
        System.out.println("What is the gender of the member? 0 = female, 1 = male");
        try {
            g = kb.nextInt();
        }catch (Exception e) {
            System.out.println("Invalid input.");
        }
        System.out.println("Who is this related to? Use the exact name.");
        try {
            r = kb.next();
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }

        return new Member(id, n1, n2, n3, g, r);
    }
    */

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("===Family Tree Creator===");
        System.out.println("Enter name of family: ");
        String familyName = kb.next();
        System.out.println("Your family name is: " + familyName);

        Member[] family = new Member[1024];
        for (int i = 0; i < 1024; i++) {
            //family[i] = createMember(i);
        }

        //System.out.println("Name: " + family[0].getFirstName() + " " + family[0].getMiddleName() + " " + family[0].getLastName());

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

