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
            Pattern p4 = Pattern.compile(""); 
            Matcher m4 = p4.matcher(input);
            Pattern p5 = Pattern.compile(""); 
            Matcher m5 = p5.matcher(input);
            Pattern p6 = Pattern.compile(""); 
            Matcher m6 = p6.matcher(input);
            Pattern p7 = Pattern.compile(""); 
            Matcher m7 = p7.matcher(input);
            Pattern p8 = Pattern.compile(""); 
            Matcher m8 = p8.matcher(input);
            Pattern p9 = Pattern.compile(""); 
            Matcher m9 = p9.matcher(input);
            Pattern p10 = Pattern.compile(""); 
            Matcher m10 = p10.matcher(input);
            Pattern p11 = Pattern.compile(""); 
            Matcher m11 = p11.matcher(input);
            Pattern p12 = Pattern.compile(""); 
            Matcher m12 = p12.matcher(input);
            Pattern p13 = Pattern.compile(""); 
            Matcher m13 = p13.matcher(input);
            Pattern p14 = Pattern.compile(""); 
            Matcher m14 = p14.matcher(input);
            Pattern p15 = Pattern.compile(""); 
            Matcher m15 = p15.matcher(input);
            Pattern p16 = Pattern.compile(""); 
            Matcher m16 = p16.matcher(input);
            Pattern p17 = Pattern.compile(""); 
            Matcher m17 = p17.matcher(input);
            Pattern p18 = Pattern.compile(""); 
            Matcher m18 = p18.matcher(input);
            Pattern p19 = Pattern.compile(""); 
            Matcher m19 = p19.matcher(input);
            Pattern p20 = Pattern.compile(""); 
            Matcher m20 = p20.matcher(input);
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


// "I want a (.*)" - "What would getting " + reflect(m1.group(1)) + " mean to you?"
// "I need (.*)" - "Why do you need " + reflect(m1.group(1)) + "?"
// "Can you help me with (.*)" - "Of course, I'd be happy to help with " + reflect(m1.group(1)) + ". What do you need specifically?"
// "I'm looking for (.*)" - "What would finding " + reflect(m1.group(1)) + " do for you?"
// "I'm feeling (.*)" - "I'm sorry to hear that you're feeling " + reflect(m1.group(1)) + ". Is there anything I can do to help?"
// "I want to (.*)" - "What would " + reflect(m1.group(1)) + " accomplish for you?"
// "I want to (.) because (.)" - "What specifically about " + reflect(m1.group(2)) + " makes you want to " + reflect(m1.group(1)) + "?"
// "I have a problem with (.*)" - "What is the problem you're having with " + reflect(m1.group(1)) + "?"
// "I'm (.) because (.)" - "How does " + reflect(m1.group(2)) + " make you feel " + reflect(m1.group(1)) + "?"
// "I (.*) you" - "Why do you " + reflect(m1.group(1)) + " me?"
// "I (.) (.)" - "Why do you " + reflect(m1.group(1)) + " " + reflect(m1.group(2)) + "?"
// "Can you (.*)" - "I'm not sure if I can " + reflect(m1.group(1)) + ". Can you please provide more context?"
// "Are you (.*)" - "I'm an AI, so I do not have the ability to be " + reflect(m1.group(1)) + ". Is there something specific you need help with?"
// "You are (.*)" - "I'm sorry, I don't understand how you perceive me as " + reflect(m1.group(1)) + ". Can you please elaborate?"
// "I think (.*)" - "Why do you think " + reflect(m1.group(1)) + "?"
// "I'm feeling (.) because (.)" - "How does " + reflect(m1.group(2)) + " make you feel " + reflect(m1.group(1)) + "?"
// "I'm not sure (.*)" - "What specifically are you not sure about " + reflect(m1.group(1)) + "?"
// "I (.) to (.)" - "What would be the reason for you " + reflect(m1.group(1)) + " " + reflect(m1.group(2)) + "?"
// "I'm worried about (.*)" - "Why are you worried about " + reflect(m1.group(1)) + "?"
// "I'm confused about (.*)" - "Can you explain what specifically you're confused about " + reflect(m1.group(1))