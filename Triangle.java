package Assignment2;

public class Triangle {

    public Triangle(){}

    public static void main(String[] args) {
        Calculate Triangle = new Calculate();

        Triangle.area = 0.5 * Triangle.height * Triangle.base;
        Triangle.perimeter = Triangle.height + Triangle.base + Triangle.hypo;

        System.out.println("The area of the triangle is "+Triangle.area+" while its perimeter is "+Triangle.perimeter);

    }

}