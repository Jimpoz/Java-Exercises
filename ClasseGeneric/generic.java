package ClasseGeneric;

import java.util.*;

public class generic<T> {
    T a;

    private int b;
    private String s;

    generic(T a, int b, String s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    public T get_a() {
        return this.a;
    }

    void test_print_t() {
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        generic<String> test = new generic<String>("nome", 0, "wow");
        System.out.println(test.a);

    }
}
