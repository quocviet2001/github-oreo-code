package lap11.strategy.pseudocode;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int strategyId = random.nextInt(3);
        int a = random.nextInt(1, 100);
        int b = random.nextInt(1, 100);

        Context context = new Context();

        if (strategyId == 0) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (strategyId == 1) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (strategyId == 2) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        System.out.println(context.executeStrategy(a, b));
    }
}
