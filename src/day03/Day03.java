package day03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Day03 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(".\\src\\day03\\Input")));
		System.out.println(taskA(lines));
		System.out.println(taskB(lines));
	}

	public static int taskA(ArrayList<String> input) {
		int sum = 0;
		for (int i = 0; i < input.size(); i++) {
			int mid = input.get(i).length() / 2;
			String[] splitted = { input.get(i).substring(0, mid), input.get(i).substring(mid) };
			for (char s : splitted[0].toCharArray()) {
				if (splitted[1].indexOf(s) != (-1)) {
					sum += Character.isUpperCase(s) ? s - 'A' + 27 : s - 'a' + 1;
					break;
				}
			}
		}
		return sum;
	}

	public static int taskB(ArrayList<String> input) {
		int sum = 0;
		for (int i = 0; i < input.size(); i += 3) {
			for (char s : input.get(i).toCharArray()) {
				if (input.get(i + 1).indexOf(s) != -1 && input.get(i + 2).indexOf(s) != -1) {
					sum += Character.isUpperCase(s) ? s - 'A' + 27 : s - 'a' + 1;
					break;
				}
			}
		}
		return sum;
	}
}
