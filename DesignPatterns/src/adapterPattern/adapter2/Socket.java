package adapterPattern.adapter2;

public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
