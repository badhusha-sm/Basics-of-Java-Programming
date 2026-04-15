
public class WrapperExample {
    public static void main(String[] args) {
        // Character Wrapper
        char charPrimitive = 'A';
        Character charObject = Character.valueOf(charPrimitive); // Boxing
        System.out.println("Character object: " + charObject);
        System.out.println("Is it a digit? " + Character.isDigit(charObject));
        System.out.println("Lowercase: " + Character.toLowerCase(charObject));

        // Boolean Wrapper
        boolean boolPrimitive = true;
        Boolean boolObject = Boolean.valueOf(boolPrimitive); // Boxing
        System.out.println("\nBoolean object: " + boolObject);
        System.out.println("Boolean from string 'true': " + Boolean.valueOf("true"));
        System.out.println("Boolean from string 'false': " + Boolean.valueOf("false"));

        // Numeric Type Wrappers - Integer, Double
        int intPrimitive = 10;
        Integer intObject = Integer.valueOf(intPrimitive); // Boxing
        System.out.println("\nInteger object: " + intObject);
        System.out.println("Parsed integer from string '100': " + Integer.parseInt("100"));
        System.out.println("Max of 10 and 20: " + Integer.max(10, 20));

        double doublePrimitive = 15.5;
        Double doubleObject = Double.valueOf(doublePrimitive); // Boxing
        System.out.println("\nDouble object: " + doubleObject);
        System.out.println("Parsed double from string '3.14': " + Double.parseDouble("3.14"));
        System.out.println("Is double infinite? " + doubleObject.isInfinite());

        // Auto-boxing and unboxing
        Integer autoBoxed = intPrimitive; // Auto-boxing
        int unboxed = intObject; // Unboxing
        System.out.println("\nAuto-boxed Integer: " + autoBoxed);
        System.out.println("Unboxed int: " + unboxed);
    }
}
