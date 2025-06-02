package OOP.Classes;

class CVTemplate {
    // Attributes (characteristics or fields) of a CV
    String name;
    String contactInformation;
    String workExperience;
    String education;
    String skills;

    // Methods (actions or functionalities - though we'll keep them simple for now)
    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contactInformation);
    }

    void displaySkills() {
        System.out.println("Skills: " + skills);
    }
}

public class lesson_16_classes {
    public static void main(String[] args) {
        // Create the first CV object (representing one person's CV)
        CVTemplate person1CV = new CVTemplate();
        person1CV.name = "Alice Johnson";
        person1CV.contactInformation = "alice.j@email.com | 08012345678";
        person1CV.workExperience = "Software Developer at Tech Solutions Inc.";
        person1CV.education = "BSc in Computer Science";
        person1CV.skills = "Java, Python, SQL";

        System.out.println("--- CV for Alice ---");
        person1CV.displayBasicInfo();
        System.out.println("Work Experience: " + person1CV.workExperience);
        System.out.println("Education: " + person1CV.education);
        person1CV.displaySkills();
        System.out.println();

        // Create a second CV object (representing another person's CV)
        CVTemplate person2CV = new CVTemplate();
        person2CV.name = "Bob Williams";
        person2CV.contactInformation = "bob.w@phone.net | 09087654321";
        person2CV.workExperience = "Marketing Manager at Global Marketing Ltd.";
        person2CV.education = "MBA in Marketing";
        person2CV.skills = "Digital Marketing, SEO, Social Media";

        System.out.println("--- CV for Bob ---");
        person2CV.displayBasicInfo();
        System.out.println("Work Experience: " + person2CV.workExperience);
        System.out.println("Education: " + person2CV.education);
        person2CV.displaySkills();
    }
}
