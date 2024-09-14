import java.util.Scanner;

class Ageing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            // Age of Chef
            int X = sc.nextInt();

            // Chefina's age is X - 10
            int chefinaAge = X - 10;

            // Output Chefina's age
            System.out.println(chefinaAge);
        }

        sc.close();
    }
}
