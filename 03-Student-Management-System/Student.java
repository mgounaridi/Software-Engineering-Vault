package LisisThematon;

/**
 * Λύση τέταρτου θέματος πρώτο μέρος
 *  Δημιουργία κλάσης Student
 * @author MariaIouliaGounaridi
 */
public class Student {
    //Η κλάση με όνομα Student, που θα δημιουργήσω τον σχεδιασμό του αντικειμένου
    //Παρακάτω εισάγω τις ιδιότητες του φοιτητή
    private String onoma;// Μεταβλητή που αποθηκεύει το όνομα του φοιτητή
    private double vathmos;//Μεταβλητή που αποθηκεύει τον βαθμό του φοιτητή
    private String idikotita;//Μεταβλητή που αποθηκεύει την ειδικότητα του φοιτητή
    private int etosSpoudon;//Μεταβλητή που αποθηκεύει το έτος σπουδών του φοιτητή
    
    //Δημιουργώ τον καταστευαστή που θα καλείται κάθε φορά που δημιουργώ ένα αντικείμενο Student
    /**
     * 
     * @param onoma (Το όνομα του φοιτητή)
     * @param vathmos (Ο βαθμός του φοιτητή) 
     * @param idikotita (Η ειδικότητά του φοιτητή)
     * @param etosSpoudon (Το έτος σπουδών του φοιτητή)
     */
public Student(String onoma,double vathmos,String idikotita,int etosSpoudon) {
    //Χρησιμοποιώ το this ωστε να ξεχωρίσω τις ιδιότητες της κλάσης απο τις παραμέτρους
    this.onoma=onoma;//Ώστε να αποθηκεύει το όνομα του φοιτητή
    this.vathmos=vathmos;//Ώστε να αποθηκεύει τον βαθμό του φοιτητή 
    this.idikotita=idikotita;//Ώστε να αποθηκεύει την ειδικότητα του φοιτητή
    this.etosSpoudon=etosSpoudon;//Ώστε να αποθηκεύει το έτος σπουδών του φοιτητή
    
}

//Δημιουργώ Setters και Getters, ώστε να μπορω να εισάγω και να διαβάζω τις μεταβλητές στην main
   
    /**
     * @return όνομα
     * Αυτή η μέθοδος επιστρέφει το όνομα του φοιτητή
     */
    public String getOnoma() {
        return onoma;
    }
    /**
     * @param onoma 
     * Αυτή η μέθοδος επιτρέπει να ορίσουμε το όνομα του φοιτητή στη main
     */
    public void setOnoma(String onoma) {
        this.onoma=onoma;
    }
    /**
     * @return βαθμός
     * Αυτή η μέθοδος επιστρέφει τον βαθμό του φοιτητή 
     */
    public double getVathmos() {
        return vathmos;
    }
    /**
     * @param vathmos 
     * Αυτή η μέθοδος μας επιτρέπει να ορίσουμε τον βαθμό του φοιτητή στη main
     */
    public void setVathmos(double vathmos) {
        this.vathmos=vathmos;
    }
    /**
     * @return ειδικότητα
     * Αυτή η μέθοδος επιστρέφει την ειδικότητα του φοιτητή
     */
    public String getIdikotita() {
        return idikotita;
    }
    /**
     * @param idikotita 
     * Αυτή η μέθοδος μας επιτρέπει να ορίσουμε την ειδικότητα του φοιτητή στη main 
     */
    public void setIdikotita(String idikotita) {
        this.idikotita=idikotita;
    }
    /**
     * @return έτος σπουδών
     * Αυτή η μέθοδος επιστρέφει το έτος σπουδών
     */
    public int getEtosSpoudon() {
        return etosSpoudon;
    }
    /**
     * @param etosSpoudon 
     * Αυτή η μέθοδος μας επιτρέπει να ορίσουμε το έτος των σπουδών του φοιτητή στη main
     */
    public void setEtosSpoudon(int etosSpoudon) {
        this.etosSpoudon=etosSpoudon;
    }
    
    /**
     * @return true πέρασe διαφορετικά, fasle αν κόπηκε
     * Αυτή η μέθοδος, ελέγχει αν ο φοιτητής έχει περάσει το μάθημα 
     * Αν ο βαθμός ειναι μεγαλύτερος ή ίσος του 40 έχει περάσει 
     */
    public boolean isPassed() {
        if (this.vathmos>=40) {
            return true;
        } else {
            return false;
        }
    }
   
} //Τέλος Κλάσης
