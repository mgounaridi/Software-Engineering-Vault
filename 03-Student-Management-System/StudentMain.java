import java.util.ArrayList;
public class StudentMain {
    public static void main(String[] args) {
        
    ArrayList<Student> foitites=new ArrayList<>();
  
    
    foitites.add(new Student("Μαρία\t",74.6,"Πληροφορική\t",1));
  
    foitites.add(new Student("Ιουλία\t",81.2,"Φυσική\t\t",4));
  
    foitites.add(new Student("Ιωάννης\t",38,"Ηλεκτρολόγων Μηχανικών",5));
   
    foitites.add(new Student("Κωνσταντίνα",98.7,"Ψυχολογία\t",3));
  
    foitites.add(new Student("Γιώργος\t",40,"Διοίκηση Επιχειρήσεων",2));
   
    foitites.add(new Student("Δήμητρα\t",27,"Μαθηματικά\t",6));
    
    
    double athroisma=0; 
    double megistos=foitites.get(0).getVathmos(); 
    double elaxistos=foitites.get(0).getVathmos();
   
        System.out.println("\t\t\tΛΙΣΤΑ ΑΠΟΤΕΛΕΣΜΑΤΩΝ ΤΩΝ ΦΟΙΤΗΤΩΝ\n");
        System.out.println("Όνομα\t\t\t\tΒαθμός\t\t\tΕιδικότητα\t\t\t\tΈτος Σπουδών\t\t\tΚατάσταση\n");
   
    for (Student foititis : foitites) { 
        double vathmos = foititis.getVathmos();
      //max grade
        if (vathmos>megistos) {
            megistos=vathmos;
        }
       //min grade
        if (vathmos<elaxistos) {
            elaxistos=vathmos;
        }
       
        String katastasi;
        if (foititis.isPassed()) {
            katastasi="Πέρασε";
        } else {
            katastasi="Κόπηκε";
        } 
       
        athroisma+=vathmos;
       
        System.out.println(foititis.getOnoma()+"\t\t\t"+foititis.getVathmos()+"\t\t\t"+foititis.getIdikotita()+"\t\t\t\t"+foititis.getEtosSpoudon()+"\t\t\t"+katastasi+"\n");
       
    }
    //average
    double mesosOros=athroisma/foitites.size();
    
    System.out.println("\n\n\nΜέσος Όρος Βαθμολογίας:\t"+mesosOros);
    System.out.println("Μέγιστος Βαθμός:\t"+megistos);
    System.out.println("Ελάχιστος Βαθμός:\t"+elaxistos);
    
    }
    
}
