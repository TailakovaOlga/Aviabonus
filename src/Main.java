public class Main {
    public static void main(String[] args) {

        int initialCheck = 100; // Начальный счет
        int replenishment = 300; //Первое пополнение счета
        int secondbill = 1100; // Второе пополнение счета
        int bonus = 100; // Количество рублей для одного бонуса
        int finalbonus = initialCheck + replenishment + secondbill; // Итоговый бонус

        if (finalbonus > 1000) {
            System.out.println("Итоговый бонус положительный");
        }


        System.out.println("Итоговая сумма счета:");
        System.out.println((initialCheck + replenishment + secondbill) + " рублей");
        System.out.println("Итоговый бонус:");
        System.out.println((finalbonus / bonus) + " бонусов");

    }
}





