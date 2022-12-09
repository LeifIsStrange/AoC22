package day06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Day06 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(".\\src\\day06\\Input")));
		System.out.println(taskA(lines.get(0)));
		System.out.println(taskB(lines.get(0)));
	}

	private static int taskA(String input) {
		for (int i = 0; i < input.length() - 4; i++) {
			if (input.substring(i, i + 4).chars().distinct().count() == 4)
				return i + 14;
		}
		return -1;
	}

	private static int taskB(String input) {
		for (int i = 0; i < input.length() - 14; i++) {
			if (input.substring(i, i + 14).chars().distinct().count() == 14)
				return i + 14;
		}
		return -1;
	}
}
