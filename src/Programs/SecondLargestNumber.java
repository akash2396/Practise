package Programs;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int temp;
		int a[] = { 41, 56, 23, 85, 77, 11, 33, 55, 66 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		// System.out.println(a[i]);
		System.out.println(a[1]);

	}

}
