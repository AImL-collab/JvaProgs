import java.util.*;
public class CheckChar {
		public static void main(String[] args) {

			// TODO Auto-generated method stub



			Scanner data = new Scanner(System.in);

			System.out.println("Enter a char");

			String str = data.next();

			char ch = str.charAt(0);

			int ascii=ch;

			

			if( ( (ch >=65) && (ch <=90)) || 

					( (ch >=97) && (ch <=122))

				) {

				System.out.println("It is Alphabet");

				System.out.println(ascii);

			}

			else {

				System.out.println("Not");

			}

		}



	}



