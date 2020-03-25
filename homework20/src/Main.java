import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String s = "Вот последние буквы всех слов в предложении";
        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }

    }
}
