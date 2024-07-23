public class CMP202 {
    public static void main(String[] args) {}
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 20;
        height = 170;
        name = "Isaac";
        name.length();
        password = "User@123";
        if (password.contains("123") || password.contains("User")) {
            System.out.println("Password is not strong enough");
        }
    }
}