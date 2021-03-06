package cc.oobootcamp.sample.length;

public class Length implements Comparable<Length> {
    private final int amount;
    private Unit unit;

    public Length(int amount, Unit unit) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
        this.unit = unit;
        this.amount = amount;
    }

    public int compareTo(Length target) {
        double sourceLength = unit.toMeter() * amount;
        double targetLength = target.unit.toMeter() * target.amount;
        if (sourceLength == targetLength) {
            return 0;
        }
        return amount < targetLength ? -1 : 1;
    }
}
