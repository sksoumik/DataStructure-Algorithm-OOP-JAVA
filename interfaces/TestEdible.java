package interfaces;


interface Edible{
    public abstract String howToEat();
}


abstract class Animals{
    public abstract String sound();

}


class Chicken extends Animals implements Edible{
    public String howToEat(){
        return "Chicken: Fry it!";
    }
    public String sound(){
        return "Chicken: Cock cock!";
    }
}


class Tiger extends Animals{
    public String sound(){
        return "Tiger: ROOOOOAR!";
    }
}


abstract class Fruit implements Edible{

}


class Apple extends Fruit{
    public String howToEat(){
        return "Apple: Make apple cider";
    }
}


class Orange extends Fruit{
    public String howToEat(){
        return "Orange: Make orange juice";
    }
}

/********************Driver program*********************/
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(),new Chicken(), new Apple()};

        for(int i=0; i<objects.length; i++)
        {
            if (objects[i] instanceof Edible)
            {
                System.out.println(((Edible)objects[i]).howToEat());
            }
            if (objects[i] instanceof  Animals)
            {
                System.out.println(((Animals)objects[i]).sound());
            }
        }
    }
}


/*
Output:
Tiger: ROOOOOAR!
Chicken: Fry it!
Chicken: Cock cock!
Apple: Make apple cider
 */