public class MeasureTime {

    public void measureTime(Runnable task) {
        long startTime = System.currentTimeMillis();
        task.run();
        long elapsed = System.currentTimeMillis() - startTime;
        System.out.println(elapsed + " ms");
    }
}
