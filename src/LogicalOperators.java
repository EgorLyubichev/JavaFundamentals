public class LogicalOperators {
    public static void main(String[] args) {
        /*
        && | and | 42 == 48 && 0 < 7 | false
        || | or  | 42 == 48 || 0 < 7 | true
        !  | not | !(42 == 48)       | true
         */

        int x = 1;
        int y = 1;
        boolean a = x == y; // true
        boolean b = x != y; // false
        System.out.println(x++ == y++ && x++ != y++); // false
        System.out.println("x = " + x + ", y = " + y); // x = 3, y = 3
        // Если первое выражение истина, то будет вычисляться второе выражение. => x = 3, y = 3.

        int c = 1;
        int d = 1;
        System.out.println(c++ != d++ && c++ == d++); // false
        System.out.println("c = " + c + ", d = " + d); // c = 2, d = 2
    // Т.к. первое выражение неверное, вычисления на этом останавливаются, т.к. дальнейшие вычисления не имеют смысла.

        int e = 1;
        int f = 1;
        System.out.println(e++ == f++ || e++ != f++); // true
        System.out.println("e = " + e + ", f = " + f); // e = 2, f = 2
        // Т.к. первое значение верное, второе не вычисляется.

        int g = 1;
        int h = 1;
        System.out.println(g++ != h++ && g++ == h++ || g++ == h++); // false
        System.out.println("g = " + g + ", h = " + h); // g = 3, h = 3
        // 1-е выражение считается, второе уже нет, засчет '||' третье снова считается.

        int i = 1;
        int j = 1;
        System.out.println(i++ == j++ && i++ != j++ || i++ == j++); // false
        System.out.println("i = " + i + ", j = " + j); // i = 4, j = 4
        // Считаются все выражения.
    }
}
