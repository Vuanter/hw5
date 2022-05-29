public class Main {
    public static void main(String[] args) {

        // Задание 1
        // Объявите три массива:
        // 1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        // 2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        // 3. Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        // 1.

        int [] arr = new int[3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        System.out.print(arr[0]);
        System.out.print(arr[1]);
        System.out.print(arr[2]);
        System.out.println();

        // 2.

        double [] var = {1.57, 7.654, 9.986};
        for (int i = 0; i < var.length ; i++) {
            System.out.println(var[i]);
        }
        System.out.println();

        // 3.

        byte [] bytes = {10, 13, 15, 17, 1, 9, 57};
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes [i] );
        }
        System.out.println();

        // Задание 2
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        //начиная с первого элемента, через запятую.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        // 1

        int [] arr1 = new int[3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;

        for (int i = 0; i < arr1.length; i++){
            if (i!= arr1.length -1)
                System.out.print(arr1[i] + ", ");
            else
                System.out.print(arr[i]);
        }
        System.out.println();

        // 2

        double [] var1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < var1.length ; i++) {
            if (i!=var1.length - 1)
                System.out.print(var1[i] + ", ");
            else
                System.out.print(var[i]);
        }
        System.out.println();

        // 3

        byte [] bytes1 = {10, 13, 15, 17, 1, 9, 57};

        for (int i = 0; i < bytes1.length; i++) {
            if (i!=bytes1.length - 1)
                System.out.print(bytes1[i] + ", ");
            else
                System.out.print(bytes[i]);
        }

        System.out.println();

        // Задание 3
        // Теперь ваша задача – распечатать все элементы всех трех массивов,
        // но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую,
        // при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        // Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        for (int i = arr1.length - 1; i>=0; i--) {
            if (i!=0)
                System.out.print(arr1[i] + ", ");
            else if (i==0)
                System.out.print(arr1[i]);
        }

        System.out.println();

        for (int i =var1.length - 1; i>=0; i--) {
            if (i!=0)
                System.out.print(var1[i] + ", ");
            else if (i==0)
                System.out.print(var1[i]);
        }

        System.out.println();

        for (int i =bytes1.length - 1; i>=0; i--) {
            if (i!=0)
                System.out.print(bytes1[i] + ", ");
            else if (i==0)
                System.out.print(bytes1[i]);
        }


        System.out.println();


        // Задание 4
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        // Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        // Распечатайте результат преобразования в консоль.

        int [] arr2 = new int[3];
        arr2 [0] = 1;
        arr2 [1] = 2;
        arr2 [2] = 3;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 1){
                arr2[i] += 1;
            }
            if (i != arr2.length - 1)
                System.out.print(arr2[i] + ", ");
            else
                System.out.print(arr2[i]);
        }
    }
}