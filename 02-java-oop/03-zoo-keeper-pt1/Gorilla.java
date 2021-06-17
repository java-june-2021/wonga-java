public class Gorilla {
    public String name;
    public Integer energyLevel;

    // Constructor
    public Gorilla(String name, Integer energyLevel){
        this.name = name;
        this.energyLevel = energyLevel;
    }

    // Method Overloading

    public Gorilla(String name) {
        this.name = name;
        this.energyLevel = 100;
    }

    public Gorilla() {
        this.name = "Test";
        this.energyLevel = 100;
    }

    //Revisit the input paramtera here. 
    public Integer displayenergy(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
    public Integer throwSomething(){
        this.energyLevel =  this.energyLevel - 5;
        System.out.println(this.name + " threw something");
        return this.energyLevel;
    }
    public Integer eatBananas(){
        this.energyLevel =  this.energyLevel + 10;
        System.out.println(this.name + " ate a banana");
        return this.energyLevel;
    }
    public Integer climb(){
        this.energyLevel =  this.energyLevel - 10;
        System.out.println(this.name + " climbed a tree");
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