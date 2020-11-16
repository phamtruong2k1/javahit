package bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0]=new Rectangle(3,4);
        shapes[1]=new Circle(4);
        shapes[2]=new Rectangle(3.3,4.4);
        for (int i=0;i<=2;i++){
            System.out.println("Area of shapes["+i+"]: " + shapes[i].getArea());
            System.out.println("Perimeter of shapes["+i+"]: " + shapes[i].getPerimeter());
        }
    }
}
