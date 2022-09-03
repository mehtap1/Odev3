  public abstract class Animal {

    int age;
    String name;

      public String getName() {
          return name;
      }

      public int getAge() {
          return age;
      }

      public void setName(String name) {
          this.name = name;
      }

      public void setAge(int age) {
          this.age = age;
      }

        public Animal(String name, int age) {

            this.name = name;
            this.age = age;
      }


        public abstract int getAgeInHumanYears(int deger);

      }
