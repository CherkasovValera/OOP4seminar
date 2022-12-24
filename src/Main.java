
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Первая Команда-----------");
        Comandor comandor1 = new Comandor("Vasya", 250, new LongBow(), new RingShield());
        Team<Archer> archers = new Team<>(comandor1);
        System.out.println(comandor1);
        archers.addWarrior(new Archer("Koля", 150, new LongBow(), new RingShield()));
        archers.addWarrior(new Archer("Петя", 100, new LongBow(), new RingShield()));
        archers.forEach(item -> System.out.println(item));
        System.out.println("Суммарный урон команды равен: " + archers.getAllDamege()
                + " Cуммарное здоровье:" + archers.getAllHealtpoint() + " Максимальная зона поражения: "
                + archers.getMaxRadius());
        System.out.println("-----------Вторая Команда-----------");
        Comandor comandor2 = new Comandor("Игорь", 350, new LongBow(), new RingShield());
        Team<Barbarian> axes = new Team<>(comandor2);
        System.out.println(comandor2);
        axes.addWarrior(new Barbarian("Игорь", 200, new Sekira(), new LeatherShield()));
        for (Barbarian i : axes) {
            System.out.println(i);
        }
        System.out.println("Суммарный урон команды равен: " + axes.getAllDamege()
                + " Cуммарное здоровье:" + axes.getAllHealtpoint() + " Максимальная зона поражения: "
                + axes.getMaxRadius());
        System.out.println("-----------Третья Команда-----------");
        Comandor comandor3 = new Comandor("Саня", 500, new LongBow(), new RingShield());
        Team<Warrior> banda = new Team<>(comandor3);
        System.out.println(comandor3);
        banda.addWarrior(new Barbarian("Женя", 120, new Sekira(), new LeatherShield()));
        banda.addWarrior(new Archer("Юра", 190, new LongBow(), new RingShield()));
        for (Warrior i : banda) {
            System.out.println(i);
        }
        System.out.println("Суммарный урон команды равен: " + banda.getAllDamege()
                + " Cуммарное здоровье:" + banda.getAllHealtpoint() + " Максимальная зона поражения: "
                + banda.getMaxRadius());
    }
}