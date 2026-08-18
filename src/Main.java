//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int firstFriday = 6;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }

        int coveredDistance = 42195;
        int traveledDistance = 0;
        do {
            System.out.println("Держитесь! Осталось " + coveredDistance + " метров");
            coveredDistance = coveredDistance - 500;
            traveledDistance = traveledDistance + 500;
        }
        while (coveredDistance > 0);

        int totalDistance = 42195;
        for (int i = 0; i < 42195; i += 500) {
            System.out.println("Держитесь! Осталось " + (totalDistance - i) + " метров");
        }

        int dayCurrent = 0;
        int money = 600;
        while (money >= 100) {
            dayCurrent++;
            if (dayCurrent % 5 == 0) {
                continue;
            } else {
                money = money - 100;
            }
        }
        System.out.println("Количество дней для парковки " + dayCurrent);


        int budget = 600;
        int i = 0;
        for (; budget >= 100; i++) {
            if (i % 5 == 0) {
                continue;
            }
            budget = budget - 100;
            if (budget == 0) {
                System.out.println("Количество дней для парковки " + i);
            }

        }
        int mouth = 0;
        int total = 0;
        while (true) {
            mouth++;
            if (mouth % 6 == 0) {
                total = total + total / 700;
            }
            total += 15000;
            if (total >= 12_000_000) {
                break;
            }

        }
        System.out.println("Пользователю понадобилось " + mouth + " месяца ");


        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев! Зарядка прервана на 2 минуты.");
                if (overheats == 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
            if (charge > 100) {
                charge = 100;
            }
            System.out.println("Текущий заряд: " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут.");

    }
}