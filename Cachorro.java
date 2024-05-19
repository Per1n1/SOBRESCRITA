package sobrescrita;

public class Animal {

        public void fazerSom() {
            System.out.println("Som generico de um animal");
        }
    }

    class Cachorro extends Animal {
        @Override
        public void fazerSom() {
            System.out.println("Au au!");
        }
    }

    class Gato extends Animal {
        @Override
        public void fazerSom() {
            System.out.println("Miau!");
        }
    }

    class Vaca extends Animal {
        @Override
        public void fazerSom() {
            System.out.println("Muu!");
        }
    }



