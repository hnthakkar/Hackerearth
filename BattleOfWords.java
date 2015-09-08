import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class TestClass2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {

			char[] alice = br.readLine().toCharArray();
			HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
			for (int j = 0; j < alice.length; j++) {
				if (charCount.containsKey(alice[j])) {
					charCount.put(alice[j], charCount.get(alice[j]) + 1);
				} else {
					charCount.put(alice[j], 1);
				}
			}

			char[] bob = br.readLine().toCharArray();
			boolean moreChar = false;
			for (int j = 0; j < bob.length; j++) {
				if (charCount.containsKey(bob[j])) {
					if (charCount.get(bob[j]) == 1)
						charCount.remove(bob[j]);
					else
						charCount.put(bob[j], charCount.get(bob[j]) - 1);
				} else {
					moreChar = true;
				}
			}
			if (moreChar) {
				if (charCount.size() == 0)
					System.out.println("You lose some.");
				else {
					System.out.println("You draw some.");
				}
			} else {
				if (charCount.size() == 0)
					System.out.println("You draw some.");
				else {
					System.out.println("You win some.");
				}
			}

		}

	}

}
