package Creator;

public class Member {

    //family member attributes
    //will use a constructor when making family members
    private String firstName;
    private String middleName; //null will have to be handled if skipping a middle name
    //this can have multiple middle names with a space in between
    private String lastName;

    private int gender; //0 = female, 1 = male
    private String relation; //how the member is related in the family
    private final int ID;

    //private final int ID; //passed from the for statement, stored in the array and object in case as a final

    Member (int id, String n1, String n2, String n3) {
        ID = id;
        firstName = n1;
        middleName = n2;
        lastName = n3;
    }
    Member (int id, String n1, String n2, String n3, int g, String r) {
        ID = id;
        firstName = n1;
        middleName = n2;
        lastName = n3;
        gender = g;
        relation = r;
    }

    //setters
    void setFirstName(String name) {
        firstName = name;
    }
    void setMiddleName(String name) {
        if (name != null) {
            middleName = name;
        }
    }
    void setLastName(String name) {
        lastName = name;
    }
    void setGender(int g) {
        gender = g;
    }
    void setRelation(String r) {
        relation = r;
    }

    //getters
    String getFirstName() {
        return firstName + " ";
    }
    String getMiddleName() {
        if (middleName == null) {
            return "";
        }else {
            return middleName + " ";
        }
    }
    String getLastName() {
        return lastName + "";
    }
    String getGender() {
        if (gender == 0) {
            return "female";
        }else{
            return "male";
        }
    }
    public String getRelation() {
        return relation;
    }

}
