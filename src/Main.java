public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        int oneType = 1;
        byte twoType = 15;
        short threeType = 25;
        long fourtype = 35;
        float fiveType = 45.5f;
        double sixType = 55.4;
        System.out.println("Значение переменной" + " oneType" + " с типом" + " int" + " равно " + oneType);
        System.out.println("Значение переменной" + " twoType" + " с типом" + " byte" + " равно " + twoType);
        System.out.println("Значение переменной" + " threeType" + " с типом" + " short" + " равно " + threeType);
        System.out.println("Значение переменной" + " fourtype" + " с типом" + " long" + " равно " + fourtype);
        System.out.println("Значение переменной" + " fiveType" + " с типом" + " float" + " равно " + fiveType);
        System.out.println("Значение переменной" + " sixType" + " с типом" + " double" + " равно " + sixType);

    }

    public static void task2 () {
        float one = 27.12f;
        long two = 987678965549l;
        float three = 2.786f;
        short four = 569;
        short five = -159;
        int six = 27897;
        byte seven = 67;
    }
    public static void task3 () {
        int a = 23;
        int b = 27;
        int c = 30;
        int paper = 480;
        int result = paper / (a+b+c);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");
    }
    public static void task4 () {
        int botle = 16;
        int time = 2;
        int botlePerMinutes = botle / time;
        int forTwenty = botlePerMinutes * 20;
        int forDay = botlePerMinutes * 60 * 24;
        int forThreeDays = forDay * 3;
        int forMonth = forDay * 30;
        System.out.println("За " + "20 минут" + " машина произвела " + forTwenty + " бутылок");
        System.out.println("За " + "сутки" + " машина произвела " + forDay + " бутылок");
        System.out.println("За " + "3 дня" + " машина произвела " + forThreeDays + " бутылок");
        System.out.println("За " + "месяц" + " машина произвела " + forMonth + " бутылок");
    }
    public static void task5 () {
        int full = 120;
        int white = 2;
        int brown = 4;
        int perClass = white + brown;
        int classes = full / perClass;
        int whiteAll = white * classes;
        int brownAll = brown * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски");
    }
}