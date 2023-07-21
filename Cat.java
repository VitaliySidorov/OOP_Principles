public class Cat {
    
    private String name;
    private int age;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет).\n", 
                            name, age);
    }

}

class Owner extends Cat{
    String nameOwner;

    Owner(String name, int age, String nameOwner) {
        super(name, age);
        this.nameOwner = nameOwner;
    }
    void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец %s.\n", 
                            getName(), getAge(), nameOwner);
    }
}
