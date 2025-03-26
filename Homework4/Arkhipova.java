//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arkhipova {

    public static int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

    public static int getSum(int[] args) {
        int sumArray = 0;
        for(int i = 0; i < array.length; i ++){
            sumArray += array[i];
        }
        return sumArray;
    }

    public static int getMin(int[] args) {
        int minArray = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i ++){
            if (array[i] < minArray) {
                minArray = array[i];
            }
        }
        return minArray;
    }

    public static int getMax(int[] args) {
        int maxArray = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i ++){
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }
        return maxArray;
    }


    public static void main(String[] args) {

        System.out.println("Сумма значений = " + getSum(array));
        System.out.println("Минимальное значение = " + getMin(array));
        System.out.println("Максимальное значение = " + getMax(array));


    }
}