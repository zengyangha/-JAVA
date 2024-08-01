package thread;

public class JJJJ {
        private int j = 0;
        
        public synchronized void big() {
            j++;
            System.out.println(Thread.currentThread().getName() +"\t"+ j);
        }

        public synchronized void small() {
            j--;
            System.out.println(Thread.currentThread().getName() +"\t"+ j);
        }


        public static void main(String[] args) {
            JJJJ jjjj = new JJJJ();
            Runnable theBig = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        jjjj.big();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            };


            Runnable theSmall = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        jjjj.small();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            };


            new Thread(theBig, "增加线程1").start();
            new Thread(theBig, "增加线程2").start();
            new Thread(theSmall, "减少1").start();
            new Thread(theSmall, "减少2").start();
        }

}
