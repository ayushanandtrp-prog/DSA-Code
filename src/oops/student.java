package oops;
class student1{
    String name;
    int roolno;
    int marks;
}
public class student {
    public static void main(String[]args){
        student1 s1 = new student1();
        s1.name= "Ayush";
        s1.roolno = 3;
        s1.marks = 89;
        student1 s2 = new student1();
        s2.name= "Anand";
        s2.roolno = 1;
        s2.marks = 87;
        student1 s3 = new student1();
        s3.name= "Divansh";
        s3.roolno = 6;
        s3.marks = 98;
        student1 students [] = new student1[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i = 0 ; i < students.length;i++){
            System.out.println(students[i].name + ":" + students[i].roolno + ":" + students[i].marks);
        }
    }
}
