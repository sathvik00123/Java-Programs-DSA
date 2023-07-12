import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexClasses {
    public static void main(String args[]){
        // method - 1
        Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher("aenm");
        boolean b = m.matches();

        System.out.println(b);
        System.out.println();

        // method - 2
        boolean b1 = Pattern.compile("..s").matcher("fas").matches();
        System.out.println(b1);
        System.out.println();

        //method - 3
        System.out.println(Pattern.matches("[asdf]","a"));
        System.out.println(Pattern.matches("[asdf]","as")); // takes only input as one char, no two 
        System.out.println(Pattern.matches("[^nmd]","x"));
        System.out.println(Pattern.matches("[^nmd]","n"));
        System.out.println(Pattern.matches("[A-Za-s]","y"));
        System.out.println(Pattern.matches("[a-ds-z]","y"));
        System.out.println();


        System.out.println(Pattern.matches("[MS][a-z]{6}","Sathvik"));
        System.out.println(Pattern.matches("[MS][a-z]{6}","Manish"));  // length is not satisified so false
        System.out.println(Pattern.matches("[MS][a-z]{4}","Ragav"));  // first character is not matching so false
        System.out.println(Pattern.matches("[N][A-Z]{5}","NITHIN"));
        System.out.println();

        //  Quantifier examples
        // [x]?  x Occurs once or not at all
        System.out.println(Pattern.matches("[xyz]?","x"));
        System.out.println(Pattern.matches("[xyz]?","xx"));
        System.out.println(Pattern.matches("[xyz]?","xxyyyzz"));
        System.out.println();

        // [x]+ x Occurs once or more times.
        System.out.println(Pattern.matches("[xyz]+","x"));
        System.out.println(Pattern.matches("[xyz]+","yyyxxxxzz"));
        System.out.println(Pattern.matches("[xz]+","yyzz"));
        System.out.println();

        // [x]* x Occurs zero or more times.
        System.out.println(Pattern.matches("[xyz]*","zz"));
        System.out.println(Pattern.matches("[xyz]*","yyyxxxxzz"));
        System.out.println(Pattern.matches("[xz]*","x"));
        System.out.println();

        // MetaCharacters
        // "\d", if the character sequence consists of any digit
        System.out.println(Pattern.matches("\\d","1"));
        System.out.println(Pattern.matches("\\d","121"));
        System.out.println(Pattern.matches("\\d","3d"));
        System.out.println();

        // "\D", if the character sequence consists of any Character
        System.out.println(Pattern.matches("\\D","1d"));
        System.out.println(Pattern.matches("\\D","s"));
        System.out.println(Pattern.matches("\\D","sad"));
        System.out.println();

        // To match length of characters
        System.out.println(Pattern.matches("[a-zA-Z0-9]{10}","sathvik213"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{8}","sathvik213"));
    }   
}
