import java.util.*;

public class Main {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(number));
    }
}
