import java.util.Scanner;

class ClearDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int clearDays = 7 - (X + Y);
        System.out.println(clearDays);
        sc.close();
    }
}
