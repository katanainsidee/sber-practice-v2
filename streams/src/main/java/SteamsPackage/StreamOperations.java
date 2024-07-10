package SteamsPackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {
        Random random = new Random();
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");

        Stream<StreamContainer> streamContainerStream = stringList.stream()
                .map(name -> new StreamContainer(name, random.nextLong()));

        streamContainerStream.forEach(System.out::println);

        Map<Long, String> map = stringList.stream()
                .map(name -> new StreamContainer(name, random.nextLong()))
                .collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));

        System.out.println(map);

        Map<String, List<StreamContainer>> mapOfLists = new HashMap<>();
        mapOfLists.put("group1", Arrays.asList(new StreamContainer("A", 1), new StreamContainer("B", 2)));
        mapOfLists.put("group2", Arrays.asList(new StreamContainer("C", 3), new StreamContainer("D", 4)));

        Stream<StreamContainer> unifiedStream = mapOfLists.values().stream()
                .flatMap(List::stream);

        List<StreamContainer> containerList = unifiedStream.collect(Collectors.toList());
        long count = containerList.size();

        System.out.println("Total count: " + count);

        String binaryString = "1010101010";

        Stream<Boolean> booleanStream = binaryString.chars()
                .mapToObj(c -> c == '1');

        boolean finalResult = booleanStream.reduce(true, (a, b) -> a && b);

        System.out.println("Final result: " + finalResult);
    }
}
