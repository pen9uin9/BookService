package homework;
import java.util.Scanner;
public class PhoneNumberChecker {
    public PhoneNumberChecker(String userMobile) {
        //String s = Integer.toString(userMobile);
        int len = userMobile.length();
        if (len >= 9 && len <= 11) {
        	System.out.println("true");
        	return;
        }
        System.out.println("false");
        return;
	}
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String userMobile;
    	while(true) {
    		userMobile = input.next();
        	PhoneNumberChecker Checker = new PhoneNumberChecker(userMobile);
    	}
    }
}
