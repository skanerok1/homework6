public class Main {
    public static void main(String[] args) {
        VISA visaGold = new VISA(90000.80, "VISA gold", 31);

        visaGold.blockCard();
        visaGold.addMoney(4000);
        System.out.println("Текущий баланс: " + visaGold.balance);

        visaGold.unblockCard();
        visaGold.addMoney(900.50);
        System.out.println("Текущий баланс: " + visaGold.balance);


    }
}
