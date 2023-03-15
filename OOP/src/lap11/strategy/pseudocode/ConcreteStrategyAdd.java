package lap11.strategy.pseudocode;

import lap11.strategy.pseudocode.Strategy;
public class ConcreteStrategyAdd implements Strategy {

    public int execute(int a, int b) {
        return a + b;
    }
}
