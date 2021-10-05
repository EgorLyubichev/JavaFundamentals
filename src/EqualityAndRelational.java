class EqualityAndRelational {
    public static void main(String[] args) {
        /*
        == | equals                | 7 + 7 == 14 | true
        != | not equal             | 4 != 3.0    | true
        <  | less than             | 42 < 42     | false
        >  | greater than          | 7 > 3       | true
        <= | less than or equal    | 127 <= 42.0 | false
        >= | greater than or equal | 7.1 >= 7.1  | true
         */
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = null;
        System.out.println(object1 == object2); // result: false, т.к. сравниваются ссылки
        System.out.println(object3 == null); // result: true, т.к. присвоено значение null

        Object object4 = new Object();
        Object object5 = object4;
        // В этом случае две ссылки (object4 & object5) ссылаются на один объект
        System.out.println(object4 == object5); // result: true

        float result = 1 / 3.0f * 3;
        System.out.println(1.0 == result);
        System.out.println(1.00000001f == 1.00000002f); // Стоит не забывать при вычислениях про машинный '0'


    }
}
