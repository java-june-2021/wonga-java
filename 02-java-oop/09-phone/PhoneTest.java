public class PhoneTest {
    public static void main(String[] args) {
    IPhone anIphone = new IPhone("x",10,"Verizon","ABC");
    System.out.println(anIphone.ring());
    System.out.println(anIphone.unlock());
    anIphone.displayInfo();
    Galaxy aGalaxy = new Galaxy("7",30,"ATT","Galaxy Quest Music");
    System.out.println(aGalaxy.ring());
    System.out.println(aGalaxy.unlock());
    aGalaxy.displayInfo();
    }
}
