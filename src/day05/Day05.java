package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day05 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(".\\src\\day05\\Input")));
		ArrayList<ArrayList<Integer>> storage = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			storage.add(null);
		}
		System.out.println();
	}

	public static int taskA(List<int[]> input) {
		int sum = 0;
		return sum;
	}

	public static int taskB(List<int[]> input) {
		int sum = 0;
		return sum;
	}

}
