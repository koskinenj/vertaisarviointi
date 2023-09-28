import java.util.Scanner;
public class Login {

	public static void main(String[] args) {

	
	  // Alustus käyttäjänsyötteelle	
		
		Scanner in = new Scanner(System.in);				
				
		
	  // Kysytään käyttäjältä tiedot, jos joku kentistä jää tyhjäksi, ilmoittaa ohjelma virheestä	
		
									
			System.out.println("Syötä etunimi:");
			String etunimi = in.nextLine();
			
			System.out.println("Syötä sukunimi:");
			String sukunimi = in.nextLine();
				
			System.out.println("Syötä verkkotunnus:");
			String verkkotunnus = in.nextLine();
		
	  // Suljetaan skanneri kun sitä ei enää tarvita
			
			in.close();
			
			if(etunimi.isEmpty() || sukunimi.isEmpty() || verkkotunnus.isEmpty())
			{
				System.out.println("Virhe! Jokin tiedoista puuttui.");
			}								
			else
			{
				GenerateEmail(etunimi, sukunimi, verkkotunnus);
				GenerateUsername(etunimi, sukunimi);
			}
    
			
}      // maini päättyy

	 
	   // luodaan käyttäjälle sähköposti antamien tietojen mukaan
	   // vaikka käyttäjä olisi syöttänyt isoja kirjaimia, muuttaa ohjelma sähköpostiin ne pieniksi kirjaimiksi
	
	    public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus){
		
		System.out.println("\nSähköpostisi: \n" + etunimi.toLowerCase() + "." + sukunimi.toLowerCase() + "@" + verkkotunnus.toLowerCase() + "\n");
		
	  
}
	
	
	   // luodaan käyttäjälle käyttäjätunnus antamien tietojen mukaan
	   // vaikka käyttäjä olisi syöttänyt isoja kirjaimia, muuttaa ohjelma käyttäjätunnukseen ne pieniksi kirjaimiksi
	
	    public static void GenerateUsername(String etunimi, String sukunimi){
	

		System.out.print("Käyttäjätunnuksesi: \n" + etunimi.toLowerCase().substring(0 , 4));
		System.out.print(sukunimi.toLowerCase().substring(sukunimi.length() - 4));		
		
	}
}
