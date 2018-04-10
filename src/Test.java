public class Test {
    static BrstmPlayer bp;
    static String filename;

    private static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        filename = "../trial.brstm";

        try {
            bp = new BrstmPlayer(filename);
            bp.startMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }

        wait(3000);

        try {
            System.out.println("stopping music and interrupting thread");
            bp.stopMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }

        filename = "../investigation.brstm";

        try {
            bp = new BrstmPlayer(filename);
            bp.startMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }

        wait(5000);

        try {
            System.out.println("stopping music and interrupting thread");
            bp.stopMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }

        filename = "../cornered.brstm";

        try {
            bp = new BrstmPlayer(filename);
            bp.startMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}