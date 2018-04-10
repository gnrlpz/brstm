public class Test {
    static BrstmPlayer bp;
    static String filename;

    public static void main(String[] args) {
        filename = "../trial.brstm";

        try {
            bp = new BrstmPlayer(filename);
            bp.startMusic();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("counting to 3...");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

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

    }
}