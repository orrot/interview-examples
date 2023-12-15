package solid.principles;

import lombok.Data;

@Data
public abstract class Shape {

    public enum Type {

        CIRCLE, TRIANGLE, SQUARE
    }

    private Type type;
}

