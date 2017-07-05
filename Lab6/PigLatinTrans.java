import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by: Richard
 * Date of Creation: 6/30/2017
 */
public class PigLatinTrans {

    public static void main(String[] args) {

        String cont = "y";
        Scanner scan = new Scanner(System.in);
        Pattern nonchar = Pattern.compile("[^a-z]");
        Pattern vowels = Pattern.compile("[aeiou]");
        Matcher matchernonchar, matcher;
        StringBuilder word;
        //scans the stringbuilder for non alphabetical characters (excluding contractions)
        //if any are found, does no work. Otherwise, continue onwards and pig latin-fy the word
        while (cont.equalsIgnoreCase("y")) {
            System.out.println("Please enter a word:");
            //scans the next WORD into a stringbuilder object.
            word = new StringBuilder(scan.next().toLowerCase());
            matchernonchar = nonchar.matcher(word);
            if (matchernonchar.find()) System.out.println("oboinonchar");
            else {
                matcher = vowels.matcher(word);
                // get the index location of the first vowel.
                if(matcher.find()) {
                    // might need an int to hold matcher.start();
                    if(matcher.start() == 0) {
                        word.append("w");
                    }
                    else {
                        //appends the beginning till the first vowel to the end.
                        word.append(word.substring(0,matcher.start()));
                        word.delete(0,matcher.start());
                    }
                    word.append("ay");
                }

            }
            System.out.println(word);
            //clear line
            scan.nextLine();
            System.out.println("Continue? (Y to continue)");
            cont = scan.nextLine();
        }

    }

}
