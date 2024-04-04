package Question_2;

public class TestThread extends Thread {
    Phone data;
    TestThread(Phone in){
        this.data = in;
    }

    @Override
    public synchronized  void start(){
        data.run();
    }


}
