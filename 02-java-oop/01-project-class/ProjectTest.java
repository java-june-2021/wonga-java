import java.util.Arrays;
public class ProjectTest{
    public static void main(String[] args) {
        Project projectOne = new Project("Project One", "The first project");
        Project projectTwo = new Project("Project Two");
        Project projectThree = new Project();
        System.out.println(projectOne.name);
        System.out.println(projectTwo.description);
        System.out.println(projectThree.description);
        //Figure out how to invoke elevatorPitch
        System.out.println(projectOne.elevatorPitch());

    }
}