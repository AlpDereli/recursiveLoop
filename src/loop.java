import java.util.Scanner;
public class loop {

    static void loop(int i)
    {
        if (i <= 0) {
            System.out.print(i + " ");
            return;
        }
        System.out.print(i + " ");
        loop(i - 5);
        System.out.print(i + " ");

    }






    public static void main(String[] args) {
        System.out.println("Number: ");
        Scanner take = new Scanner(System.in);
        int i = take.nextInt();
        loop(i);
    }
}
