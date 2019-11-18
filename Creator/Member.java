package Creator;

class Member {

    //mainParent
    //there will be a main starting father and mother as the start of the family tree
    //they will have the same last name, where married is always true, and married name will not be used
    //instead, in this case, for the main mother of the tree, lastName will always be the married name
    private boolean mainParent; //this determines what is explained above for this particular member
    //there are only two main parents, one female and one male

    //family member attributes
    //will use a constructor when making family members
    private String firstName;
    //this can have multiple middle names with a space in between
    private String lastName;

    //relations
    //parents
    //parent always has the same last name
    //parent must be exact name
    //includes mother and father
    private String parent; //use the last name of the parents (married name of the mother)
    //children
    private String[] children = new String[20]; //a list of up to 20 children, if applicable
    //only use first name as identifier

    //marriage
    private String marriedName; //only used if gender = 0, stores the new last name
    //maiden name is the last name that is used
    private String spouse; //only used if married = true, exact name must be used
    //if spouse has a field, then we can assume that the member is married

    private int gender; //0 = female, 1 = male

    //construct the member
    //required: first and last name, gender
    //last name is always the maiden name if married
    //general constructor, not used
    Member (int gender, String firstName, String lastName) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //main parent constructor, children get added later using addChild()
    Member (int gender, String firstName, String lastName, boolean mainParent) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainParent = mainParent;
    }
    //child constructor
    Member (int gender, String firstName, String lastName, boolean mainParent, String parent) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainParent = mainParent;
        this.parent = parent;
    }
    //regular parent constructor, children get added later using addChild()
    Member (int gender, String firstName, String lastName, boolean mainParent, String parent, String spouse) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainParent = mainParent;
        this.parent = parent;
        this.spouse = spouse;
    }


    //setters
    void addChild(int id, String name) {
        //name of the child is added ot an internal array of children from the parent member
        //this will have to be applied twice to both the mother and father
        this.children[id] = name;
    }

    //getters
    String getChild(int id) {
        if (children[id] == null) {
            return children[id];
        }else{
            return "none";
        }
    }
    String getFirstName() {
        return firstName + " ";
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
