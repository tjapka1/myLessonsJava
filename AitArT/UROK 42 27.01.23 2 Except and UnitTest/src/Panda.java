import java.util.Objects;

public class Panda {
    private String name;
    private boolean baby;

    public Panda(String name, boolean baby) {
        this.name = name;
        this.baby = baby;
    }

    @Override
    public String toString() {
        return name+" " + baby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panda panda = (Panda) o;
        return baby == panda.baby && Objects.equals(name, panda.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, baby);
    }
}
