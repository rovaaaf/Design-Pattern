// Real Object

public class Service implements IService{
    public Service() {
        System.out.println("Initialisation du service");
    }

    @Override
    public void request() {
        System.out.println("Service: traitement de la requête par le vrai objet");
    }
}
