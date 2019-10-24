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

    /*
    //TODO implement this later
    //ID: internal identifier in case
    private final int ID;

    /*
    //constructor to identify the member by ID
    public Member (final int id) {
        //ID = id;
    }
    public int getID() {
        return ID;
    }
    */

    //add information into the member
    public void addFirstName (String name) {
        firstName = name;
    }
    public void addMiddleName (String name) {
        middleName = name;
    }
    public void addMiddleName () {
        middleName = "none";
    }
    public void addLastName (String name) {
        lastName = name;
    }
    public void setGender (int g) {
        gender = g;
    }
    public void setRelation (String r) {
        relation = r;
    }

    //retrieve information about the member
    public String getFirstName () {
        return firstName;
    }
    public String getMiddleName () {
        if (middleName == null) {
            return "no middle name";
        }
        return middleName;
    }
    public String getLastName () {
        return lastName;
    }
    public String getGender () {
        if (gender == 0) {
            return "female";
        }else{
            return "male";
        }
    }
    public String getRelation () {
        return relation;
    }

}
