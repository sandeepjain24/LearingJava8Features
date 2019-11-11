package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListWithStream {
    public static void main(String[] args){
        List<Integer> listOfInteger = Arrays.asList(8, 22, 02, 28);

        // Java 8- method reference
        int total1 = listOfInteger.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total 1:" + total1);

        // Java 8- traditional way
        int total2 = listOfInteger.stream().mapToInt(i -> i).sum();
        System.out.println("Total 2:" + total2);

        // Java 8- Collectors: Bonus point:)
        int total3 = listOfInteger.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Total 3:" + total3);
    }
}
