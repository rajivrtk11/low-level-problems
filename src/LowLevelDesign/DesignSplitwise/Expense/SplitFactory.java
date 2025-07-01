package DesignSplitwise.Expense;

import DesignSplitwise.Expense.Split.EqualExpenseSplit;
import DesignSplitwise.Expense.Split.ExpenseSplit;
import DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
