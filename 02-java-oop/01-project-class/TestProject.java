public class TestProject 
{
    
    public static void main(String[] args)
    {
        Project test = new Project();

        test.setName("Alfred");

        test.setDescription("A butler");

        System.out.print(test.elevatorPitch());
    }
}
