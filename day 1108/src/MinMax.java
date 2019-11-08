
interface IMaxMin {
	double max(double arr[]);

	double min(double arr[]);
}

abstract class Min implements IMaxMin {

	public static double minn(double arr[]) {

		double mini = arr[0];

		for (double num : arr) {
			if (mini > num) {
				mini = num;
			}
		}
		return mini;
	}
}

abstract class Max implements IMaxMin {

	public static double maxx(double arr[]) {

		double maxi = arr[0];

		for (double num : arr) {
			if (maxi < num) {
				maxi = num;
			}
		}
		return maxi;
	}
}