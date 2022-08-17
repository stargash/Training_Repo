public class Distance3Main {
	public static void main(String[] args) {

		int[] distanceArray = { 50, 100, 150 };
		int max = distanceArray[0];
		for (int d = 0; d < distanceArray.length; d++) {
			if (distanceArray[d] > max) {
				max = distanceArray[d];

			}

		}
		System.out.println(+max);
	}
}

