package Assignment2;

public class Employee {

    public void getInfo(int salary , int time){
        int sal=salary;
        int tim=time;

        System.out.println("The salary is "+sal+" dollars and the hours worked is "+tim);
    }

    public void AddSal(int salary){
        if(salary<500){
            int sal = 10+salary;
            System.out.println(sal);
        }
    }

    public void AddWork(int time , int salary){
        if(time>6){
            int sall = salary + 5;
            System.out.println(sall);
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.getInfo(233,6);
        emp.AddSal(455);
        emp.AddWork(7,455);

    }

}
