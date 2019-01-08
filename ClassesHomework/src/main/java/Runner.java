public class Runner {
    public static void main(String[] args) {

        WaterBottle bottle1 = new WaterBottle(100, 100);
        System.out.println(bottle1.drinkVolume());

        System.out.println(bottle1.emptyBottle());
        System.out.println(bottle1.fillBottle());
    }
}
