import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.lang.Object;
import org.apache.commons.lang3.StringUtils;

public class chatBot {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String input ="";

        while(!input.equals("quit")) {
            String response = "";
            int random = new Random().nextInt(2 - 1 + 1) + 1;
            System.out.println("What do you want");
            input = scan.nextLine();

            //breaks the loop if quit is said
            if(input.equals("quit"))
                break;
            
            Pattern p1 = Pattern.compile("I want (.*)"); 
            Matcher m1 = p1.matcher(input);
            Pattern p2 = Pattern.compile("My favorite (.*) is (.*)"); 
            Matcher m2 = p2.matcher(input);
            Pattern p3 = Pattern.compile("I need (.*)"); 
            Matcher m3 = p3.matcher(input);

            //producing the proper response
            if(m1.matches()) {
                response = "What would getting " + reflect(m1.group(1)) + " mean to you?"; 
            }
            else if(m2.matches()) {
                response = "Besides " + reflect(m2.group(2)) +
                            ", what is your second favorite " + reflect(m2.group(1)) + "?";
            }
            else if(m3.matches()) {
                if(random==1)
                    response = "Would it really help you to get " + reflect(m3.group(1));
                else if(random==2)
                    response = "Are you sure you really need " + reflect(m3.group(1));
            }
            else { // Give default response if input matches no pattern 
                response = "That's interesting. Tell me one of your favorite things.";
            }

            System.out.println(response);
        }
    }

    public static String reflect(String in) {
        String temp = in;
        if(in.contains(" are "))
            temp = StringUtils.replaceEach(temp, new String[] { " are " }, new String[] { " am " });
        if (in.contains(" am "))
            temp = StringUtils.replaceEach(temp, new String[] { " am " }, new String[] { " are " });
        if(in.contains(" were "))
            temp = StringUtils.replaceEach(temp, new String[] { " were " }, new String[] { " was " });
        if(in.contains(" you "))
            temp = StringUtils.replaceEach(temp, new String[] { " you " }, new String[] { " me " });
        if(in.contains(" you "))
            temp = StringUtils.replaceEach(temp, new String[] { " you " }, new String[] { " I " });
        if(in.contains(" you would "))
            temp = StringUtils.replaceEach(temp, new String[] { " you would " }, new String[] { " I'd " });
        if(in.contains(" you have "))
            temp = StringUtils.replaceEach(temp, new String[] { " you have " }, new String[] { " I've " });
        if(in.contains(" you will "))
            temp = StringUtils.replaceEach(temp, new String[] { " you will " }, new String[] { " I'll " });
        if(in.contains(" your "))
            temp = StringUtils.replaceEach(temp, new String[] { " your " }, new String[] { " my " });
        if(in.contains(" I have "))
            temp = StringUtils.replaceEach(temp, new String[] { " I have " }, new String[] { " you've " });
        if(in.contains(" I will "))
            temp = StringUtils.replaceEach(temp, new String[] { " I will " }, new String[] { " you'll " });
        if(in.contains(" my "))
            temp = StringUtils.replaceEach(temp, new String[] { " my " }, new String[] { " your " });
        if(in.contains(" mine "))
            temp = StringUtils.replaceEach(temp, new String[] { " mine " }, new String[] { " yours " });
        if(in.contains(" me "))
            temp = StringUtils.replaceEach(temp, new String[] { " me " }, new String[] { " you " });
        return temp;
    }
}