public class Q1_school {

    static int idCounter = 100; 
    String name;
    int id;
    String subject;
    Q1_school(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.id = ++idCounter; 
    }
    void showDetails() {
        System.out.println("Teacher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        Q1_school t1 = new Q1_school("Ramu", "Science");
        Q1_school t2 = new Q1_school("Anjali", "Maths");
        Q1_school t3 = new Q1_school("Deepika", "English");

        t1.showDetails();
        t2.showDetails();
        t3.showDetails();
    }
}
