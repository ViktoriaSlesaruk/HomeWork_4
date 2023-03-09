import java.util.ArrayList;
import java.util.List;

public class Main {
    //    static Cat jim;
    public static void main(String[] args) {
        // создать лист котов
        // заполнить его используя цикл и класс Рандом Хэлпер
        // распечатать всех котов из коллекции
        RandomHelper helper = new RandomHelper();
        ArrayList<CatClass> cats = new ArrayList<>();

        for (int i = 0; i <= 7; i++){
            CatClass cat = helper.getRandomCat();
            System.out.println(cat.toString());
            cats.add(cat);
        }
    }
}