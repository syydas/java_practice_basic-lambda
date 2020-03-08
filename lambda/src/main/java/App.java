import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        AddSymbol addSymbol = str -> System.out.println("*" + str + "*");
        addSymbol.printNewString("test");

        Consumer<String> consumer = str -> System.out.println("*" + str + "*");
        consumer.accept("test");
    }
}
