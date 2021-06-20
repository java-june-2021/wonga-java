public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println("The Galaxy rings");
        return this.getRingTone();
    }
    @Override
    public String unlock() {
        System.out.println("The Galaxy unlocks");
    }
    @Override
    public void displayInfo() {
        System.out.println("The Galaxy version is: " + Galaxy.versionNumber);
        System.out.println("The Galaxy battery percentage is: " + Galaxy.batteryPercentage);
        System.out.println("The Galaxy carrier is: " + Galaxy.carrier);
        System.out.println("the Galaxy Ring Tone is: " + Galaxy.ringTone);
    }
}