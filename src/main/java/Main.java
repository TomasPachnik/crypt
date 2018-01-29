import org.mindrot.jbcrypt.BCrypt;

public class Main {

    public static void main(String[] args) {
        int logRounds = 15;
        String password = "pass";
        String hash;
        hash = Crypto.hash(password, logRounds);
        boolean correct = Crypto.check(password, hash);
        System.out.println("result: " + correct);
    }

}
