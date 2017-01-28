

public enum Operation {
    ADD, SUB, MULT, DIV;

        int calculate(int x, int y) {
        switch (this) {
            case ADD:
                return x + y;
            case SUB:
                return x - y;
            case MULT:
                return x * y;
            case DIV:
                return x / y;
            default:
                throw new AssertionError("Invalid Operator" + this);
        }
    }
}