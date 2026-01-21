package unit8;

class Calculator {
    public double sumAll(Number... numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }
}