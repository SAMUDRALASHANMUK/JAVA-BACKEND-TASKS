
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class LengthOfLongestSubstringModified
{
    static ArrayList<Integer>arrayList = new ArrayList<>();

    public static void getLength(String str)

    {
        String[] words = str.split("\\s+");

        for(int j = 0;j<words.length;j++)
        {

            Set<Character> set = new HashSet<>();
            int length = 0;
            for (int i = 0; i <words[j].length(); i++)
            {
                char c = words[j].charAt(i);
                if (!set.contains(c)) {
                    set.add(c);
                    length++;
                }
            }
            arrayList.add(length);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        getLength(str);
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size()-1));

    }
}
