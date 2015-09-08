/* IMPORTANT: class must not be public. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass1 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] urls = new String[100];
		for (int i = 0; i < N; i++) {
			urls[i] = br.readLine().toString();
		}

		for (int i = 0; i < urls.length; i++) {
			if (urls[i] == null)
				break;
			int count = 0;
			char[] urlArray = (urls[i]).toCharArray();
			for (int j = 4; j < urlArray.length - 4; j++) {
				char ch = urlArray[j];
				if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
						|| ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U')
					continue;
				count++;
			}
			System.out.println(count + 4 + "/" + urls[i].length());
		}
	}
}
