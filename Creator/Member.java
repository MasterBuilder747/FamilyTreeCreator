package Creator;

public class Member {

    //family member attributes
    //will use a constructor when making family members
    private String firstName;
    private String middleName; //null will have to be handled if skipping a middle name
    //this can have multiple middle names with a space in between
    private String lastName;

    //relations
    //parents
    //parent always has the same last name
    //parent must be exact name
    //includes mother and father
    private String mother; //only use first name, always uses married name for setting last name
    private String father; //only use first name
    //children
    private String[] children = new String[10]; //a list of up to 10 children, if applicable
    //only use first name as identifier

    //marriage
    private String marriedName; //only used if married = true && gender = 0, stores the new last name
    //maiden name is the last name that is used
    //this must be handled by testing if married = true
    private boolean married;
    private String spouse; //only used if married = true, exact name must be used

    private int gender; //0 = female, 1 = male

    //construct the member
    //required: first and last name, gender
    //last name is always the maiden name if married
    Member (String firstName, String lastName, int gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
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


}
