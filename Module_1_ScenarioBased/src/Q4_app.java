class Player {
    String name;
    Player(String name) {
        this.name = name;
        System.out.println(name + " has joined the game.");
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " has been removed from memory (garbage collected).");
    }
}
public class Q4_app {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Player p = new Player("Player" + i);
        }
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main method completed.");
    }
}
