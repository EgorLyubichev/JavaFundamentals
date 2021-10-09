import java.util.Arrays;

public class ArrayResizingAndCopying {
    public static void main(String[] args) {
// Изменение размера массива. В общем случае этого сделать невозможно.
        int[] array = new int[5];
// Как изменить размер массива? Переобъявить ссылку:
        array = new int[8];
// Единственный способ изменить размер массива.

        //Если необходимо скопировать или вставить элементы одного массива в другой, то:
        int[] massive = {11, 12, 13, 14};
        int[] hold = {21, 22, 23, 24, 25, 26};
        System.arraycopy(massive, 0, hold, 0, 4);
        //Указываем: 1 - имя массива, кот. копируем; 2 - с какого элемента начинать копировать; 3 - в какой массив;
        // 4 - с какой позиции; 5 - количество элементов.
//        for (int i = 0; i < hold.length; i++) {
//            System.out.println(hold[i]);
//        }
        System.out.println(Arrays.toString(hold));
    }
}
