import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warrior> implements Iterable<T> {
    List<T> warriors = new ArrayList<>();
    private Comandor comandor;

    public Team(Comandor comandor) {
        this.comandor = comandor;
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void addWarrior(T newwarriors) {
        warriors.add(newwarriors);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamege() {
        int sumDamage = 0;
        for (T i : this) {
            sumDamage += i.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealtpoint() {
        int healt = 0;
        for (T i : this) {
            healt += i.getHealtpoint();
        }
        return healt;
    }

    public int getMaxRadius() {
        int maxRange = 0;
        for (T i : this) {
            Weapon weapon = i.getWeapon();
            if (weapon instanceof Bow) {
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()) {
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }
}
