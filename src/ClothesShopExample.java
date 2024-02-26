public class ClothesShopExample {
    public static void main(String[] args) {
        ClothingFactory shirtFactory = new ShirtFactory();
        Clothing shirt = shirtFactory.createClothing();
        shirt.display();
        ClothingFactory pantsFactory = new PantsFactory();
        Clothing pants = pantsFactory.createClothing();
        pants.display();
    }
}