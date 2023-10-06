import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        System.out.println("Registration:");
        System.out.println("Write your url:");
        Scanner url = new Scanner(System.in);
        String databaseUrl = url.nextLine();
        System.out.println("Write your username:");
        Scanner username = new Scanner(System.in);
        String databaseUsername = username.nextLine();
        System.out.println("Write your password:");
        Scanner password = new Scanner(System.in);
        String databasePasssword = password.nextLine();

        DatabaseConnection.getInstance(databaseUrl,databaseUsername,databasePasssword).connect();

        DatabaseConnection dbConnection1 = DatabaseConnection.getInstance("jdbc:mysql://localhost/mydb", "user", "password");
        DatabaseConnection dbConnection2 = DatabaseConnection.getInstance("jdbc:postgresql://localhost/mydb", "postgres", "secret");

        System.out.println(dbConnection1 == dbConnection2);

        System.out.println(dbConnection1);
        System.out.println(dbConnection2);


    }
}