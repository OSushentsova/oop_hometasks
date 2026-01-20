package unit8;

class Fraction extends Number {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        if (denum == 0) throw new IllegalArgumentException("Знаменатель не может быть 0");
        this.num = num;
        this.denum = denum;
    }

    // Реализация абстрактных методов Number
    @Override
    public int intValue() {
        return num / denum;
    }

    @Override
    public long longValue() {
        return (long) num / denum;
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }

    @Override
    public String toString() {
        return num + "/" + denum;
    }
}

