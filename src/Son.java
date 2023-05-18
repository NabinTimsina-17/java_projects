class Father{
    String eyeColor = "Blue";
    String bloodGroup = "B+";
    String hairType = "Curls";
    void does()
    {
        System.out.println("Son Inheriting properties from Father");
    }
}

public class Son extends Father{

    public static void main(String args[])
    {
        Father obj = new Father();
        obj.does();
        System.out.println("Blood Group of son is " + obj.bloodGroup);
        System.out.println("Eye Color of son is " + obj.eyeColor);
        System.out.println("Hair Type of son is " + obj.hairType);
    }}