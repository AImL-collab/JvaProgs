
public class PrgToAddCarry {

	public static void main(String[] args) {

		// TODO Auto-generated method stub



		int num=99345,p=1,r,res=0;
		

		while(num!=0) {

			r=num % 10;

			//System.out.println(r);

			if (r==3) r=r+9;

			System.out.println(res+"+"+r+"*"+p);

			res=res+r*p;

			System.out.println(res);

			num=num/10;

			//System.out.println(num);

			

			p= p *10;

			//System.out.println(p);

		}

		

		System.out.println("result"+res);

	}


}
