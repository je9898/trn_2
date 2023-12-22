package Package06;

public class objects {
    class Updater {
        /*void update(int count) {
            count++;
        }*/

        void update(Counter counter) {
            counter.count++;
        }
    }

    class Counter {
        int count = 0;  // 객체변수
    }
}
