public class testterFish {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.settypeOfFish("Guppy");
        fish1.setfriendliness(4);

        Fish fish2 = new Fish();
        fish2.settypeOfFish("Mujaer");
        fish2.setfriendliness(5);

        String fish1tipe = fish1.gettypeOfFish();
        String fish2tipe = fish2.gettypeOfFish();

        String fish1Friendlinessskala = fish1.getfriendlinessskala();
        String fish2Friendlinessskala = fish2.getfriendlinessskala();

        System.out.println("ikan 1 = " + fish1tipe );
        System.out.println("ikan 2 = " + fish2tipe );

        Fish nicest = Fish.nicestFish(fish1, fish2);
        System.out.println("ikan dengan tingkat keramahan tertinggi: " + nicest.getfriendlinessskala());
    }
}