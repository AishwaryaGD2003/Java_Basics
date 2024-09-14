import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int studentsLeft = Math.max(0, N - M);
            System.out.println(studentsLeft);
        }
        
        sc.close();
    }
}
