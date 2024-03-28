class BusFactory implements TransportFactory {
    @Override
    public Bus createTransport() {
        return new Bus();
    }
}