import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Area {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		String inputs[] = null;

		double X = 0, Y = 0, Z = 0, a = 0, b = 0, c = 0, area = 0;
		for (int i = 0; i < T; i++) {
			inputs = br.readLine().split(" ");
			X = Double.parseDouble(inputs[0]);
			Y = Double.parseDouble(inputs[1]);
			Z = Double.parseDouble(inputs[2]);

			if (X > Y) {
				a = (X - Y + Z) / 2;
				b = X - a;
				c = Y - b;
			} else {
				c = (Y - X + Z) / 2;
				b = Y - c;
				a = X - b;
			}

			area = 2 * (a * b + b * c + c * a);

			System.out.printf("%.2f",area);
			System.out.printf("\n");
		}
	}

}
