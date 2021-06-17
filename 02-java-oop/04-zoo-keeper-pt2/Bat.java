public class Bat {
    public String name;
    public Integer energyLevel;

    // Constructor
    public Bat(String name, Integer energyLevel){
        this.name = name;
        this.energyLevel = energyLevel;
    }

    // Method Overloading

    public Bat(String name) {
        this.name = name;
        this.energyLevel = 100;
    }

    public Bat() {
        this.name = "Test";
        this.energyLevel = 300;
    }

    //Revisit the input paramtera here. 
    public Integer displayenergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
    public Integer attackTown(){
        this.energyLevel =  this.energyLevel - 100;
        System.out.println(this.name + " attacked the town");
        return this.energyLevel;
    }
    public Integer fly(){
        this.energyLevel =  this.energyLevel - 50;
        System.out.println(this.name + " Flew");
        return this.energyLevel;
    }
    public Integer eatHumans(){
        this.energyLevel =  this.energyLevel + 25;
        System.out.println(this.name + " ate a human");
        return this.energyLevel;
    }


    //Methods go here
        // Getters and Setters
    public String getName(){
        return this.name;
    }

    public Integer getenergyLevel(){
        return this.energyLevel;
    }


    public void setName(String name){
        if(name.equals("")){
            System.out.println("Name must be more than 1 character");
            return;
        }
        if(name.length() > 2){
            System.out.println("must be at least 2 characertrs");
        }
        this.name = name;
    }
    public Integer setEnergyLevel(){
        return this.energyLevel;
    }
}