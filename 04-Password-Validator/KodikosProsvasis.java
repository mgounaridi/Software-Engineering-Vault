import java.util.Scanner;
public class KodikosProsvasis {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
            
            int egkiros=0;//for valid passwords 
            int miEgkiros=0;//for non valid passwords
            //Message that checks the password
            System.out.println("Έλεγχος Κωδικού Πρόσβσης");
            //Message that asks for the password and END when they finish
            System.out.println("Δώστε τους Κωδικούς Πρόσβασης και END για τερματισμό");
            while (true) {
                //Message for Password:
                System.out.println("Κωδικός Πρόσβασης:");
                String kodikos= input.nextLine(); 
                
                if (kodikos.equals("END")) {
                    break;
                }
                String aities=""; // Reasons that password is not valid
                //Checks for 8 characters 
                if (kodikos.length()<8) {
                    aities +="Πρέπει να περιέχει τουλάχιστον  8 χαρακτήρες.\n";
                }
                //Checks for at least one Uppercase letter 
                if (kodikos.equals(kodikos.toLowerCase())){
                    aities += "Πρέπει να περιέχει τουλάχιστον ενα κεφαλαίο γράμμα.\n";
                }
                //Checks for at least one LowerCase
                if (kodikos.equals(kodikos.toUpperCase())) {
                    aities += "Πρέπει να περιέχει τουλάχιστον ενα πεζό γράμμα.\n";
                }
                //Checks for at least one number
                if (!kodikos.matches(".*[0-9].*")) {
                    aities+="Πρέπει να περιέχει τουλάχιστον έναν αριθμό.\n";
                }
                //Checks for at least a symbol(!@#$%)
                if (!kodikos.matches(".*[!@#$%].*")) {
                    aities+="Πρέπει να περιέχει τουλαχιστον ένα ειδικό σύμβολο(!@#$%).\n";
                }
                //Message for Valid or Not Valid and reasons 
                if (aities.equals("")){
                    System.out.println("Ο κωδικός ειναι Έγκυρος.\n");
                    egkiros++;
                }else {
                    System.out.println("Ο κωδικός ειναι Μη Έγκυρος!\n");
                    System.out.println(aities);
                    miEgkiros++;
                }
                
            }   
            System.out.println("Εγκυροι κωδικοί \t:"+egkiros); //Εμφανίζει ποσοι κωδικοί ειναι εγκυροι απο αυτους που εδωσε ο χρήστης
            System.out.println("Μη Έγκυροι κωδικοί:\t"+miEgkiros);// Αντιστοιχα για μη έγκυρους
           
        } 
        
    } 
