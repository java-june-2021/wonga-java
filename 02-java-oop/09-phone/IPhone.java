public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println("The Iphone rings");
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        System.out.println("The Iphone unlocks");
    }
    @Override
    public void displayInfo() {
        System.out.println("The Iphone version is: " + IPhone.versionNumber);
        System.out.println("The Iphone battery percentage is: " + IPhone.batteryPercentage);
        System.out.println("The Iphone carrier is: " + IPhone.carrier);
        System.out.println("the Iphone Ring Tone is: " + IPhone.ringTone);
    }
}