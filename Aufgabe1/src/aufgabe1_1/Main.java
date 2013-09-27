package aufgabe1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		Mittelwert mittel = new Mittelwert();
		String input;
		
		InputStreamReader rdr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(rdr);

	

		while (true) {
			System.out.println("Bitte machen Sie Ihre Eingabe: ");
			input = br.readLine();

			if (input.matches("\\d+([.]{1}\\d+){1}") || input.matches("\\d+")) {
				mittel.add(Double.parseDouble(input));
			}

			if (input.equals("m")) {
				System.out.println(mittel.average());

			}

			if (input.equals("v")) {
				System.out.println(mittel.variance());
			}

			if (input.equals("q")) {
				System.out.println("Abbruch");
				break;
				
			}

		}

	}

}
