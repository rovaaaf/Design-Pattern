public class Client {
    public static void main(String[] args) {
        IService service = new ProxyService(); // le client n'intéragit qu'avec le proxy
        service.request(); // la requête est initialisée par le proxy
        service.request(); // la requête est préalablement initialisée
    }
}
