package solid.principles;

public class ShapeCalculationsService {

    public double calculateArea(Shape shape) {

        switch (shape.getType()) {
            case CIRCLE:
                // some circle code
                // return
            case SQUARE:
                // some square code
                // return
            case TRIANGLE:
                // some triangle code
                // return
            default:
                return 0;
        }
    }

    // calculate perimeter
}

// What SOLID principles are violated here: one by one and how to solve the code so the principle is OK

