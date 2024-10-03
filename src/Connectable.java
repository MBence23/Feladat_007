public interface Connectable {
    public static void main(String[] args) {
        Network nk = new Network();

        // Kapcsolódás a hálózathoz
        nk.connectToNetwork("Otthoni Wi-Fi");
        
        // Kapcsolat megszakítása
        nk.disconnectFromNetwork();
    }
}
