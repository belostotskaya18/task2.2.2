import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();
    }
}

