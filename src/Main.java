import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //Task 1
       int defoliate = 0;
        System.out.println("Значение переменной с типом integer равно " + defoliate);
       byte small = 1;
        System.out.println("Значение переменной с типом byte равно " + small);
       short tiny = 1;
        System.out.println("Значение переменной с типом short равно " + tiny);
       long big = 78;
        System.out.println("Значение переменной с типом long равно " + big);
       float sevenSigns = 1.1f;
        System.out.println("Значение переменной с типом float равно " + sevenSigns);
       double theBiggest = 5.78;
        System.out.println("Значение переменной с типом double равно " + theBiggest);

        //Task 2

       float firstNumber = 27.12f;
       long secondNumber = 987678965549l;
       String thirdNumber = "2,786";
       short fourthNumber = 569;
       short fifthNumber = -159;
       int sixthNumber = 27897;
       byte seventhNumber = 67;

       // Task 3

       byte liudmilaPavlovna = 23;
       byte annaSergeevna = 27;
       byte ecaterinaAndreevna = 30;
       short allStudents = (short) (liudmilaPavlovna + annaSergeevna + ecaterinaAndreevna);
       short allSheets = 480;
       short sheetForOneStudent = (short) (allSheets/allStudents);
       System.out.println("На каждого ученика рассчитано " + sheetForOneStudent + " листов бумаги");

       //Task 4

       short proizvodtwoMinute = 16;
       short proizvodTwentyMinute = (short) (proizvodtwoMinute * 10);
        System.out.println("За 20 минут машина произвела " + proizvodTwentyMinute + " штук бутылок");
       short proizvodTwentyFourHours = (short) (proizvodTwentyMinute * (24*3));
        System.out.println("За сутки машина произвела " + proizvodTwentyFourHours + " штук бутылок");
       int proizvodThreeDays = proizvodTwentyFourHours * 3;
        System.out.println("За 3 дня машина произвела " + proizvodThreeDays + " штук бутылок");
       int proizvodOneMonth = proizvodThreeDays * 30;
        System.out.println("За месяц машина произвела " + proizvodOneMonth + " штук бутылок");

        // Task 5

       byte whiteColor = 2;
       byte brownColor = 4;
       byte allColor = 120;
       byte allCabinets = (byte) (allColor/(whiteColor+brownColor));
       byte needBrown = (byte) (allCabinets * brownColor);
       byte needWhite = (byte) (allCabinets * whiteColor);
        System.out.println("В школе, где " + allCabinets + " классов, нужно " + needWhite + " банок белой краски и " + needBrown + " банок коричневой краски");

        // Task 6

       short oneBanan = 80;
       short milk = 105;
       short iceCream = 100;
       short eggs = 70;
       short needBananas = (short) (5 * oneBanan);
       short needMilk = (short) (2 * milk);
       short needIceCream = (short) (2 * iceCream);
       short needEggs = (short) (4 * eggs);
       short cocktailInG = (short) (needEggs + needBananas + needMilk + needIceCream);
       float cocktailInKg = cocktailInG/1000;
        System.out.println("Weight in gramms " + cocktailInG);
        System.out.println("Weight in kilo " + cocktailInKg);

        // Task 7

       short needWeight = 7000;
       short lowWay = 250;
       short hardWay = 500;
       short ifLowWay = (short) (needWeight/lowWay);
       short ifHardWay = (short) (needWeight/hardWay);
       float mediumWay =  (ifLowWay + ifHardWay)/2;
       System.out.println("Если сбрасывать по 250 г каждый день, то нам понадобится " + ifLowWay + " дней");
       System.out.println("Если сбрасывать по 500 г каждый день, то нам понадобится " + ifHardWay + " дней");
       System.out.println("В среднем на сброс 7 кг нам понадобится " + mediumWay + " дней");

       // Task 8

       int maria = 67760;
       int denis = 83690;
       int kristina = 76230;
        double mariaPlusZp = maria + (maria * 0.1);
        double denisPlusZp = denis + (denis * 0.1);
        double kristinaPlusZp = kristina + (kristina * 0.1);
        double mariaPlusYear = (maria * 0.1) * 12;
            System.out.println("Маша теперь получает " + mariaPlusZp + " рублей. Годовой доход вырос на " + mariaPlusYear + " рублей");
        double denisPlusYear = (denis * 0.1) * 12;
            System.out.println("Денис теперь получает " + denisPlusZp + " рублей. Годовой доход вырос на " + denisPlusYear + " рублей");
        double kristinaPlusYear = (kristina * 0.1) * 12;
            System.out.println("Кристина теперь получает " + kristinaPlusZp + " рублей. Годовой доход вырос на " + kristinaPlusYear + " рублей");
    }
}