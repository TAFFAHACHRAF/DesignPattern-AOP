package taffah.enset.td1.exercice1.cas2;

public abstract class Design {
    public void displayContent(){
        System.out.println("---------------Navba-------------------");
        this.body();
        this.footer();
    }
    protected abstract void body();
    protected abstract void footer();
}
