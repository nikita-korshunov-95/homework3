public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sumWeight = firstBoxer + secondBoxer;
        System.out.println(sumWeight);
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println(differenceWeight);

        System.out.println("Задача 7");
        var differenceWeight1 = secondBoxer - firstBoxer;
        System.out.println(differenceWeight1);
        var differenceWeight2 = secondBoxer % firstBoxer;
        System.out.println(differenceWeight2);

        System.out.println("Задача 8");
        var hours = 640;
        var oneEmployee = 8;
        var numberOfEmployeers = hours / oneEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployeers + " человек");
        var NumberOfEmployeers = numberOfEmployeers + 94;
        var newHours = oneEmployee * NumberOfEmployeers;
        System.out.println("Если в компании работает " + NumberOfEmployeers + " человек, то всего " + newHours + " часа работы может быть поделено между сотрудниками");

    }
}