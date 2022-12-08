package day02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day02 {
	public static void main(String[] args) throws IOException {

		ArrayList<String> lines = new ArrayList<>(
				Files.readAllLines(Paths.get(".\\src\\day02\\Input")));
		List<Integer[]> converted = lines.stream().map(a -> new Integer[] {(a.charAt(0)-'A'+1),(a.charAt(2)-'X'+1)}).collect(Collectors.toList());
		System.out.println(duell(converted));
	}
	
	private static int duell(List<Integer[]> list) {
		return list.stream().map(a -> (a[0] == a[1]	? 3	: (a[0] == (a[1] + 1) % 3 + 1) ? 6 : 0) + a[1]).reduce(0, Integer::sum);
	}
	
	private
}
