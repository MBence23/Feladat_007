public class Network implements Connectable {

    public void connectToNetwork(String networkName) {
        System.out.println("Sikeresen csatlakoztál a következő hálózathoz: " + networkName);
    }

    public void disconnectFromNetwork() {
        System.out.println("Hálózati kapcsolat megszakítva.");
    }

}
