public abstract class Warrior<T extends Weapon, A extends Armor> {
    private String name;
    private int healtpoint;
    private T weapon;
    private A armor;

    @Override
    public String toString() {
        return String.format("Имя: %s, Здоровье: %d, Вооружен: %s, Щит %s", name, healtpoint, weapon, armor);
    }

    public Warrior(String name, int healtpoint, T weapon, A armor) {
        this.name = name;
        this.healtpoint = healtpoint;
        this.weapon = weapon;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealtpoint() {
        return healtpoint;
    }

    public void setHealtpoint(int healtpoint) {
        this.healtpoint = healtpoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public A getArmor() {
        return armor;
    }

    public void setArmor(A armor) {
        this.armor = armor;
    }
}
