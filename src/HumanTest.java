import java.util.Scanner;

public class HumanTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Human lexa = new Human(n,true);
        lexa.setMen(false);
        System.out.println(lexa);

    }
}
