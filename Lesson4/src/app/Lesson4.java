public class Lesson4 {
    public static void main(String[] args) {

        int orderNumber = 1;
        int numberOfDays = 5;
        double amount = 12153.41;
        double amountPerDay = amount / numberOfDays;
        String productType = ": smartphone,";

        System.out.printf("Product No %d%s\n" + "total sales for %d days is EUR %.2f,\n" +
                "sales by day is EUR %.2f.\n",
                orderNumber, productType, numberOfDays, amount, amountPerDay);

        /* Alternative with division inside f-string without variable amountPerDay
        System.out.printf("Product No %d%s\n" + "total sales for %d days is EUR %.2f,\n" +
                        "sales by day is EUR %.2f.\n",
                orderNumber, productType, numberOfDays, amount, amount / numberOfDays);
        */

        orderNumber = 2;
        numberOfDays = 7;
        amount = 10486.85;
        amountPerDay = amount / numberOfDays;
        productType = ": laptop,";

        System.out.printf("Product No %d%s\n" + "total sales for %d days is EUR %.2f,\n" +
                        "sales by day is EUR %.2f.\n",
                orderNumber, productType, numberOfDays, amount, amountPerDay);

        /* Alternative with division inside f-string without variable amountPerDay
        System.out.printf("Product No %d%s\n" + "total sales for %d days is EUR %.2f,\n" +
                        "sales by day is EUR %.2f.\n",
                orderNumber, productType, numberOfDays, amount, amount / numberOfDays);
        */
    }
}
