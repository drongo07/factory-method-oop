interface Clothing {
    void display();
}

class Shirt implements Clothing {
    public void display() {
        System.out.println("Displaying Shirt");
    }
}

class Pants implements Clothing {
    public void display() {
        System.out.println("Displaying Pants");
    }
}

interface ClothingFactory {
    Clothing createClothing();
}

class ShirtFactory implements ClothingFactory {
    public Clothing createClothing() {
        return new Shirt();
    }
}

class PantsFactory implements ClothingFactory {
    public Clothing createClothing() {
        return new Pants();
    }
}
