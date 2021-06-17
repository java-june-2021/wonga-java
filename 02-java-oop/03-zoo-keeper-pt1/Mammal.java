public class Mammal {
    public String name;
    public Integer energyLevel;

    // Constructor
    public Mammal(String name, Integer energyLevel){
        this.name = name;
        this.energyLevel = energyLevel;
    }

    // Method Overloading
    public Mammal() {
        this.name = "Generic name";
        this.energyLevel = 100;
    }

    //Revisit the input paramtera here. 
    public Integer displayenergy(){
        System.out.println(this.energyLevel);
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