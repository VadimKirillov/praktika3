import java.util.Scanner;

public class CircleTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle pentagram = new Circle(2,5,6);

        int n = input.nextInt();
        System.out.println(pentagram.getCentrx() + " " + pentagram.getCentry() );
        pentagram.setRadius(n);
        System.out.println(pentagram.getRadius());

    }

}
