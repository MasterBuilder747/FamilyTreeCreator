package Creator;

class Member {

    //mainParent
    //there will be a main starting father and mother as the start of the family tree
    //they will have the same last name, where married is always true, and married name will not be used
    //instead, in this case, for the main mother of the tree, lastName will always be the married name
    private boolean mainParent; //this determines what is explained above for this particular member
    //there are only two main parents, one female and one male

    //now couples are treated as a single unit, as it is impossible for both of them to be related to the parents

    //these are only applied if they are married
    //either one or the other are applied to relation
    private String motherName;
    private String fatherName;
    private int whoRelated; //whether the female or the male is related to the parent in the marrage
    //still uses the gender convention values
    //note that these are both first names

    //relations
    //parents
    //parent always has the same last name
    //parent must be exact name
    //includes mother and father
    private String parent; //use the first and last name of the parents (married name of the mother)
    //syntax: firstName lastName

    //children
    private String[] children = new String[20]; //a list of up to 20 children, if applicable
    private int childId; //the id of the child in the array of children of the couple
    //only use first name as identifier

    //marriage
    private boolean isCouple; //if couple or not, when if two members in the same member exist
    private boolean isMarried; //couples may not be married, also may have children without being married
    private String marriedName = null; //only used if gender = 0, stores the new last name
    //maiden name is the last name that is used
    private String spouse = null; //only used if married = true, exact name must be used
    //if spouse has a field, then we can assume that the member is married

    private int gender; //0 = female, 1 = male

    private String lastName; //the actual last name
    private String maidenName; //only applied ifCoupled = true && ifMarried = true to only the female of the member


    //construct the member
    //required: first and last name, gender
    //last name is always the maiden name if married



    //main parent constructor, children get added later using addChild()
    Member(int gender, boolean mainParent, String motherName, String fatherName, boolean isCouple, String lastName, boolean isMarried, String parent) {
        this.gender = gender;
        this.mainParent = mainParent;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.isCouple = isCouple;
        this.lastName = lastName;
        this.isMarried = isMarried;
        this.parent = parent;
    }
    //child constructor, children do not exist
    Member(int gender, String firstName, boolean mainParent, String parent) {
        this.gender = gender;

        this.lastName = lastName;
        this.mainParent = mainParent;
        this.parent = parent;
    }
    //regular parent constructor, children get added later using addChild()
    Member(int gender, String firstName, String lastName, boolean mainParent, String parent, String spouse) {
        this.gender = gender;

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
    void setMarriedName(String marriedName) {
        this.marriedName = marriedName;
    }

    //getters
    String getChild(int id) {
        if (children[id] == null) {
            return children[id];
        } else {
            return "none";
        }
    }
    String getParent() {
        if (!mainParent) {
            return parent;
        }else{
            return "none";
        }
    }

    String getLastName() {
        if (marriedName == null) {
            return lastName;
        }else{
            return marriedName;
        }
    }
    String getGender() {
        if (gender == 0) {
            return "female";
        } else {
            return "male";
        }
    }
}