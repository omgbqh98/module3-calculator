public class Calculator {
    static float calculator(float first,float second,char operator) {
        switch (operator) {
            case '+':
                return first + second;
            case '-':
                return first - second;
            case '*':
                return first * second;
            case '/':
                if (second != 0) {
                    return first / second;
                } else {
                    throw new RuntimeException("ko chia dc cho 0");

                }
            default:
                throw new RuntimeException("ko hop le");
        }

    }
}
