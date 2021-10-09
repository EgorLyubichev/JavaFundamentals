public class ArraysCreate {
    public static void main(String[] args) {
        int[] array;
        array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        // далее пример массива случайных чисел:
        int[] massive = new int[5];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) Math.round(Math.random()*10);
            System.out.println(i + " | " + massive[i]);
        }
        massive[3] = 4;
        System.out.println(massive[0]+"|"+ massive[1]+"|"+ massive[2]+"|"+ massive[3]);
    }
    public String[] createStringArray(final int SIZE) {
        String[] strings = new String[SIZE];
        for (int i = 0; i < SIZE; i++) {
            strings[i] = String.valueOf(i);
            System.out.println(strings[i]);
        }
        return strings;
    }
}
