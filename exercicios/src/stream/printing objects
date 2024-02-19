package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintingObjects {
    public static void main(String[] args) {

        List<String> animals = Arrays.asList("Cat", "Dog", "Monkey", "Giraffe", "Bunny");

        //foreach
        for(String animal: animals) {
            System.out.println(animal);
        }

        System.out.printf("~~\n");

        //iterator
        Iterator<String> iterator = animals.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.printf("~~\n");

        //stream
        Stream<String> stream = animals.stream();
        stream.forEach(System.out::println);
    }
}
