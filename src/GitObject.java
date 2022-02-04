public class GitObject {
    private int num;

    public GitObject(int n) {
        num = n;
    }

    public void doThing() {
        System.out.println("I am git number:" + num);
    }

    public void setNumber(int n) {
        num = n;
        System.out.println("Hello");
    }
}
