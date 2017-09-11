import java.util.Scanner;
public class dos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número entre 0 y 9.999");
		int num= sc.nextInt();
		int cifras=0;
		if (num==0) {cifras=1;}
		if(num<0 || num<=9999) {
			while(num!=0) {
				num=num/10;
				cifras++;
			}
		
		System.out.println(cifras);
		}
	}

}
