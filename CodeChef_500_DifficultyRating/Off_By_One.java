import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int result = A + B;
        System.out.println(result * 10 + 1);
        
        sc.close();
    }
}
