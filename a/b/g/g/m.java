package a.b.g.g;

public class m {
    public static <T> T a(T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T reference, Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static int a(int value) {
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException();
    }
}
