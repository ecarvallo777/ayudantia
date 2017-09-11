import java.util.Scanner;
public class uno {
 Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int[3];
		for(int i = 0; i < 3; i++){
			System.out.print("Numero " + (i+1) + ": ");
			num[i] = sc.nextInt();
		}
 	
 		 System.out.println("1. Ordenar de mayor a menor");
 		System.out.println("2. Ordenar de menor a mayor");
 		int eleccion= sc.nextInt();
 		if (eleccion==1) {
 			
 			for(int i = 0; i < num.length; i++){
 				for(int j=i+1; j < num.length; j++){
 					if(num[i] < num[j]){
 						int aux = num[i];
 						num[i] = num[j];
 						num[j] = aux;
 					
 					}
 				}
 			}
 			for(int i=0; i<num.length; i++) {System.out.print(num[i]+", ");}
 		}
 		else if(eleccion==2) {
 			for(int i = 0; i < num.length; i++){
 				for(int j=i+1; j < num.length; j++){
 					if(num[i] > num[j]){
 						int aux = num[i];
 						num[i] = num[j];
 						num[j] = aux;
 					
 					}
 				}
 			}
 			for(int i=0; i<num.length; i++) {System.out.print(num[i]+", ");}

 		}
 }
 

}
