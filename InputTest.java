package ksiazka;
import java.util.*;
/**
 * Ten program demonstruje pobieranie danych z konsoli
 * @author Micha�
 * @version 1.10 2019-02-10
 */
public class InputTest 
{
	public static void main(String[] args)
	{
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		
		Scanner in = new Scanner(System.in);
		
		//Pobieranie pierwszej porcji danych
		System.out.println("Jak si� nazywasz? ");
		String name =  in.nextLine();
		
		//Pobieranie drugiej porcji danych
		System.out.println("Ile masz lat? ");
		int age = in.nextInt();
		
		//Wydruk danych
		System.out.println("Witaj u�ytkowniku " + name + ". W przysz�ym roku b�dziesz"
				+ " mie� " + (age +1) + " lat.");
		in.close();
		
		
	}
}
