public class Main {
    public static void main(String[] args) {
        System.out.println(month(1));
    }
    public static String month (int x){
        String month = null;
            switch (x){
                case 1: month = "January";
                    break;
                case 2: month = "February";
                    break;
                case 3: month = "March";
                    break;
                default: throw new IllegalArgumentException("The month not found.");

            }
        return month;
    }
}
