import java.util.*;
public class SpyNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int num, sum=0, pro=1, lastdigit;
		System.out.print("Enter any number to check spy: ");
		num = sc.nextInt();
		int prenum=num;
			do {
				lastdigit=num%10;
				sum=sum+lastdigit;
				pro=pro*lastdigit;
				num=num/10;
				}
			while(num>0);
		
			if(pro==sum) {
				System.out.print(prenum +" is spy number.");
				}
			else {
				System.out.print(prenum +" is not spy number.");
			}
	}

}
