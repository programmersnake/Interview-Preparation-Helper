package tasks1;

import java.io.Serializable;

public class ImmutableObject implements Serializable {
    private String name;
    private int integer;

    public ImmutableObject(String name, int integer) {
        this.name = name;
        this.integer = integer;
    }

    public String getName() {
        return name;
    }

    public int getInteger() {
        return integer;
    }

}
