public class Eyes extends object{
    public Eyes(){
        super("Глазки");
        Join(getName());
    }
    public void watch(){
        System.out.print(" Серые " + getName() + " строго смотрели из-за круглых роговых очков.");
    }
}
