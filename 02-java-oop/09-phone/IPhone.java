public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        return "The IPhone Unlocks";
    }
    @Override
    public void displayInfo() {
        System.out.println("The Iphone version is: " + this.getVersionNumber());
        System.out.println("The Iphone battery percentage is: " + this.getBatteryPercentage());
        System.out.println("The Iphone carrier is: " + this.getCarrier());
        System.out.println("the Iphone Ring Tone is: " + this.getRingTone());
    }
}