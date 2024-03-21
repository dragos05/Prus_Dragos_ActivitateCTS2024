package Prototip;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractPrototype{
    private String nume;
    private int varsta;
    private List<String> listaAccesorii;

    public Client(String nume, int varsta, List<String> accesorii) {
        this.nume = nume;
        if(varsta<14){
            throw new RuntimeException("Varsta prea mica");
        }
        this.varsta = varsta;
        if(accesorii.size()>=5) {
            throw new RuntimeException("Prea multe accesorii");
        }
        listaAccesorii =accesorii;
    }

    private Client() {

    }

    @Override
    public AbstractPrototype clone() {
        Client newClient=new Client();
        newClient.nume=this.nume;
        newClient.varsta=this.varsta;
        newClient.listaAccesorii=new ArrayList<>();
        this.listaAccesorii.forEach(accesoriu->{
            newClient.listaAccesorii.add(accesoriu);
        });

        return newClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", listaAccesorii=" + listaAccesorii +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public List<String> getListaAccesorii() {
        return listaAccesorii;
    }

    public void setListaAccesorii(List<String> listaAccesorii) {
        this.listaAccesorii = listaAccesorii;
    }
}
