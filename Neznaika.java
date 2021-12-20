public class Neznaika extends object{
    public Neznaika(){
        super("Незнайка");
        Join(getName());
    }
    public void goToBed(String var){
        System.out.print(" "+ getName() + " быстро юркнул в постель и накрылся " + var + "м.");
    }
    public void understood(String var){
        System.out.print(" " + getName() + " понял, что это и есть " + var + ", ");
    }
}
