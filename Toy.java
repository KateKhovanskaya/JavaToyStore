
public class Toy implements Comparable<Toy>{
    private static int count;
    private int id;
    private String name;
    private int weight;
    private int quantaty;

    public Toy(String name, int weight, int quantaty){
        this.id = count++;
        this.name = name;
        this.weight = weight;
        this.quantaty = quantaty;
    }

    public Toy(String name, int weight){
        this(name, weight, 1);
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

    public int getQuantaty(){
        return quantaty;
    }

    public void setWeight(int weight){
        this.weight = weight;
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