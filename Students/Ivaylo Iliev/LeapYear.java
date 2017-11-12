package HW_20171108;

	/**
	 * Simple program for checking of this if an year is leap or not.
	 */
public class LeapYear {

	public static void main(String[] args) {

		short year = 2015; //insert the checked year here

		boolean check1 = (year % 4) == 0;
		boolean check2 = (year % 100) == 0;
		boolean check3 = (year % 400) == 0;
		boolean result = ((!check2 && check1) || check3);
		
		//first variant of print
		System.out.println(result);
		
		//second variant of print
		if (result == true) {
			System.out.println("The year " + year + " is leap");
		}
		else {
			System.out.println("The year " + year + " is not leap");
		}
	}

}
