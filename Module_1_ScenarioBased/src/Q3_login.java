
public class Q3_login {
    static class LoginSystem {
        private String storedUsername = "veda123"; 
        public void checkLogin(String inputUsername) {
            System.out.println("Comparing usernames...");

            if (storedUsername.equals(inputUsername)) {
                System.out.println("equals(): Usernames match in content.");
            } else {
                System.out.println("equals(): Usernames do NOT match in content.");
            }

            if (storedUsername == inputUsername) {
                System.out.println("Both refer to the same object in memory.");
            } else {
                System.out.println("They are different objects in memory.");
            }
        }
    }

    public static void main(String[] args) {
        LoginSystem system = new LoginSystem();

        String user1 = "veda123";
        system.checkLogin(user1);

        System.out.println();
        String user2 = new String("veda123");
        system.checkLogin(user2);
    }
}