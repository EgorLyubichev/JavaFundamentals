public class ArraysCreate {
    public static void main(String[] args) {
        int[] array;
        array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;
        }
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
