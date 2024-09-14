import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
    if(S.length() == 10)
    {
        char luckyLetter = S.charAt(6);
        System.out.println(luckyLetter);
    }
    else {
        System.out.println();
    }
	}
}
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.length() == 10) {
            char luckyLetter = S.charAt(6);
            System.out.println(luckyLetter);
        }
        sc.close();
    }
}
