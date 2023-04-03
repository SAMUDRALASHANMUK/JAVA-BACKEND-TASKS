import java.util.*;

public class Permutations
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string for permutation: ");
        String str = scanner.nextLine();
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push("");
        while (!stack.isEmpty())
        {
            String prefix = stack.pop();

            if (prefix.length() == str.length())
            {
                result.add(prefix);
            }
            else
            {
                for (int i = 0; i < str.length(); i++)
                {

                    String ch = String.valueOf(str.charAt(i));
                    if (!prefix.contains(ch))
                    {
                        stack.push(prefix + ch);

                    }
                }
            }
        }
        System.out.println(result);
    }
}
