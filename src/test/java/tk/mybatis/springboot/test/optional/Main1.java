package tk.mybatis.springboot.test.optional;

public class Main1 {
    public static void main(String[] args) {
        // 繁琐的代码

        Outer
                outer
                =

                new

                        Outer
                        ();

        if

        (
                outer
                        !=

                        null

                        &&
                        outer
                                .
                                nested
                                !=

                                null

                        &&
                        outer
                                .
                                nested
                                .
                                inner
                                !=

                                null
        )

        {


            System
                    .
                            out
                    .
                            println
                                    (
                                            outer
                                                    .
                                                    nested
                                                    .
                                                    inner
                                                    .
                                                    foo
                                    );

        }
    }
}
