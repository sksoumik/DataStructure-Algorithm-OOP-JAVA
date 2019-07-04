package interfaces;
// An interface is  a class like construct that contains only
// constants and abstruct methods.

interface Animal{
    public void animalSound();
    public void sleep();
}


class Pig implements Animal {

    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }

    public void sleep(){
        System.out.println("ZZzz");
    }
}
/********************* Driver Program ************************/
class Test{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
