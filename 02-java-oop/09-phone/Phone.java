public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    // getters and setters removed for brevity. Please implement them yourself
    public String setVersionNumber(){
        return this.versionNumber;
    }
    public Integer setBatteryPercentage(){
        return this.batteryPercentage;
    }
    public String setCarrier(){
        return this.carrier;
    }
    public String setRingTone(){
        return this.ringTone;
    }
    public String getVersionNumber(){
        return this.versionNumber;
    }
    public Integer getBatteryPercentage(){
        return this.batteryPercentage;
    }
    public Strig getCarrier(){
        return this.carrier;
    }
    public String getRingTone(){
        return this.ringTone;
    }
}