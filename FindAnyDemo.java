import java.util.Arrays;
import java.util.List;
public class FindAnyDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("k","BB","CC");    
        list.stream().findFirst().ifPresent(s->System.out.println(s));
    }
} 