package Main;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		
		int TD;
		int Yards;
		int INT;
		int comp;
		int ATT;
		float a;
		float b;
		float c;
		float d;
		float QBRating;
		
		System.out.print("Enter your touchdowns:");
		TD = user_input.nextInt();
		System.out.println("");
		
		System.out.print("Enter your total yards:");
		Yards = user_input.nextInt();
		System.out.println("");
		
		System.out.print("Enter your Interceptions:");
		INT = user_input.nextInt();
		System.out.println("");
		
		System.out.print("Enter your completions:");
		comp = user_input.nextInt();
		System.out.println("");
		
		System.out.print("Enter your number of passes attempted:");
		ATT = user_input.nextInt();
		System.out.println("");
		
		a=(float) ((comp/ATT - 0.3) * 5);
		b=(float) ((Yards/ATT - 3) * 0.25);
		c=(float) ((TD/ATT) * 20);
		d=(float) (2.375 - (INT/ATT * 25));
		QBRating=((a+b+c+d)/6)*100;
		
		System.out.println("Your QB rating is"+QBRating);
		
		
				

	}

}
