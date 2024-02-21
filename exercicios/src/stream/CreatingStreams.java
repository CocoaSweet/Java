package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Ruby ", "c++\n");
		langs.forEach(print);
		
		String[] moreLangs = {"Python ","Cobol ","Elixir\n"};
		Stream.of(moreLangs).forEach(print);
		Arrays.stream(moreLangs).forEach(print);
		Arrays.stream(moreLangs, 1, 3).forEach(print);
		
		List<String> otherLangs =  Arrays.asList("c# ", "Kotlin ", "Swift\n");
		otherLangs.stream().forEach(print);		
		otherLangs.parallelStream().forEach(print);
		
		/* Stream.generate(() -> "a").forEach(print);
		 * Stream.iterate(1, n -> n + 1).forEach(print);
		 * */
		
	}

}
