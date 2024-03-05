public class Main {

    public static void main(String[] args) {
        /*
        LazyInitializedSingleton lis1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lis2 = LazyInitializedSingleton.getInstance();
        System.out.printf(
                "lis1 hashcode=%s, lis2 hashcode=%s%n",lis1.hashCode(), lis2.hashCode());
         */

        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];
        for(int i=0; i<threads.length;i++) {
            threads[i] = new Thread(new BreakIt());
            threads[i].start();
        }

        for(int i=0; i<threads.length; i++){
            try {
                threads[i].join();
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }


}
