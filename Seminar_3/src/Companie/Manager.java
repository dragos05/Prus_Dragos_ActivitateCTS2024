package companie;

public class Manager {
    private String nume;
    private double salariu;
    private int nrSubordonati;
    private static Manager instanta=null;

    private Manager(String nume, double salariu, int nrSubordonati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrSubordonati = nrSubordonati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    public void setNrSubordonati(int nrSubordonati) {
        this.nrSubordonati = nrSubordonati;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrSubordonati=" + nrSubordonati +
                '}';
    }

    public synchronized static Manager getInstance(String name, double salariu, int nrSub){
        if(instanta==null){
            instanta=new Manager(name, salariu, nrSub);
        }
        return instanta;
    }

    public static Manager getInstance(){
        return getInstance("Nume", 1235544, 5);
    }

}
