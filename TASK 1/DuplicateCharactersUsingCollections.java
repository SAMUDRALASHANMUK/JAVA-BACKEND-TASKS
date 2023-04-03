import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersUsingCollections
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter thw word: ");

        String str = scanner.nextLine();

        Map<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charFreq.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}
