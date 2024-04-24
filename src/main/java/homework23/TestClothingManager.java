/*Шаг 4: Тестирование
        Напишите тестовый класс, который создает экземпляр ClothingManager и добавляет в него несколько
        элементов ClothingItem. Попробуйте добавить элементы с одинаковыми и разными характеристиками,
        чтобы проверить, как работает сравнение.
        Протестируйте поиск и удаление одежды из HashSet, используя различные характеристики.
        Проверьте,корректно ли работает поиск по характеристикам и удаляется ли одежда правильно.
*/
        package homework23;

public class TestClothingManager {
    public static void main(String[] args) {

        ClothingManager clothingManager =  new ClothingManager();

        clothingManager.addClothing(new ClothingItem("кофта",44,"розовый","одежда для женщин"));
        clothingManager.addClothing(new ClothingItem("кофта",44,"розовый","одежда для женщин"));
        clothingManager.addClothing(new ClothingItem("кофта",46,"розовый","одежда для мужчин"));
        clothingManager.addClothing(new ClothingItem("кофта",34,"розовый","одежда для детей"));
        clothingManager.addClothing(new ClothingItem("брюки",44,"зеленый","одежда для женщин"));
        clothingManager.addClothing(new ClothingItem("брюки",48,"зеленый","одежда для мужчин"));
        clothingManager.addClothing(new ClothingItem("брюки",34,"зеленый","одежда для детей"));
        clothingManager.addClothing(new ClothingItem("носки",36,"синий","белье для женщин"));
        clothingManager.addClothing(new ClothingItem("носки",44,"синий","белье для мужчин"));
        clothingManager.addClothing(new ClothingItem("носки",26,"синий","белье для детей"));


        clothingManager.printClotingInfo();
        clothingManager.deleteClothing(new ClothingItem("носки",46,"черный","белье для мужчин"));
        clothingManager.addClothing(new ClothingItem("куртка",50,"оранжевый","одежда для мужчин"));


        clothingManager.printClotingInfo();
    }
}
