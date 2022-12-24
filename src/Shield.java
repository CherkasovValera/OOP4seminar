public abstract class Shield implements Armor {
    @Override
    public String toString() {
        return String.format("Степень защиты щита: %d Защищенность: %d", armoring());
    }
}
