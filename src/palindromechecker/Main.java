package palindromechecker;
import palindromechecker.uc1.WelcomeMessage;
import palindromechecker.uc2.HardcodedPalindromeCheck;
import palindromechecker.uc3.ReverseUsingLoopCheck;


public class Main {
    public static void main(String[] args) {
        WelcomeMessage.display();
        HardcodedPalindromeCheck.execute();
        ReverseUsingLoopCheck.execute();
    }
}
