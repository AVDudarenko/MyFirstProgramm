import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	int capacity = 9;
	ArrayList<Integer> arrayListOfNumbers = new ArrayList<>(capacity);
	List<Integer> listOfEvenNumbers = new ArrayList<>();
	List<Integer> listOfOddNumbers = new ArrayList<>();

	public static void main(String[] args) {

		Main main = new Main();
		main.addElementsInArray();
		main.sortArray();
		main.printListOfNumbers();
		main.comparisonSizeOfArray();

	}

	private void addElementsInArray() {
		for (int i = 0; i < capacity; i++) {
			arrayListOfNumbers.add(i);
		}
	}

	private void sortArray() {
		for (int i : arrayListOfNumbers) {
			if (i % 2 == 0) {
				listOfEvenNumbers.add(i);
			} else {
				listOfOddNumbers.add(i);
			}
		}
	}

	private void printListOfNumbers() {
		System.out.println("List of even numbers: ");
		for (int i : listOfEvenNumbers) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("List of odd numbers: ");
		for (int i : listOfOddNumbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private void comparisonSizeOfArray() {

		if (listOfEvenNumbers.size() > listOfOddNumbers.size()) {
			System.out.println("List of even numbers is bigger.");
		} else if (listOfEvenNumbers.size() < listOfOddNumbers.size()) {
			System.out.println("List of odd number is bigger");
		} else {
			System.out.println("Lists is equals");
		}

	}

}




