import java.util.Random;

public class RandomHelper {

    Random random = new Random();


    public String getRandomName () {
        String result = "";
        char a;
        for (int i = 0; i < 7; i++) {
            a = (char) (random.nextInt(35) + '0');
            result = result + a;
        }
        return (result);
    }

    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public int getRandomint() {
        return random.nextInt(15);
    }

    public CatClass getRandomCat() {
        return new CatClass(this.getRandomName(), this.getRandomint(), this.getRandomBoolean(), this.getRandomName());
        //создать используя методы этого класса нового кота и чтобы метод его возвращал
    }
}

