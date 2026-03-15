class Car
{
    private String name;
    private int mailage;
    private String colour;
    public void setName(String name) {
        this.name = name;
    }
    public void setMailage(int mailage) {
        this.mailage = mailage;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getName()
    {
        return name;
    }
    public int getMailage()
    {
        return mailage;
    }
    public String getColour()
    {
        return colour;
    }
}
public class Cars{
    public static void main(String[] args){
        Car c = new Car();
        c.setName("BMW");
        c.setMailage(2000);
        c.setColour("Purple");
        System.out.println("The car name :" + c.getName());
        System.out.println("The  mailage of the car  :" + c.getMailage());
        System.out.println("The colour of car  :" + c.getColour());
    }


}
