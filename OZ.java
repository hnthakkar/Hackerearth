
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OZ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			char[] input = br.readLine().toCharArray();
			long ORVCount = 0l, ZRVCount = 0l, OLVCount = 0l, ZLVCount = 0l;
			int OCount = 0, ZCount = 0;

			for (int j = 0; j < input.length; j++) {
				if (input[j] == 'O') {
					ORVCount += (input.length - 1 - j);
					OLVCount += j;
					OCount += 1;
				} else {
					ZRVCount += (input.length - 1 - j);
					ZLVCount += j;
					ZCount += 1;
				}
			}

			long leftShift = 0l, rightShift = 0l;
			if (ZCount < OCount) {
				leftShift = ZLVCount - ZCount * (ZCount - 1) / 2;
				rightShift = ZRVCount - ZCount * (ZCount - 1) / 2;
			} else {
				leftShift = OLVCount - OCount * (OCount - 1) / 2;
				rightShift = ORVCount - OCount * (OCount - 1) / 2;
			}
			if (leftShift < rightShift)
				System.out.println(leftShift);
			else
				System.out.println(rightShift);
		}
	}

}
