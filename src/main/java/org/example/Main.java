package ;
;
import java.util.List;
import java.util.ListIterator;

public class Program {
    // 1.  Создать новый список массивов, добавить
    // несколько цветов (строку) и вывести коллекцию на экран.
    public static List<String> newColorList() {
        List<String> colorList = new <>();
        colorList.add("green");
        colorList.add("red");
        colorList.add("white");
        colorList.add("black");
        colorList.add("pink");
        colorList.add("blue");
        return ;
    }

    // 2.  Добавления к каждому символа '!'.
    public static List<String> iterList(List<String> list) {
        ListIterator<String> newList = .();
        while (newList.hasNext()) {
            newList.set(newList.next().concat("!"));
        }
        return ;
    }

    // 3. Вставки элемента в список массивов .
    public static List<String> addList(List<String> list) {
        list.add(0, "yellow");
        return list;
    }

    // 4.  Копирования одного списка массивов в другой.
    public static List<String> copyList(List<String> list) {
        List<String> newCopyList = List.copyOf(list);
        return newCopyList;
    }

    public static void main(String[] args) {
        // 1
        System.out.println(newColorList());

        // 2
        System.out.println(iterList(newColorList()));

        // 3
        System.out.println(addList(iterList(newColorList())));

        // 4
        System.out.println(copyList(sortList(removeList(replacElement(addList(iterList(newColorList())), "yellow", "yellow!")))));
    }
}