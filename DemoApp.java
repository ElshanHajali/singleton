package singleton;

public class DemoApp {
    public static void main(String[] args) {
        SingletonImpl singleton1 = SingletonImpl.createSingleton("Singleton #1");
        System.out.println(singleton1);

        SingletonImpl singleton2 = SingletonImpl.createSingleton("Singleton #2");
        System.out.println(singleton2);

        System.out.println(singleton1);
    }
}
