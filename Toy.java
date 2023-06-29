
public class Toy implements Comparable<Toy>{
    private static int count;
    private int id;
    private String name;
    private int weight;

    public Toy(String name, int weight){
        this.id = count++;
        this.name = name;
        this.weight = weight;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return id + " " + name + ", вес: " + weight;
    }

    @Override
    public int compareTo(Toy t){
        return this.getWeight()- t.getWeight();
    }
}