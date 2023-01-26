import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.lang.Object;
import org.apache.commons.lang3.StringUtils;

public class chatBot {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String response = "";
        int random = new Random().nextInt(2 - 1 + 1) + 1;
        System.out.println("Please enter input to start the program");
        String input = scan.nextLine();

        Pattern p1 = Pattern.compile("I want (.*)"); 
        Matcher m1 = p1.matcher(input);
        Pattern p2 = Pattern.compile("My favorite (.*) is (.*)"); 
        Matcher m2 = p2.matcher(input);
        Pattern p3 = Pattern.compile("I need (.*)"); 
        Matcher m3 = p3.matcher(input);

        //producing the proper response
        if(m1.matches()) {
            response = "What would getting " + m1.group(1) + " mean to you?"; 
        }
        else if(m2.matches()) {
            response = "Besides " + m2.group(2) +
                        ", what is your second favorite " + m2.group(1) + "?";
        }
        else if(m3.matches()) {
            if(random==1)
                response = "Would it really help you to get " + m3.group(1);
            else if(random==2)
                response = "Are you sure you really need " + m3.group(1);
        }
        else { // Give default response if input matches no pattern 
            response = "That's interesting. Tell me one of your favorite things.";
        }

        System.out.println(response);
    }

    public static String reflect(String in) {
        
    }
}