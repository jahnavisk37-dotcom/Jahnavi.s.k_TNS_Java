package oopsdemo;

class Worker {
    int workerId;
    String workerName;
    double wages;

    void setWorker(int id, String name, double w) {
        workerId = id;
        workerName = name;
        wages = w;
    }

    void displayWorker() {
        System.out.println("Worker ID: " + workerId);
        System.out.println("Worker Name: " + workerName);
        System.out.println("Wages: " + wages);
    }
}


public class ThisDemo {
	public static void main(String[] args) {

        Worker w1 = new Worker();

        w1.setWorker(21, "tobi", 2000);

        w1.displayWorker();
    }
}