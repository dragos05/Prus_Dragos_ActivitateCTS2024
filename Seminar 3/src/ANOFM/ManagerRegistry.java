package ANOFM;

import java.util.HashMap;
import java.util.Map;

public class ManagerRegistry {
    private Map<String, Manager> manageri;
    private static ManagerRegistry instanta=null;
    private ManagerRegistry(){
        manageri=new HashMap<>();
    }
    public static synchronized ManagerRegistry getInstance(){
        if(instanta==null) {
            instanta=new ManagerRegistry();
        }
        return instanta;
    }
    public void inregistreazaManager(String numeFirma, String numeManager, float salariu) {
        if(!manageri.containsKey(numeFirma)){
            manageri.put(numeFirma, new Manager(numeFirma, numeManager, salariu));
        }
        //manageri.IfAbsent(numeFirma, new Manager(numeFirma, numeManager, salariu));
    }

    public Manager getManager(String numeFirma) {
        return manageri.get(numeFirma);
    }
}
