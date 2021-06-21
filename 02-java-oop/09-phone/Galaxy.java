public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        return "The Galaxy unlocks";
    }
    @Override
    public void displayInfo() {
        System.out.println("The Galaxy version is: " + this.getVersionNumber());
        System.out.println("The Galaxy battery percentage is: " + this.getBatteryPercentage());
        System.out.println("The Galaxy carrier is: " + this.getCarrier());
        System.out.println("the Galaxy Ring Tone is: " + this.getRingTone());
    }
}