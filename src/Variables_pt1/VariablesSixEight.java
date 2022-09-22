package Variables_pt1;

public class VariablesSixEight {
    public static void main(String[] args) {
        // Задача 6
        System.out.println("Задача 6");
        var firstBoxerWeight = 78.2;
        System.out.println(firstBoxerWeight);
        var secondBoxerWeight = 82.7;
        System.out.println(secondBoxerWeight);
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalBoxersWeight);
        var boxersMassDiff = firstBoxerWeight - secondBoxerWeight;
        System.out.println(boxersMassDiff);


        // Задача 7
        System.out.println("Задача 7");
        var boxersMassDiff1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println(boxersMassDiff1);
        var massDiff = secondBoxerWeight % firstBoxerWeight;
        System.out.println(massDiff);


        // Задача 8
        System.out.println("Задача 8");
        var totalWorkHours = 640;
        var soleEmployeeHours = 8;
        var totalEmployeeNumber = totalWorkHours / soleEmployeeHours;
        System.out.println("Всего работников в компании " + totalEmployeeNumber + " человек");


        var additionalEmployees = 94;
        var allEmployees = totalEmployeeNumber + additionalEmployees;
        var newWorkHours = totalWorkHours / allEmployees;
        System.out.println("Если в компании работает " + allEmployees + " человек, то всего " + newWorkHours + " часа работы может быть поделено между сотрудниками.");

    }

}
