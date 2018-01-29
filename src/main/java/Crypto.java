import org.mindrot.jbcrypt.BCrypt;

public class Crypto {

    public static String hash(String password, int logRounds) {
        long before = milliseconds();
        String hash = BCrypt.hashpw(password, BCrypt.gensalt(logRounds));
        System.out.println("Hash time " + (milliseconds() - before) + " milliseconds.");
        return hash;
    }

    public static boolean check(String password, String hash) {
        long before = milliseconds();
        boolean checked = BCrypt.checkpw(password, hash);
        System.out.println("Check time " + (milliseconds() - before) + " milliseconds.");
        return checked;
    }

    private static long milliseconds() {
        return System.currentTimeMillis();
    }

}
