public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.2;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxerSum = boxerOne + boxerTwo;
        System.out.println("Общий вес боксеров равен - "+ boxerSum +" кг.");
        var boxerRzn = boxerTwo - boxerOne;
        System.out.println("Разница в весе боксеров составляет - " + boxerRzn + " кг.");
        System.out.println("Разница в весе боксеров составляет - " + boxerTwo % boxerOne + " кг.");
        var sumHours = 640;
        var onePersHours = 8;
        var sumPers = sumHours / onePersHours;
        System.out.println("Всего сотрудников в компании - " + sumPers + " человек");
        var sumSumPers = sumPers + 94;
        var sumSumHours = sumSumPers * 8;
        System.out.println("Если в компании работает " +sumSumPers + " человек, то всего " + sumSumHours + " часов может быть поделено между сотрудниками.");




    }
}
