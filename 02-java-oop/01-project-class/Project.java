public class Project {
    public String name;
    public String description;

    // Constructor
    public Project(String name,String description){
        this.name = name;
        this.description = description;
    }

    // Method Overloading
    public Project() {
        this.name = "Generic Name";
        this.description = "Generic Description";
    }

    public Project(String name) {
        this.name = name;
        this.description = "Generic Description";
    }

    //Revisit the input paramtera here. 
    public String elevatorPitch(){
        // System.out.println(this.name + " : "+ this.description);
        return this.name + " : "+ this.description;
    }

    //Methods go here
        // Getters and Setters
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setName(String name){
        if(name.equals("")){
            System.out.println("Name must be more than 1 character");
            return;
        }
        if(name.length() > 4){
            System.out.println("must be at least 4 characertrs");
        }
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

}