package sobrescrita;

    public class Main {
        public static void main(String[] args) {
            Animal animal1 = new Cachorro();
            Animal animal2 = new Gato();
            Animal animal3 = new Vaca();

            animal1.fazerSom();
            animal2.fazerSom();
            animal3.fazerSom();
        }
    }
