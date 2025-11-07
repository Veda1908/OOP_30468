import java.lang.annotation.*;
import java.lang.reflect.*;

public class Ref_demo3 {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface APIInfo {
        String endpoint();
        String method();
    }
    static class UserAPI {
        @APIInfo(endpoint = "/users", method = "GET")
        public void getUsers() {}

        @APIInfo(endpoint = "/users", method = "POST")
        public void createUser() {}

        @APIInfo(endpoint = "/users/{id}", method = "PUT")
        public void updateUser() {}

        @APIInfo(endpoint = "/users/{id}", method = "DELETE")
        public void deleteUser() {}
    }
    public static void main(String[] args) {
        System.out.println("API Documentation for UserAPI:");
        for (Method m : UserAPI.class.getDeclaredMethods()) {
            APIInfo info = m.getAnnotation(APIInfo.class);
            if (info != null) {
                System.out.println(info.method() + " " + info.endpoint() + " → Method: " + m.getName());
            }
        }
    }
}
