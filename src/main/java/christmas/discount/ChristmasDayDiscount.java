package christmas.discount;

import christmas.input.VisitDate;

public class ChristmasDayDiscount {

    public static int christmasDiscount() {
        int day = VisitDate.readDate();
        int discount = 1000;
        if (day < 26) {
            for (int i = 0; i < day; i++) {
                discount += 100;
            }
        }
        return discount;
    }
}
