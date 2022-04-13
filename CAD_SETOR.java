package CADASTRAMENTO;
import java.util.Scanner;
public class CAD_SETOR {

	public static void main(String[] args) {	
	Scanner input = new Scanner (System.in);
	String descsetor;
	int codsetor;
	String confirme;
	boolean conf_me = false;
	System.out.print("Digite o Codigo do Setor..: "  );
	 codsetor   = input.nextInt();
	 System.out.println();
	 System.out.print("Digite o Nome do Setor....: ");
	 descsetor  = input.next();
	 System.out.println();
	 System.out.println();
	 System.out.print("___________________________________________ ");
	 System.out.println();
	 while (!conf_me) {
     
	 System.out.print("Salvar (S/N)....: ");
	 confirme  = input.next();
	  if (confirme.equalsIgnoreCase ("S")) {
		System.out.println("Estou aqui"); 
		conf_me = true;
	  }
	  
	}
	}
}
