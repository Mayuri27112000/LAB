import java.util.Scanner;

public class StringsConcatination2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Taking two strings as input from the user
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        // Using StringBuilder to concatenate the strings
        StringBuilder concatenatedString = new StringBuilder();
        concatenatedString.append(s1);
        concatenatedString.append(s2);

        // Converting StringBuilder back to String and printing the result
        String result = concatenatedString.toString();
        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}