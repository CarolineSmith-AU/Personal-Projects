package CardGame.src;

public class Player {

        String name;
        int age;

        public Player(String nameIn, int ageIn) {
            this.name = nameIn;
            this.age = ageIn;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
