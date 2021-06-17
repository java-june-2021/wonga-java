public class zooKeepOneTest{
    public static void main(String[] args) {
        zooKeepOne nope = new Gorilla();
        zooKeepOne jane = new Gorilla("jane");
        zooKeepOne jane2 = new Gorilla("jane2", 100);
        jane.displayenergy();
        jane.eatBananas();
        jane.eatBananas();
        jane.displayenergy();
        jane.climb();
        jane.displayenergy();
    }
}