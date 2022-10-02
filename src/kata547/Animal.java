package kata547;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Animal[] deserializeAnimalObjects (byte[] data) {
        Animal[] animals = null;
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int objectsCount = ois.readInt();
            animals = new Animal[objectsCount];
            for (int i = 0; i < objectsCount; i++) {
                animals[i] = (Animal) ois.readObject();
            }
        } catch (ClassNotFoundException | ClassCastException | NegativeArraySizeException | IOException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }

    public static void main(String[] args) throws IOException{
        Animal[] animals = {new Animal("Zebra")};
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/kata547/animals.txt"));
        oos.writeInt(animals.length);
        for (int i = 0; i < animals.length; i++) {
            oos.writeObject(animals[i]);
        }
        oos.close();

        InputStream ois = new FileInputStream("src/kata547/animals.txt");
        byte[] bytes = ois.readAllBytes();

        System.out.println(Arrays.toString(deserializeAnimalObjects(bytes)));
    }
}