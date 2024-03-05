public class BreakIt implements Runnable{
    @Override
    public void run() {
        LazyInitializedSingleton lis = LazyInitializedSingleton.getInstance();
        System.out.printf("lis hashcode=%s%n",lis.hashCode());
    }
}
