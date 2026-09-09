public class Student {
    
    private String onoma;
    private double vathmos;
    private String idikotita;
    private int etosSpoudon;
    
    /**
     * 
     * @param onoma (Name of Student)
     * @param vathmos (Grade of Student) 
     * @param idikotita (Major of Student)
     * @param etosSpoudon (Year of Studies)
     */
public Student(String onoma,double vathmos,String idikotita,int etosSpoudon) {
    
    this.onoma=onoma;
    this.vathmos=vathmos;
    this.idikotita=idikotita;
    this.etosSpoudon=etosSpoudon;
    
}
   
    /**
     * @return όνομα
     * Returns the name of the Student
     */
    public String getOnoma() {
        return onoma;
    }
    /**
     * @param onoma 
     */
    public void setOnoma(String onoma) {
        this.onoma=onoma;
    }
    /**
     * @return βαθμός
     * Returns the Grade of the Student
     */
    public double getVathmos() {
        return vathmos;
    }
    /**
     * @param vathmos 
     */
    public void setVathmos(double vathmos) {
        this.vathmos=vathmos;
    }
    /**
     * @return ειδικότητα
     * Returns the major of the student
     */
    public String getIdikotita() {
        return idikotita;
    }
    /**
     * @param idikotita 
     */
    public void setIdikotita(String idikotita) {
        this.idikotita=idikotita;
    }
    /**
     * @return έτος σπουδών
     * Returns the year of Studies
     */
    public int getEtosSpoudon() {
        return etosSpoudon;
    }
    /**
     * @param etosSpoudon 
     */
    public void setEtosSpoudon(int etosSpoudon) {
        this.etosSpoudon=etosSpoudon;
    }
    
    /**
     * @return true 
     * Checks if a student passed 
     * With grade greater than or equal to 40
     */
    public boolean isPassed() {
        if (this.vathmos>=40) {
            return true;
        } else {
            return false;
        }
    }
   
}
