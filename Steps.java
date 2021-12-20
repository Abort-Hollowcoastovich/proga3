public class Steps extends object{
    public Steps(){
        super("Шаги");
        Join(getName());
    }
    public void go(String var){
        System.out.print("Тут за " + var + "ю послышались " + getName() + ".");
    }
}
