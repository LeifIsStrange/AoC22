package day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Day01 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<>(
				Files.readAllLines(Paths.get(".\\src\\day01\\Input")));
		System.out.println(combineCalories(lines));
		ArrayList<Integer> top = topThreeCalories(lines);
		int topThree = 0;
		for (int i = top.size() - 1; i >= top.size() - 3; i--) {
			topThree += top.get(i);
		}
		System.out.println(topThree);
	}

	static int combineCalories(ArrayList<String> list) {
		int maxC = 0;
		int currentC = 0;
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals("")) {
				currentC += Integer.valueOf(list.get(i));
				if (currentC > maxC)
					maxC = currentC;
			} else
				currentC = 0;
		}
		return maxC;
	}

	static ArrayList<Integer> topThreeCalories(ArrayList<String> list) {
		ArrayList<Integer> combined = new ArrayList<>();
		int currentC = 0;
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals("")) {
				currentC += Integer.valueOf(list.get(i));
			} else {
				combined.add(currentC);
				currentC = 0;
			}
		}
		Collections.sort(combined);
		return combined;
	}
}
