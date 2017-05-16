import java.util.*;

public class Q2{
	public static void main(String argv[]){
		Scanner input = new Scanner(System.in);
		System.out.print("input number: ");
		int a = input.nextInt();
		int count =0;
		for(int i=1;i<=a;i++){
			if(i%3!=0 && i %5!=0)
				count++;
			else if(i%3==0 && i%5==0)
				count++;
		}
		System.out.println("output : "+count);
	}
}