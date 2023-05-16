public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1-2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО сотрудника " + lastName + " " + firstName + " " + middleName);

        System.out.println(" Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase ());
    }

    public static void task2() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println( "Данные ФИО сотрудника — " + fullName);
    }
}