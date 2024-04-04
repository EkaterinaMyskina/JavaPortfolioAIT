/*
Разработайте класс ClothingManager, который использует HashSet для управления коллекцией ClothingItem.
Класс должен иметь

методы для добавления, удаления и поиска одежды.

Убедитесь, что добавление одинаковых элементов (согласно определению в equals()) не допускается.
 */

package homework23;

import java.util.HashSet;


public class ClothingManager {

    private static HashSet<ClothingItem> catalog;

    public ClothingManager() {
        catalog= new HashSet<>();
    }

// добавление одежды

    public void addClothing(ClothingItem clothing){
        if(clothing == null){
            System.out.println("Одежды в продаже нет.");
        }
        else {
            boolean addResult = catalog.add(clothing);
            if (addResult) {
                System.out.println("Одежда " + clothing.getName() + " была добавлена в каталог.");
            } else {
                System.out.println("Одежда " + clothing.getName() + " уже есть в каталоге!");
            }
        }
    }

    //удаление одежды
    public void deleteClothing(ClothingItem clothing){

        if(clothing == null){
            System.out.println("Одежды в продаже нет");
        }
        else {
            boolean removeResult = catalog.remove(clothing);
            if(removeResult){
                System.out.println("Одежда " + clothing.getName() + " была удалена из каталога");
            }
            else {
                System.out.println("Одежда " + clothing.getName() + " не была удалена из каталога, так как не была найдена");
            }
        }
    }

    //поиск одежды

    //печать названий из каталога одежды, которая в наличии

    public  void printClotingInfo() {
        if (!catalog.isEmpty()) {
            for (ClothingItem name: catalog) {
                System.out.println(name.toString());
            }
        } else {
            System.out.println("Магазин одежды пуст!");
        }
    }


}
