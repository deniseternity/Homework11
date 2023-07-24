import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printCardDeliveryDays(95);
        printCardDeliveryDays(900);
    }

    private static void task1And2() {
         System.out.println("Задача 1 и 2");

    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
}

    private static void task3() {
        String fullName = "Иванов Семен Семёнович";
        System.out.println("Данные ФИО сотрудника - " + fullName.replace('ё', 'е'));
    }

    private static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void defineAppVersion(int mobileOS, int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        String mobileOsName;

        switch (mobileOS) {
            case 0:
                mobileOsName = "iOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "Неизвестная OC";
        }

        if (mobileYear != currentYear) {
            System.out.println("Для OC " + mobileOsName + " необходимо установить Lite-версию приложения");
        } else {
            System.out.println("Для OC " + mobileOsName + " необходимо установить обычную версию приложения");
        }
    }

    private static String defineOsName(int mobileOS) {
        String mobileOsName;

        switch (mobileOS) {
            case 0:
                mobileOsName = "iOS";
                break;
            case 1:
                mobileOsName = "Android";
                break;
            default:
                mobileOsName = "неизвестная OC";
        }

        return mobileOsName;
    }

    private static int calcCardDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    private static void printCardDeliveryDays(int distance) {
        int days = calcCardDeliveryDays(distance);

        if (days >0) {
            System.out.println("Потребуется дней:" + days);
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
}



