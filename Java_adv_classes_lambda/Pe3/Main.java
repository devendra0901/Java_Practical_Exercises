import java.util.Scanner;

import myFirstProject.Sequence.ReverseSequenceSelector;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number from which you need reverse sequence : ");
		int n = input.nextInt();

		Sequence sequence = new Sequence(n);

		ReverseSequenceSelector obj = sequence.new ReverseSequenceSelector();

		System.out.print("Output : ");
		obj.rev();

		input.close();

	}

}

