import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        //lambdas & method references
        stringList.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}
