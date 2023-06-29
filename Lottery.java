import java.util.ArrayList;

public class Lottery {

    public Toy win(ToyStore toyStore){
        int sum = 0;
        for (Toy toy: toyStore) {
            sum+= toy.getWeight();
        }

        ArrayList<Toy> arrPercentage = new ArrayList<>();

        for (Toy toy: toyStore) {
            int percent = 0;
            percent = calculatePercentage(toy.getWeight(), sum);
            while (percent > 0){
                arrPercentage.add(toy);
                percent--;
            }
        }
        return arrPercentage.get((int) (Math.random()*100));
    }

     public int calculatePercentage(int weight, int sum) {
        return weight * 100 / sum;
    }
    
}
