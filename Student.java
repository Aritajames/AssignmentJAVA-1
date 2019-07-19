package Assignment2;

public class Student {

    String name;
    int roll_no;
    String address;
    int phone_number;


    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student();

        stud1.name = "Sam";
        stud1.roll_no = 10090;
        stud1.address = "P.O. Box 92, KISII";
        stud1.phone_number = 74223918;

        System.out.println(stud1.name+" "+stud1.roll_no+" "+stud1.address+" "+stud1.phone_number);


        stud2.name = "John";
        stud2.roll_no = 10091;
        stud2.address = "P.O. Box 94, KISII";
        stud2.phone_number = 77098320;

        System.out.println(stud2.name+" "+stud2.roll_no+" "+stud2.address+" "+stud2.phone_number);





    }
}
