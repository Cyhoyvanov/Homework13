import java.util.Scanner;

public class Homework13 {
	public static void main(String[] args) {
        int hours=24;
        int minutes=hours*60;
        int seconds=minutes*60;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество суток: ");
        int amountOfDays = scan.nextInt();
            System.out.println("Количество часов: "+hours*amountOfDays+" Количество минут: "+minutes*amountOfDays+" Количество секунд: "+ seconds*amountOfDays);

    }
}

