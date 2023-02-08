import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  
	  int scelta=2;
	  do {
		  if(scelta==1) {
			  System.out.println("Inserisci il numero di caratteri nella password (La password deve almeno contenere 4 caratteri:");
			  int n_char = s.nextInt();
			  System.out.println(generatePassword(n_char));
		  }
		  System.out.println("Benvenuto a Z/Password Generator!");
		  System.out.println("(1) - Generatore Password");
		  System.out.println("(0) - Chiudi Programma");
		  System.out.println("Inserisci la tua scelta:");
		  scelta = s.nextInt();
	  }while(scelta!=0);
	  s.close();
   }

   private static char[] generatePassword(int n_char) {
      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      String specialCharacters = "!@#$";
      String numbers = "1234567890";
      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
      Random random = new Random();
      char[] password = new char[n_char];

      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      password[3] = numbers.charAt(random.nextInt(numbers.length()));
   
      for(int i = 4; i< n_char ; i++) {
         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
      }
      
      System.out.print("Generated Password - ");
      return password;
   }
}