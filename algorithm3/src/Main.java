import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> divided3Integers = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+\\S?\\d*");
        Matcher matcher = pattern.matcher(args[0]);

        while(matcher.find()) {
            String s = matcher.group(0);
            if (s.replaceAll("\\D", "").length() == s.length()) {
                integers.add(Integer.parseInt(s));
            }
        }

        for(Integer integer : integers) {
            if(integer % 3 == 0) {
                divided3Integers.add(integer);
            }
        }

        System.out.println(divided3Integers);
    }
}