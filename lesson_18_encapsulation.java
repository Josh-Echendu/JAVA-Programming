class Student{
    private String name;
    private int age;

    public void setName(String newName){
        this.name = newName;
        System.out.println(this.name);
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int newAge){
        this.age = newAge;
        System.out.println(this.age);
    }

    public int getAge(){
        return this.age;
    }
} 



public class lesson_18_encapsulation {
    public static void main(String[] args){
        Student s = new Student();

        //calling the setName method
        s.setName("josh");
        s.setAge(34);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
