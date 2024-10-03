public class ProxyService implements IService{
    private Service service; // instance de l'objet réel

    @Override 
    public void request() {
        if (service == null) {
            service = new Service();
        }
        service.request();
    }
}
