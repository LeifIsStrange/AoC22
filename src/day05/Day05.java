package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day05 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(".\\src\\day05\\Input")));
		ArrayList<ArrayList<Character>> storage = new ArrayList<ArrayList<Character>>();
		List<int[]> orders = lines.subList(10, lines.size()).stream()
				.map(a -> new int[] { Integer.valueOf(a.substring(a.indexOf("move ") + 5, a.indexOf(" from"))),
						Integer.valueOf(a.substring(a.indexOf("from ") + 5, a.indexOf(" to"))),
						Integer.valueOf(a.substring(a.indexOf("to ") + 3)) })
				.collect(Collectors.toList());
		for (int i = 0; i < 9; i++) {
			ArrayList<Character> temp = new ArrayList<>();
			for (int j = 0; j < 8; j++) {
				char c = lines.get(j).charAt(1 + i * 4);
				if (c != ' ')
					temp.add(c);
			}
			storage.add(temp);
		}
		for (int i = 0; i < storage.size(); i++) {
			System.out.println(storage.get(i));
		}
		System.out.println();
		System.out.println(taskA(storage, orders));
	}

	public static String taskA(ArrayList<ArrayList<Character>> input, List<int[]> orders) {
		for (int i = 0; i < orders.size(); i++) {
			for (int j = 0; j < orders.get(i)[0]; j++) {
				input.get(orders.get(i)[2]-1).add(input.get(orders.get(i)[1]-1).get(0));
				input.get(orders.get(i)[1]-1).remove(0);
			}
		}
		for (int i = 0; i < input.size(); i++) {
			System.out.println(input.get(i));
		}
		return input.stream().map(a -> a.get(a.size()-1)).toString();
	}

	public static int taskB(List<int[]> input) {
		int sum = 0;
		return sum;
	}

}
