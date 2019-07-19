package Assignment2;

public class Rectangle {
    int length,width;
    public Rectangle(int length, int width){
        length = length;
        width = width;
    }

    public int Area(){
        int area;
        area = length*width;
        return area;
    }

    public static void main(String[] args) {
        Rectangle recto1 = new Rectangle(4,5);
        Rectangle recto2 = new Rectangle(5,8);

        int area1,area2;
        area1 = recto1.Area();
        area2 = recto2.Area();

        System.out.println("The area of the first rectangle is "+area1+" and the that of the second is "+area2);

    }

}
