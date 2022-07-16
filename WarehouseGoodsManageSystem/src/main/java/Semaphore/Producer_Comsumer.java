package Semaphore;

public class Producer_Comsumer {
    public static void main(String[] args) {
        final Buffer buffer = new Buffer();
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startProducer(buffer);
        startConsumer(buffer);
        startConsumer(buffer);
        startConsumer(buffer);
        startConsumer(buffer);

    }

    //闭包
    public static void startProducer(final Buffer buffer) {
        new Thread(() -> {

            while (true) {
                try {
                    buffer.put();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }).start();
    }

    public static void startConsumer(final Buffer buffer) {
        new Thread(() -> {
            try {
                while (true) {
                    buffer.get();
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }).start();
    }

}
