public class Foreach {
    public static void main(String[] args) {
        StringBuilder[] stringBuilder = new StringBuilder[3];
        stringBuilder[0] = new StringBuilder("First");
        stringBuilder[1] = new StringBuilder("Second");
        stringBuilder[2] = new StringBuilder("Third");
        for (StringBuilder elem: stringBuilder) {
            elem.append(12); //при помощи .append мы можем присоединить к элементу массиву что-то
            System.out.println(elem);
        }
    }
}

