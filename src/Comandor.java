public class Comandor extends Warrior<Weapon, Armor> {
    public Comandor(String name, int healtpoint, Weapon weapon, Shield armor) {
        super(name, healtpoint, weapon, armor);
    }

    @Override
    public String toString() {
        return "Командир " + super.toString();
    }
}
