class Operators {

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int x = 10;

        x += 5;
        x -= 3;
        x *= 2;

        System.out.println(x);

        int age = 17;
        System.out.println(age >= 18);
        System.out.println(age == 17);
        System.out.println(age != 20);

        a = 10;
        b = 10;

        System.out.println(a == b);
        System.out.println(a != b);

        int marks = 75;
        boolean hasAttendance = true;

        boolean pass = marks >= 40 && hasAttendance ;
        System.out.println(pass);

        boolean isAdmin = false;
        boolean isManager = true;

        System.out.println(isAdmin || isManager);
        System.out.println(!isAdmin);

        a = 5;

        System.out.println(a++);
        System.out.println(a);

        int balance = 1000;
        int withdraw = 1200;

        boolean canWithdraw = balance >= withdraw;

        System.out.println(canWithdraw);

        age = 22;
        boolean hasID = false;

        boolean allEntry = age >= 18 && hasID;
        System.out.println(allEntry);


    }
}
