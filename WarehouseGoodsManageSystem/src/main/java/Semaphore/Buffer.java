package Semaphore;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Buffer {

    List<String> buffer = new LinkedList<>();
    // 互斥量，控制buffer的互斥访问
    private final Semaphore mutex = new Semaphore(1);

    // canProduceCount可以生产的数量（表示缓冲区可用的数量）。 通过生产者调用acquire，减少permit数目
    private final Semaphore canProduceCount = new Semaphore(10);

    // canConsumerCount可以消费的数量。通过生产者调用release，增加permit数目
    private final Semaphore canConsumerCount = new Semaphore(1);


    //写入缓冲区
    public void put() throws InterruptedException {
        //acquire()申请许可证，如果有，就可以获得，如果没有就等待了。
        //可以生产的数量
        canProduceCount.acquire();
        try {
            //获取随机数据
            String[] man = {"(zhangsan, male)", "(lisi, female)"};
            Random rn = new Random();
            String data = man[rn.nextInt(2)];
            //缓冲区申请许可
            mutex.acquire();
            buffer.add(data);
            System.out.println("生产者线程：" + Thread.currentThread().getName() + " 正在生产数据为：" + data + "    buffer目前大小为：" + buffer.size());
        } finally {
            //release()，归还许可证，保证循环使用
            mutex.release();
            // 生产者调用release，增加可以消费的数量
            canConsumerCount.release();
        }

    }

    public void get() throws InterruptedException {
        canConsumerCount.acquire();
        try {
            mutex.acquire();
            //从缓冲区中取出
            String val = buffer.remove(0);
            System.out.println("消费者线程：" + Thread.currentThread().getName() + " 正在消费数据为：" + val + "    buffer目前大小为：" + buffer.size());
        } finally {
            mutex.release();
            canProduceCount.release();
        }

    }

}


