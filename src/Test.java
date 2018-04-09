public class Test {
    static BrstmPlayer bp;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            
            @Override
            public void run() {
                try {
                    System.out.println("loading trial");
                    bp = new BrstmPlayer("../trial.brstm");
                    System.out.println("starting music");
                    bp.startMusic();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        });
        
        t1.start();

        try {
            System.out.println("counting to 3...");
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
        try {
            System.out.println("stopping music and interrupting thread");
            bp.stopMusic();
            t1.interrupt();
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }

        Thread t2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                try {
                    bp = new BrstmPlayer("../investigation.brstm");
                    bp.startMusic();
                } catch (Exception e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
            }
        });

        t2.start();

    }
}