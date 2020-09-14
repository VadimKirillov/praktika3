import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Book metodichka = new Book(1999,300,"KakUbitStudenta","Puturidze");
        metodichka.setPages(228);
        metodichka.setYear(n);
        System.out.println(metodichka);

    }
}
