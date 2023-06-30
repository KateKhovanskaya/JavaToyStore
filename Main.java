import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy("машинка", 2);
        toyStore.addToy("кукла", 2);
        toyStore.addToy("конструктор", 6);
        // Lottery lottery = new Lottery();
        // Writer writer = new Writer();
        // String path = "result.txt";
        // for(int i=0;i<10;i++){
        //     writer.Write(path, lottery.win(toyStore).toString());
        // }
        List<Toy> toys = toyStore.getAllToys();
        PriorityQueue<Toy> toysQueue = new PriorityQueue<>();
        for (int i=0; i<toys.size(); i++){
            Toy currentToy = toys.get(i);
            toysQueue.add(currentToy);
        }
        List<Toy> resultList = new ArrayList<Toy>();
        for (int i=0; i<10; i++){
            Toy currentToy = toysQueue.poll();
            resultList.add(currentToy);
        }
        System.out.println(resultList);
    }
}
