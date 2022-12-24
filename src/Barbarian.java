public class Barbarian extends Warrior<Axe, Shield> {
    public Barbarian(String name, int heajtpoint, Axe weapon, Shield shield) {
        super(name, heajtpoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Варвар " + super.toString();
    }
}
