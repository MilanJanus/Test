public class Mensch {

    private String name;
    private String nachname;
    private double alter;

    public Mensch(String name, String nachname, double alter) {
        this.name = name;
        this.nachname = nachname;
        this.alter = alter;
    }

    // anderen Konstruktor der gleichen Klasse mit »this()« aufrufen
    public Mensch(String name) {
        this(name, "" , 0);
    }

    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachname;
    }

    public double getAlter() {
        return alter;
    }

    public boolean istAlt() {
        return (alter >= 40.0) ? true : false;
    }

    @Override
    public String toString() {
        return "Mensch{" +
                "name='" + name + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                '}';
    }
}
