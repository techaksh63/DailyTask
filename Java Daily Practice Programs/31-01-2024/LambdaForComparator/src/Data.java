public class Data {
    private final String name;

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Data {" +
                "name='" + name + '\'' +
                '}';
    }
}
