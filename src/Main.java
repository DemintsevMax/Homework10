public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 ");
        String firstName = "Ivanov";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName+" "+middleName+" "+lastName ;{
            System.out.println("Ф. И. О. сотрудника — "+fullName);}

        System.out.println("Task 2 ");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета "+fullName.toUpperCase());

        System.out.println("Task 3 ");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName);

    }

}