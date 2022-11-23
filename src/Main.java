public class Main {
    public static void main(String[] args) {
        //Задача 1.1
        System.out.println("Задача 1.1");
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }
        //Задача 1.2
        System.out.println("\nЗадача 1.2");
        for (int i=10; i>=1;i--){
            System.out.println(i);
        }
        //Задача 1.3
        System.out.println("\nЗадача 1.3");
        for (int i=0; i<=17;i+=2){
            System.out.println(i);
        }
        //Задача 1.4
        System.out.println("\nЗадача 1.4");
        for (int i=10; i>=-10;i--){
            System.out.println(i);
        }
        //Задача 2.1
        System.out.println("\nЗадача 2.1");
        for (int i=1904; i<=2096;i+=4){
            System.out.println(i +" год является високосным");
        }
        //Задача 2.2
        System.out.println("\nЗадача 2.2");
        for (int i=7; i<=98;i+=7){
            System.out.print(i +" ");
        }
        //Задача 2.3
        System.out.println("\n\nЗадача 2.3");
        for (int i=1; i<=512;i*=2){
            System.out.print(i +" ");
        }
        //Задача 3.1
        System.out.println("\n\nЗадача 3.1");
        int savings = 29000;
        int total = 0;
        for (int i=1; i<=12;i++){
            total += savings;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }
        //Задача 3.2
        System.out.println("\nЗадача 3.2");
        double totalWithPercent = 0;
        for (int i=1; i<=12;i++){
            totalWithPercent += savings;
            totalWithPercent = Math.ceil(totalWithPercent*101) / 100;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalWithPercent+" рублей");
        }
    }
}