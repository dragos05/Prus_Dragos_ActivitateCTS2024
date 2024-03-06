package ANOFM;

public class Manager {
    private String numeFirma;
    private String numeManager;
    private float salariu;

    protected Manager(String numeFirma, String numeManager, float salariu) {
        this.numeFirma = numeFirma;
        this.numeManager = numeManager;
        this.salariu = salariu;
    }

    public String getNumeFirma() {
        return numeFirma;
    }

    public void setNumeFirma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public String getNumeManager() {
        return numeManager;
    }

    public void setNumeManager(String numeManager) {
        this.numeManager = numeManager;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "numeFirma='" + numeFirma + '\'' +
                ", numeManager='" + numeManager + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
