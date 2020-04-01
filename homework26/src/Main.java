import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int listSize = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Сколько учеников получат отметки ?",
                " введите число"));

        List<Integer> marks = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            marks.add((int) (Math.random() * 10));
        }
        JOptionPane.showMessageDialog(null, marks, "Отметки всех учеников", JOptionPane.INFORMATION_MESSAGE);

        int x = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Определите диапазон неудовлетворительных отметок от  0  до ...",
                " Худшая отметка"));

        for (int i = marks.size() - 1; i >= 0; i--) {
            int y = (int) marks.get(i);
            if (y <= x) {
                marks.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, marks, "Положительные оценки в классе", JOptionPane.INFORMATION_MESSAGE);
    }
}