public class Main {
    public static void main(String[] args) {
        TransportFactory busFactory = new BusFactory();
        Bus bus = (Bus) busFactory.createTransport();
        bus.setPaymentMethod("Cash");
        bus.setRoute("A to B");
        System.out.println("Bus capacidade: " + bus.getCapacity());
        System.out.println("Bus metodo de pagamento: " + bus.getPaymentMethod());
        System.out.println("Bus rota: " + bus.getRoute());

        TransportFactory subwayFactory = new SubwayFactory();
        Subway subway = (Subway) subwayFactory.createTransport();
        subway.setAverageSpeed(40);
        subway.setLine("Red Line");
        System.out.println("Subway capacidade: " + subway.getCapacity());
        System.out.println("Subway velocidade: " + subway.getAverageSpeed());
        System.out.println("Subway linha: " + subway.getLine());
    }
}