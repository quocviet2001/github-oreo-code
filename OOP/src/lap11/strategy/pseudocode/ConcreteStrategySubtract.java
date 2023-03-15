package lap11.strategy.pseudocode;

import lap11.strategy.pseudocode.Strategy;

public class ConcreteStrategySubtract implements Strategy {

    public int execute(int a, int b) {
        return a - b;
    }
}
