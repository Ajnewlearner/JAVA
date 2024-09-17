import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static List<String> filterStrings(List<String> list, char letter) {
       return list.stream()
                  .filter(s -> s.startsWith(String.valueOf(letter)))
                  .collect(Collectors.toList());
    }

    public static void main(String[] args) {
       List<String> names = Arrays.asList("java", "scala", "javascript", "ruby");
       System.out.println(filterStrings(names,'j'));
    }
}
