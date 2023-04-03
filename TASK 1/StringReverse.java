import java.util.Scanner;
public class StringReverse
{
    public static String method(String word)
    {
        if (word.isEmpty())
         {
           return word;
         }
    else
    {
        return method(word.substring(1))+word.charAt(0);
    }

    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = new String(scanner.nextLine());

        System.out.println(method(word));

    }
}
