package newproject;

public class Reverse {
	public static void main(String[] args) {
		String s = "Obsqura Technologies";
		String reverse = "           ";

		// Iterate through the string from last and add each character to variable
		// reversedStr
		for(int i = s.length()-1; i >= 0; i--){
		//for (int i =0 ; i >=s.length()-1 ; i++) {
			reverse = reverse + s.charAt(i);
			
		}

		System.out.println("Original string: " + s);
		// Displays the reverse of given string
		System.out.println("Reverse of given string: " + reverse);
	}
}
