package tk.mybatis.springboot.test.optional;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional.of(new Outer()).map(Outer::getNested).map(Nested::getInner).map(Inner::
                                                getFoo).ifPresent(System.out::println);

    }
}
