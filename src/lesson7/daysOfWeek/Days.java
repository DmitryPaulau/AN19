package lesson7.daysOfWeek;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


    public static void dayOfWeek() {
        for (Days element : Days.values()) {
            switch (element) {
                case MONDAY -> System.out.println("Понедельник - рабочий день");
                case TUESDAY -> System.out.println("Вторник - Рабочий день");
                case WEDNESDAY -> System.out.println("Среда - Рабочий день");
                case THURSDAY -> System.out.println("Четверг - Рабочйи день");
                case FRIDAY -> System.out.println("Пятница - Предвыходной день");
                case SATURDAY -> System.out.println("Суббота -Выходной день");
                case SUNDAY -> System.out.println("Воскресенье - Выходной день");
            }
        }
    }
}




