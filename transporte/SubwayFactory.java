class SubwayFactory implements TransportFactory {
    @Override
    public Subway createTransport() {
        return new Subway();
    }
}