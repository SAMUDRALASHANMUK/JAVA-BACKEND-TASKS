import java.util.Scanner;

public class AppendStrings{
    public static void add(String word1,String word2)
    {
    int word1len = word1.length();
    int word2len = word2.length();
        if (word1len == word2len)
            System.out.println(word1 + word2);
        else{
            if(word1len>word2len)
            {
                int len = word1len-word2len;

                System.out.println(word2+word1.substring(len));
            }
            else if(word1len<word2len)
            {
                int len = word2len-word1len;
                System.out.println(word1+word2.substring(len));
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word1: ");
        String word1 = scanner.nextLine();
        System.out.println("Enter word 2: ");
        String word2 = scanner.nextLine();
        add(word1,word2);
    }
}
