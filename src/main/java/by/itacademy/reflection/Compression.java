package by.itacademy.reflection;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compression {

    //  private static final Logger LOGGER = Logger.getLogger(Connection.class.getName());
    public String compressionIn(String str) {
        Pattern pattern = Pattern.compile("([a-z])\\1+");
        String string = str;
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String match = matcher.group();
            int length = match.length();
            string = string.replaceFirst(match, match.substring(0, 1) + length);
        }
//          try {
//            throw new Exception();
//          }
//          catch (Exception e) {
//            LOGGER.log(Level.WARNING, e.getMessage(), e);
//          }
        return string;
    }

    public String compressionOut(String str) {
        Pattern pattern = Pattern.compile("((.)\\d)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            String match = matcher.group();
            char[] array = match.toCharArray();
            int n = Character.digit(array[1], 10);
            String substitution = "";
            for (int i = 0; i < n; i++) {
                substitution += array[0];
            }
            str = str.replaceFirst(match, substitution);
        }
        return str;
    }
}