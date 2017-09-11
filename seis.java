import java.util.Scanner;
public class seis {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saldo=0;
		int deposito=0;
		int transferencia=0;
		int retirar=0;
		int cuenta;
		boolean salir = false;
	       int opcion; 
	        
	       while(!salir){
	            
	           System.out.println("1. Consultar saldo");
	           System.out.println("2. Depositar dinero a mi cuenta");
	           System.out.println("3. Transferir dinero");
	           System.out.println("4. Retirar dinero");
	           System.out.println("5. Salir");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sc.nextInt();
	            
	           switch(opcion){
	               case 1:
	                   System.out.println("Tu saldo es: "+saldo);
	                   break;
	               case 2:
	                   System.out.println("Cuanto deseas depositar?");
	                   System.out.println(" $");

	                   deposito=sc.nextInt();
	                   saldo+=deposito;
	                    System.out.println("Depósito hecho correctamente por: "+deposito );
	                    break;
	                case 3:
	                   System.out.println("Ingrese monto a transferir: $");
	                   transferencia=sc.nextInt();
	                   if(transferencia<=saldo) {System.out.println("Ingrese cuenta a transferir (Sin puntos ni guión): ");
	                   			cuenta=sc.nextInt();
	                   			System.out.println("Transferencia realizada correctamente a "+cuenta+" de: $"+transferencia);
	                   			saldo-=transferencia;
	                   }
	                   else {System.out.println("Saldo insuficiente");}
	                   break;
	                case 4:
		               System.out.println("Ingrese monto a retirar");
		               retirar=sc.nextInt();
		               if (retirar<=saldo) {System.out.println("Monto retirado con éxito!");
		               saldo-=retirar;
		               }
		               else {System.out.println("Saldo insuficiente");}
		                   break;
	                case 5:
	                   salir=true;
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 5");
	           }
	            
	       }
	        
	    }
	     
	
	}




