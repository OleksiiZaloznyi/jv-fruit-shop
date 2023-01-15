package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.OperationStrategy;

public class ReturnOperationStrategyImpl implements OperationStrategy {
    @Override
    public int execute(int balance, int quantity) {
        return balance + quantity;
    }
}
