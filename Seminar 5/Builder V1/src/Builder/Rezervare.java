package Builder;

public class Rezervare {
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areMuzica;
    private boolean areBautura;
    private String genMuzical;

    protected Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areMuzica, boolean areBautura, String genMuzical) {
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areMuzica = areMuzica;
        this.areBautura = areBautura;
        this.genMuzical=genMuzical;
    }

    protected Rezervare() {
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areMuzica = false;
        this.areBautura = false;
        this.genMuzical=null;
    }

    protected boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    protected boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    protected boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    protected boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }


    protected String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areMuzica=" + areMuzica +
                ", areBautura=" + areBautura +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}
