import SteamsPackage.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperationsTest {

    @Test
    public void testStreamContainerOperations() {
        Random random = new Random();
        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");


        Stream<StreamContainer> streamContainerStream = stringList.stream()
                .map(name -> new StreamContainer(name, random.nextLong()));

        List<StreamContainer> containers = streamContainerStream.collect(Collectors.toList());
        assertEquals(5, containers.size());


        Map<Long, String> map = stringList.stream()
                .map(name -> new StreamContainer(name, random.nextLong()))
                .collect(Collectors.toMap(StreamContainer::getCount, StreamContainer::getName));

        assertEquals(5, map.size());


        Map<String, List<StreamContainer>> mapOfLists = new HashMap<>();
        mapOfLists.put("group1", Arrays.asList(new StreamContainer("A", 1), new StreamContainer("B", 2)));
        mapOfLists.put("group2", Arrays.asList(new StreamContainer("C", 3), new StreamContainer("D", 4)));

        Stream<StreamContainer> unifiedStream = mapOfLists.values().stream()
                .flatMap(List::stream);

        List<StreamContainer> containerList = unifiedStream.collect(Collectors.toList());
        long count = containerList.size();

        assertEquals(4, count);


        String binaryString = "1010101010";

        Stream<Boolean> booleanStream = binaryString.chars()
                .mapToObj(c -> c == '1');

        boolean finalResult = booleanStream.reduce(true, (a, b) -> a && b);

        assertFalse(finalResult);
    }
}