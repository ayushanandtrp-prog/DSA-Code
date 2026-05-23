package oops;
class employee{
    private int salary;
    private String name;
    public void setname(String s){
        name = s;
    }
    public String getname(){
        return name;
    }
    public void setsalary(int n){
        this.salary = n;
    }
    public int getSalary(){
        return salary;
    }
}
public class encapsulation {
    public static void main(String[]args){
        employee e = new employee();
        e.setname("Ayush Anand");
        e.setsalary(5000);
        System.out.println(e.getSalary());
        System.out.println(e.getname());
    }
}
