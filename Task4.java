public class Task4 {
    
    public static void main(String[] args) {
        
        Task4 e= new Task4();
        Employee e1= e.new Employee(34,"Tina","Accountant",10000);
        e1.print();
    }
class Employee{

    int emp_id;
    String emp_name;
    String emp_designation;
    int salary;
    
    Employee(){
        System.out.println("Default...");
    }

    Employee(int emp, String n, String d,int s){
        
        emp_id=emp;
        emp_name=n;
        emp_designation=d;
        salary=s;
    }

    void print(){

        System.out.println("Emp id = "+emp_id);
        System.out.println("Emp Name = "+emp_name);
        System.out.println("Emp designation = "+emp_designation);
        System.out.println("Emp salary = "+salary);
    }

}
}
