public abstract class GeekTech implements Printable {
    private String location;
    private String name;

    public GeekTech(String name, String location) {
        this.name=name;
        this.location=location;

    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }

    @Override
    public void print() {

    }
}
