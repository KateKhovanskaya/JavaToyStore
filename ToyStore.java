import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ToyStore implements Iterable<Toy>{
    private List<Toy> toys;

    public ToyStore(){
        this(new ArrayList<>());
    }

    public ToyStore(List<Toy> toys){
        this.toys = toys;
    }

    public List<Toy> getAllToys(){
        return toys;
    }

    public void printAllToys(){
        System.out.println(toString());
    }

    public void addToy(Toy toy){
        toys.add(toy);
    }

    public void addToy(String name, int weight){
        toys.add(new Toy(name, weight));
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Toy toy:toys){
            sb.append(toy.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<Toy> iterator(){
        return new ToyIterator(toys);
    }
}
