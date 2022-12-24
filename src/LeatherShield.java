public class LeatherShield extends Shield {

    @Override
    public int armoring() {
        return 10;
    }

    @Override
    public String toString() {

        return String.format("Кожанный: Защита %d", armoring());
    }
}
