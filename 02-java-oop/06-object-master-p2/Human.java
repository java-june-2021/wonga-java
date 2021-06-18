public class Human {
    public String name;
    public Integer strength;
    public Integer stealth; 
    public Integer intelligence;
    public Integer health;

    // Constructor
    public Human(String name, Integer strength, Integer stealth, Integer intelligence, Integer health){
        this.name = name;
        this.strength = strength;
        this.stealth = stealth; 
        this.intelligence = intelligence;
        this.health = health;
    }

    // Method Overloading
    public Human(String name){
        this.name = name;
        this.strength = 3;
        this.stealth = 3; 
        this.intelligence = 3;
        this.health = 100;
    }

    //Revisit the input paramtera here. 
    public Integer displayhealth(){
        System.out.println(this.health);
        return this.health;
    }
    //Need to figure out what I want to do with this human attacking human thing Practice using an printf here, too
    public Integer attackHuman(Human target){
        target.health -= this.strength;
        return target.health;
    }

    //Methods go here
        // Getters and Setters
    public String getName(){
        return this.name;
    }

    public Integer getStrength(){
        return this.strength;
    }

    public Integer getStealth(){
        return this.stealth;
    }

    public Integer getIntelligence(){
        return this.intelligence;
    }

    public Integer getHealth(){
        return this.health;
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

    public Integer setStrength(){
        return this.strength;
    }

    public Integer setStealth(){
        return this.stealth;
    }

    public Integer setIntelligence(){
        return this.intelligence;
    }
    public Integer setHealth(){
        return this.health;
    }
}