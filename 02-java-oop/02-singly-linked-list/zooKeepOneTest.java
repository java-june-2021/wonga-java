public class zooKeepOneTest{
    public static void main(String[] args) {
        Gorilla nope = new Gorilla();
        Gorilla jane = new Gorilla("jane");
        Gorilla jane2 = new Gorilla("jane2", 100);
        jane.displayenergy();
        jane.eatBananas();
        jane.eatBananas();
        jane.displayenergy();
        jane.climb();
        jane.displayenergy();
    }
}