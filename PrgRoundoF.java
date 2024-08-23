import java.util.*;
public class PrgRoundoF {

public static void main(String[] args) {



		

		int b,c;

		float a;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter the number:");

		a=sc.nextFloat();

		b=(int)a*1000;

		c=b%10;

		b=b/10;

		

		

		if(c>5) {

			c=c+1;

		}

		a=b/100.0f;

		System.out.println(a);

		

		

}


}
