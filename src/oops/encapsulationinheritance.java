package oops;
class person {
    private String Name;
    private int age;

    public void setName(String n) {
        Name = n;
    }

    public String getName() {
        return Name;
    }

    public void setage(int n) {
        age = n;
    }

    public int getage() {
        return age;
    }
}
    class Student extends person{
        public void study(){
            System.out.println("Student is studying ");
        }
    }

public class encapsulationinheritance {
    public static void main(String[]args){
        Student s = new Student();
        s.setName("Ayush Anand");
        s.setage(21);
        System.out.println(s.getName());
        System.out.println(s.getage());
        s.study();

    }
}
