package singleton;

public class SingletonImpl {
    private String name;
    private static int id = 0;
    private static SingletonImpl SINGLETON;

    static {
        id++;
    }

    private SingletonImpl(String name) {
        this.name = name;
    }

    public static SingletonImpl createSingleton(String name) {
        return new SingletonImpl(name);
    }

    @Override
    public String toString() {
        return "SingletonImpl{ " +
                "name='" + name + '\'' +
                ", id = " + id +
                " }";
    }
}
