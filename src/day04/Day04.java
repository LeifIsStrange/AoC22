package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day04 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(".\\src\\day04\\Input")));
		List<int[]> list = lines.stream().map(a -> a.split("[-,]")).map(a -> new int[] { Integer.valueOf(a[0]),
				Integer.valueOf(a[1]), Integer.valueOf(a[2]), Integer.valueOf(a[3]) }).collect(Collectors.toList());
		System.out.println(taskA(list));
		System.out.println(taskB(list));
	}

	public static int taskA(List<int[]> input) {
		int sum = 0;
		for (int i = 0; i < input.size(); i++) {
			int[] c = input.get(i);
			if ((c[3] >= c[1] && c[2] <= c[0]) || (c[0] <= c[2] && c[1] >= c[3]))
				sum++;
		}
		return sum;
	}

	public static int taskB(List<int[]> input) {
		int sum = 0;
		for (int i = 0; i < input.size(); i++) {
			int[] c = input.get(i);
			if ((c[0] <= c[2] && c[2] <= c[1]) || (c[2] <= c[0] && c[0] <= c[3]))
				sum++;
		}
		return sum;
	}
}
