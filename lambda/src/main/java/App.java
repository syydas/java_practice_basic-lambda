import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        AddSymbol addSymbol = str -> System.out.println("*" + str + "*");
        addSymbol.printNewString("test");

        Consumer<String> consumer = str -> System.out.println("*" + str + "*");
        consumer.accept("test");

        Square square = num -> num * num;
        System.out.println(square.getSquare(2));

        Function<Integer, Integer> function = num -> num * num;
        System.out.println(function.apply(6));
    }
}
