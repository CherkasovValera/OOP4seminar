public class RingShield extends Shield {

    @Override
    public int armoring() {
        return 20;
    }

    @Override
    public String toString() {

        return String.format("Круглый: Защита %d", armoring());
    }
}
