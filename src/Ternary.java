public class Ternary {
    public static void main(String[] args) {
        int purchasesNumber = 5;
        int discount = 10;
        int purchasesLimit = 3;
        int bonus;

//        if (purchasesNumber > purchasesLimit){
//            bonus = discount;
//        } else {bonus = 0;}

    // Вышенаписанный if можно заменить одной строчкой ниже.

        bonus = purchasesNumber > purchasesLimit ? discount : 0;

    // Тут дословно написано следующее:
    // ? указывает на то, что если стоящее перед ним выражение true, то bonus = discount.
    // : заменяет в данном случае else; т.е. иначе bonus = 0

        System.out.println(bonus);
    }
}
