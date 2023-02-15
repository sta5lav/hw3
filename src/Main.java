public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    public static void task6 () {
        int banan = 80;
        int bananAll = banan * 5;
        int milk = 105;
        int milkAll = milk * 2;
        int iceCream = 100;
        int iceCreamAll = iceCream * 2;
        int eggs = 70;
        int eggsAll = eggs * 4;
        int result = bananAll + milkAll + iceCreamAll + eggsAll;
        float kg = (float) result / 1000;
        System.out.println(result + " грамм");
        System.out.println(kg + " килограмм");
    }
    public static void task7 () {
        int weight = 7;
        int weightGramm = weight * 1000;
        int minWeightPerDay = 250;
        int maxWeightPerDay = 500;
        int maxDay = weightGramm / minWeightPerDay;
        int minDay = weightGramm / maxWeightPerDay;
        int middleDay = (maxDay+minDay) / 2;
        System.out.println("Максимум понадобится " + maxDay + " дней");
        System.out.println("Минимум понадобится " + minDay + " дней");
        System.out.println("В среднем понадобится " + middleDay + " дней");
    }
    public static void task8 () {
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int newMasha = masha + (masha / 10);
        int newDenis = denis + (denis / 10);
        int newKristina = kristina + (kristina / 10);
        int diffYearsMasha = (newMasha * 12) - (masha * 12);
        int diffYearsDenis = (newDenis * 12) - (denis * 12);
        int diffYearsKristina = (newKristina * 12) - (kristina * 12);
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + diffYearsMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + diffYearsDenis + " рублей");
        System.out.println("кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + diffYearsKristina + " рублей");
    }
}
