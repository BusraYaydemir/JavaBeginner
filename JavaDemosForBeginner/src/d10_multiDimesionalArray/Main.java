package d10_multiDimesionalArray;

public class Main {

	public static void main(String[] args) {
		
		// Example: Calculate Student Average Grade
		
		// [studentNumber] [midterm] [final]
		
		double[][][] studentgrades = {
				{{1}, {20,50}},
				{{2}, {70, 80}}
		};
		
		double firstAverage = (studentgrades[0][1][0]*40/100) + (studentgrades[0][1][1]*60/100);
		
		double secondAverage = (studentgrades[1][1][0]*40/100) + (studentgrades[1][1][1]*60/100);
		
		System.out.println("Average Grade of First Student: " + firstAverage);
		System.out.println("Average Grade of Second Student: " + secondAverage);
	}

}
