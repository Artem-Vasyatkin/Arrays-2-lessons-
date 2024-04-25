public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] rack = new int[4];
        rack[0] = 12;
        rack[1] = 9;
        rack[2] = 11;
        rack[3] = 10;

        int[] rack2 = new int[4];
        rack2[0] = 12;
        rack2[1] = 9;
        rack2[2] = 11;
        rack2[3] = 10;

        boolean rackAreEqual = true;

        for (int i = 0; i < rack.length; i++) {
            if (rack[i] != rack2[i]) {
                rackAreEqual = false;
                break;
            }
        }
        if (rackAreEqual) {
            System.out.println("Стелажи одинаковые");
        } else {
            System.out.println("Стелажи разные");
        }

        System.out.println("Homework\n");
        System.out.println("Task1\n");

        int[] salary = new int[]{50_000, 70_000, 90_000, 100_000, 110_000};

        int  monthlyExpenses = 0;
        for (int j : salary) {
            monthlyExpenses += j;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", monthlyExpenses);

        System.out.println("Task2\n");
        int maximumWaste = salary[0];
        int minimumWaste = salary[0];

        for (int i : salary) {
            if (i > maximumWaste) {
                maximumWaste = i;
            }
        }
        System.out.printf("Минимальная сумма трат за неделю составила %s рублей.\n", minimumWaste);
        System.out.printf("Максимальная сумма трат за неделю составила %s рублей.\n", maximumWaste);

        System.out.println("Task3\n");

        int[] salaries = {50_000, 70_000, 90_000, 100_000, 110_000};

        int  sumSalary = 0;
        for (int i : salaries) {
            sumSalary += i;
        }
        double averageSalary = (double) sumSalary / salaries.length;
        System.out.printf("Средняя сумма трат за месяц " +
                "составила %s рублей\n", averageSalary);

        System.out.println("Task4\n");

        char[] NameError = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        boolean correctView = false;
        for (int i = NameError.length - 1; i >= 0; i--) {
            if (NameError[i] == ' ') {
                correctView = true;
                continue;
            }
            if (correctView) {
                System.out.print(NameError[i]);
            } else {
                System.out.print(NameError[i]);
            }
        }
    }
    }
