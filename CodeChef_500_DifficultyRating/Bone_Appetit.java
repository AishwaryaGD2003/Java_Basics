import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        int N = sc.nextInt(); // Number of people in "Bones"
        int M = sc.nextInt(); // Number of people in "Blood"
        int X = sc.nextInt(); // Number of treats per person in "Bones"
        int Y = sc.nextInt(); // Number of treats per person in "Blood"

        // Calculate the total number of treats
        int totalTreats = (N * X) + (M * Y);

        // Output the result
        System.out.println(totalTreats);

        sc.close();
    }
}
