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

        //set the first and last name of the main parents:
        //their last name is also the family name
        System.out.println("Enter name of family: ");
        String familyName = kb.next();
        System.out.println("Enter the first name of the main Mother: ");
        String motherName = kb.next();
        System.out.println("Enter the first name of the main Father: ");
        String fatherName = kb.next();

        //this sets the last name of the main parents
        //this will be stored in the 0, 1 fields of the array, this will always be taken up and cannot be changed
        Member[] family = new Member[1024];
        family[0] = new Member(0, motherName, familyName, true);
        family[1] = new Member(1, fatherName, familyName, true);

        //add the children of the parents, using a new array for that tier when storing on the main parent
        //add id identifier
        int id = 0;
        //this id is used for the value of the child being added if so
        int childId = 0;
        System.out.println("Add a new child of the main parents: ");
        System.out.println("Enter the first name: ");
        String firstName = kb.next();
        System.out.println("Enter the last name: ");
        String lastName = kb.next();
        System.out.println("Are they female(0) or male(1) ?");
        int gender = kb.nextInt();
        family[2] = new Member(gender, firstName, lastName, false);
        family[2].addChild(childId, firstName);

        /*
        for (int i = 0; i < 1024; i++) {
            //family[i] = createMember(i);
        }
        */

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

