package java1_lection13.threads.tictak;

public class Data {
    private int state=1;

    public int getState() { return state; }

    public void Tic(){
        System.out.print("Tic-");
        state=2;
    }
    public void Tak(){
        System.out.println("Tak");
        state=1;
    }
}
