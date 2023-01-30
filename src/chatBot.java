import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class chatBot {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String input ="";
        System.out.println("What do you want");

        while(!input.equals("quit")) {
            String response = "";
            int random = new Random().nextInt(2 - 1 + 1) + 1;
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
            Pattern p4 = Pattern.compile("Can you help me with (.*)"); 
            Matcher m4 = p4.matcher(input);
            Pattern p5 = Pattern.compile("I'm looking for (.*)"); 
            Matcher m5 = p5.matcher(input);
            Pattern p6 = Pattern.compile("I'm worried about (.*)"); 
            Matcher m6 = p6.matcher(input);
            Pattern p7 = Pattern.compile("I think (.*)"); 
            Matcher m7 = p7.matcher(input);
            Pattern p8 = Pattern.compile("I'm feeling (.*)"); 
            Matcher m8 = p8.matcher(input);
            Pattern p9 = Pattern.compile("I have a problem with (.*)"); 
            Matcher m9 = p9.matcher(input);
            Pattern p10 = Pattern.compile("Are you (.*)"); 
            Matcher m10 = p10.matcher(input);
            Pattern p11 = Pattern.compile("Can you (.*)"); 
            Matcher m11 = p11.matcher(input);
            Pattern p12 = Pattern.compile("You are (.*)"); 
            Matcher m12 = p12.matcher(input);
            Pattern p13 = Pattern.compile("I'm confused about (.*)"); 
            Matcher m13 = p13.matcher(input);
            Pattern p14 = Pattern.compile("I (.*) you"); 
            Matcher m14 = p14.matcher(input);
            Pattern p15 = Pattern.compile("Why are you (.*)"); 
            Matcher m15 = p15.matcher(input);
            Pattern p16 = Pattern.compile("My (.*) is (.*)"); 
            Matcher m16 = p16.matcher(input);
            Pattern p17 = Pattern.compile("What is your name\\?"); 
            Matcher m17 = p17.matcher(input);
            Pattern p18 = Pattern.compile("(.*) my favorite"); 
            Matcher m18 = p18.matcher(input);
            Pattern p19 = Pattern.compile("I (.*) the feeling of (.*)"); 
            Matcher m19 = p19.matcher(input);
            Pattern p20 = Pattern.compile("I'm not sure (.*)"); 
            Matcher m20 = p20.matcher(input);
            //producing the proper response
            if(m1.matches()) {
                if(random==1)
                    response = "What would getting " + reflect(m1.group(1)) + " mean to you?"; 
                else if(random==2)
                    response = "What would " + reflect(m1.group(1)) + " accomplish for you?";
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
            else if(m4.matches()) {
                response = "Of course, I'd be happy to help with " + reflect(m4.group(1)) + 
                ". What do you need specifically?";
            }
            else if(m5.matches()) {
                response = "What would finding " + reflect(m5.group(1)) + " do for you?";
            }
            else if(m6.matches()) {
                response = "Why are you worried about " + reflect(m6.group(1)) + "?";
            }
            else if(m7.matches()) {
                response = "Why do you think " + reflect(m7.group(1)) + "?";
            }
            else if(m8.matches()) {
                response = "I'm sorry to hear that you're feeling " + reflect(m8.group(1)) + 
                    ". Is there anything I can do to help?";
            }
            else if(m9.matches()) {
                response = "What is the problem you're having with " + reflect(m9.group(1)) + "?";
            }
            else if(m10.matches()) {
                response = "I'm an AI, so I do not have the ability to be " + reflect(m10.group(1)) 
                    + ". Is there something specific you need help with?";
            }
            else if(m11.matches()) {
                response = "I'm not sure if I can " + reflect(m11.group(1)) 
                    + ". Can you please provide more context?";
            }
            else if(m12.matches()) {
                response = "I'm sorry, I don't understand how you perceive me as " + reflect(m12.group(1)) 
                + ". Can you please elaborate?";
            }
            else if(m13.matches()) {
                response = "Can you explain what specifically you're confused about " + reflect(m13.group(1));
            }
            else if(m14.matches()) {
                response = "Why do you " + reflect(m14.group(1)) + " me?";
            }
            else if(m15.matches()) {
                response = "I am not sure if I am capable of " + reflect(m15.group(1));
            }
            else if(m16.matches()) {
                if(random==1)
                    response = "I am sad to hear your " + reflect(m16.group(1)) + " is " + reflect(m16.group(2)); 
                else if(random==2)
                    response = "I am glad to hear your " + reflect(m16.group(1)) + " is " + reflect(m16.group(2));
            }
            else if(m17.matches()) {
                response = "I am a chatbot, so I don't have a name. You can call me ChatBotFrank";
            }
            else if(m18.matches()) {
                response = reflect(m18.group(1)) + " my favorite too!";
            }
            else if(m19.matches()) {
                response = "Why do you " + reflect(m19.group(1)) + " the feeling of " + reflect(m19.group(2)) + "?";
            }
            else if(m20.matches()) {
                response = "What specifically are you not sure about " + reflect(m20.group(1)) + "?";
            }
            else { // Give default response if input matches no pattern 
                response = "That's interesting. Tell me one of your favorite things.";
            }
            System.out.println(response);
        }
    }
    public static String reflect(String in) {
        String temp = " " + in + " ";
        String output = " " + in + " ";

        if(temp.contains(" are "))  {
            output = StringUtils.replaceEach(output, new String[] { " are " }, new String[] { " am " });
        }
        if(temp.contains(" I ")) {
            output = StringUtils.replaceEach(output, new String[] { " I " }, new String[] { " you " });
        }
        if(temp.contains(" you ")) {
            output = StringUtils.replaceEach(output, new String[] { " you " }, new String[] { " me " });
        }
        if(temp.contains(" you ")) {
            output = StringUtils.replaceEach(output, new String[] { " you " }, new String[] { " I " });
        }
        if(temp.contains(" am ")) {
            output = StringUtils.replaceEach(output, new String[] { " am " }, new String[] { " are " });
        }
        if(temp.contains(" were ")) {
            output = StringUtils.replaceEach(output, new String[] { " were " }, new String[] { " was " });
        }
        if(temp.contains(" you would ")) {
            output = StringUtils.replaceEach(output, new String[] { " you would " }, new String[] { " I'd " });
        }
        if(temp.contains(" you have ")) {
            output = StringUtils.replaceEach(output, new String[] { " you have " }, new String[] { " I've " });
        }
        if(in.contains(" you will ")) {
            output = StringUtils.replaceEach(output, new String[] { " you will " }, new String[] { " I'll " });
        }
        if(temp.contains(" your ")) {
            output = StringUtils.replaceEach(output, new String[] { " your " }, new String[] { " my " });
        }
        if(temp.contains(" I have ")) {
            output = StringUtils.replaceEach(output, new String[] { " I have " }, new String[] { " you've " });
        }
        if(temp.contains(" I will ")) {
            output = StringUtils.replaceEach(output, new String[] { " I will " }, new String[] { " you'll " });
        }
        if(temp.contains(" my ")) {
            output = StringUtils.replaceEach(output, new String[] { " my " }, new String[] { " your " });
        }
        if(temp.contains(" mine ")) {
            output = StringUtils.replaceEach(output, new String[] { " mine " }, new String[] { " yours " });
        }
        if(temp.contains(" me ")) {
            output = StringUtils.replaceEach(output, new String[] { " me " }, new String[] { " you " });
        }
        
        return output.substring(1, output.length()-1);
    }
}