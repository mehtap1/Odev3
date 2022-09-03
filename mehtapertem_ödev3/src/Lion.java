public class Lion extends Animal
{
    String breed;
    int humanYears;

    public Lion(String name, String breed, int age)
    {
        super(name,age);
        this.breed = breed;
    }

    public int getAgeInHumanYears (int age){
        if(age<2)
            humanYears+=age + 11;
        else
            humanYears+= 22+((age-2)*5);

        return humanYears ;
    }

    public void Goster() {
        System.out.println("Name:" + name + "\n");
        System.out.println("Breed:" + breed + "\n");
        System.out.println("Age:" + age + "\n");
        getAgeInHumanYears(getAge());
        System.out.println("Age in human:" + humanYears);
     }
    }