public class Archer extends Warrior<Bow, Shield> {
    public Archer(String name, int healtpoint, Bow bow, Shield shield) {
        super(name, healtpoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Лучник " + super.toString();
    }
}
