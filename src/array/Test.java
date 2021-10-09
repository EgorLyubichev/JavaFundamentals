package array;

public class Test {
    public static void main(String[] args) {
        CreateClass arrayNew = new CreateClass();
        int[] a = new int[]{1,3,5,7};
        arrayNew.changeArray(a, 6);
          for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
          }
    }
}
