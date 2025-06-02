package OOP.Classes;
class CVTemplate {
    String name;
    String contactInformation;
    int workExperience;
    String education;
    String skills;

    //constructors doesnt have a return type
    public CVTemplate(String initialName, String initialContact, String initialSkill, int initialExpereince, String initialEducation){
        System.out.println("Constructor is being called for a new CV!");
        this.name = initialName;
        this.contactInformation = initialContact;
        this.skills = initialSkill;
        this.workExperience = initialExpereince;
        this.education = initialEducation;
        this.displayBasicInfo();

        //A constructor is like a special setup method that gets automatically called when you create a new object using the new keyword. 
        //Its main purpose is to initialize the object's attributes with some initial values.
    }

    public CVTemplate(String initialContact, String initialSkill, int initialExpereince, String initialEducation, String name){
        System.out.println("Constructor is being called for a new CV!");
        this.name = name;
        this.contactInformation = initialContact;
        this.skills = initialSkill;
        this.workExperience = initialExpereince;
        this.education = initialEducation;
        this.sendMessage("Java is fun as in foine!!!");
    }

    void sendMessage(String message) {
        System.out.println("Notification: " + message);
    }

    void displayBasicInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Contact: "+ this.contactInformation);
    }

    void displaySkills(){
        System.out.println("Skill: " + this.skills);
    } 

    void education(){
        System.out.println("your Education: "+ this.education);
    }
}

public class lesson_17_constructors {

    public static void main(String[] args){
        CVTemplate person1CV = new CVTemplate("Alice John", "echendujosh@gmail.com | 09063938743", "java, python, sql", 22, "BSC in computer science");

        System.out.println("--- CV for Alice ---");
        person1CV.displayBasicInfo();
        person1CV.displaySkills();
        System.out.println("Experience: "+ person1CV.workExperience);
        person1CV.education();
        person1CV.sendMessage("Josh is here to learn java");
        System.out.println();

        CVTemplate person2CV = new CVTemplate("joshanu55@gmail.com | 07037108940", "C, python, C++", 7, "BSC in mathematics", "Echendu joshua");

        System.out.println("--- CV for Echendu joshua ---");
        person2CV.displayBasicInfo();
        person2CV.displaySkills();
        System.out.println("Experience: "+ person2CV.workExperience);
        person2CV.education();
        System.out.println();

    }
}

// Special Name: The constructor has the exact same name as the class (public CVTemplate).
// No Return Type: Unlike regular methods, constructors do not have a return type (not even void).
// Automatic Invocation: It's automatically called when you use the new keyword followed by the class name and parentheses (e.g., new CVTemplate(...)).
// Initialization: Inside the constructor, we can write code to set the initial values of the object's attributes. In our example, the constructor takes initialName and initialContact as input and assigns them to the name and contactInformation attributes of the newly created CVTemplate object.
// Multiple Constructors (Constructor Overloading): A class can have multiple constructors with different parameters. This allows you to create objects in different ways, providing different initial information. For example, we could have a constructor that only takes the name, or one that takes name, contact, and education.