class ConditionalStatements {
    static void main(String[] args) {
        int a = -5;

        if (a >= 0) {
            System.out.println(" The " + a + " is postive value");
        } else {
            System.out.println("The " + a + " is postive value");
        }

        int marks = 40;
        if (marks >= 35) {
            System.out.println("Pass");
        }

        int age = 16;
        if(age>= 18){
            System.out.println("Can Vote");
        } else {
            System.out.println("Cannot Vote");
        }


    }
}
