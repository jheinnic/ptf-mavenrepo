package name.jchein.portfolio.common.web;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Collections2;

public class MakeGooglePermutations
{
	public static void main(String[] args)
	{
		ArrayList<String> source = new ArrayList<String>(10);
		source.add("a");
		source.add("e");
		source.add("i");
		source.add("o");
		source.add("u");
		
		System.out.println("Source:");
		System.out.println(source);
		System.out.println("Permutations:");
		System.out.println(
			Collections2.permutations(source).stream().map(
				(List<String> x) -> {
					return "<" + x.stream().collect(Collectors.joining(", ")) + ">";
				}
			).collect(Collectors.joining("; "))
		);
		System.out.println("Ordered Permutations:");
		System.out.println(
			Collections2.orderedPermutations(source).stream().map(
				(List<String> x) -> {
					return "<" + x.stream().collect(Collectors.joining(", ")) + ">";
				}
			).collect(Collectors.joining("; "))
		);
	}
}
