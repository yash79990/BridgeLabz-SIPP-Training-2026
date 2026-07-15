import java.util.Scanner;
public class Distance{
public static void main(String[] args){

	Scanner sc=new Scanner(System.in);
	
	double  distance=sc.nextDouble();
	double  mile=sc.nextDouble();
	double  totaldistance=distance*mile;
	
	System.out.println(totaldistance);
	sc.close();
	
	}
}