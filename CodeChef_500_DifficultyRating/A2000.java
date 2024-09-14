import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of Rs. 2000 notes
        int N = sc.nextInt();

        // Calculate the total amount Chef has in Rs. 2000 notes
        int totalAmount = N * 2000;

        // Calculate the number of Rs. 500 notes needed
        int notesNeeded = totalAmount / 500;

        // Output the number of Rs. 500 notes needed
        System.out.println(notesNeeded);

        sc.close();
    }
}
