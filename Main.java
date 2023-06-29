public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addToy("машинка", 2);
        toyStore.addToy("кукла", 2);
        toyStore.addToy("конструктор", 6);
        Lottery lottery = new Lottery();
        Writer writer = new Writer();
        String path = "result.txt";
        for(int i=0;i<10;i++){
            writer.Write(path, lottery.win(toyStore).toString());
        }
    }
}
