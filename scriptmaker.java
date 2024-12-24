package scriptmaker;

import java.util.Scanner;

public class scriptmaker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any numbers.");
		String s = scan.nextLine();
		System.out.println("Enter either 1 or 2 for the following: \n1: Superscript \n2: Subscript");
		String n = scan.nextLine();
		
		while (((n.equals("1")) == false) && (n.equals(("2")) == false)){
			System.out.println("This input is invalid. Please enter either 1 or 2 for the following: \\n1: Superscript \\n2: Subscript");
			n = scan.nextLine();
		}
		
		if(n.equals("1")) {
			superscript(s);
		}
		
		else if(n.equals("2")) {
			subscript(s);
		}
		
	}
	
	static void superscript (String s){
		char[] c = s.toCharArray();
		String output = "";
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '0') {
				output += "\u2070";
			}
			
			else if(c[i] == '1') {
				output += "\u00B9";
			}
			
			else if(c[i] == '2') {
				output += "\u00B2";
			}
			
			else if(c[i] == '3') {
				output += "\u00B3";
			}
			
			else if(c[i] == '4') {
				output += "\u2074";
			}
			
			else if(c[i] == '5') {
				output += "\u2075";
			}
			
			else if(c[i] == '6') {
				output += "\u2076";
			}
			
			else if(c[i] == '7') {
				output += "\u2077";
			}
			
			else if(c[i] == '8') {
				output += "\u2078";
			}
			
			else if(c[i] == '9') {
				output += "\u2079";
			}
			
			else if(c[i] == ' ') {
				output += " ";
			}
			
		}
		
		System.out.println(output);
	}
	
	static void subscript (String s){
		char[] c = s.toCharArray();
		String output = "";
		for(int i = 0; i < c.length; i++) {
			if(c[i] == '0') {
				output += "\u2080";
			}
			
			else if(c[i] == '1') {
				output += "\u2081";
			}
			
			else if(c[i] == '2') {
				output += "\u2082";
			}
			
			else if(c[i] == '3') {
				output += "\u2083";
			}
			
			else if(c[i] == '4') {
				output += "\u2084";
			}
			
			else if(c[i] == '5') {
				output += "\u2085";
			}
			
			else if(c[i] == '6') {
				output += "\u2086";
			}
			
			else if(c[i] == '7') {
				output += "\u2087";
			}
			
			else if(c[i] == '8') {
				output += "\u2088";
			}
			
			else if(c[i] == '9') {
				output += "\u2089";
			}
			
			else if(c[i] == ' ') {
				output += " ";
			}
		}
		
		System.out.println(output);
	}
}
