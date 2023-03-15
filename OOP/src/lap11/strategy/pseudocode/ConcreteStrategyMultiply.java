package lap11.strategy.pseudocode;

import lap11.strategy.pseudocode.Strategy;
public class ConcreteStrategyMultiply implements Strategy {
    public int execute(int a, int b) {
        return a * b;
    }
}
