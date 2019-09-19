public class ConditionalStatement {
/*
   ЕСЛИ(вашВозраст > 20) {
    выведите какое-то сообщение
}

ЕСЛИ(выМужскогоПола) {
    выведите какое-то сообщение
}

ЕСЛИ(выНеМужскогоПола) {
    выведите какое-то сообщение
}

ЕСЛИ(вашРос < 1.80) {
    выведите какое-то сообщение
} ИНАЧЕ {
    выведите какое-то сообщение
}

ЕСЛИ(перваяБукваВашегоИмени == ‘M’) {
    выведите какое-то сообщение
} ИНАЧЕ ЕСЛИ(перваяБукваВашегоИмени == ‘I’) {
    выведите какое-то сообщение
} ИНАЧЕ {
    выведите какое-то сообщение
}
*/


    public static void main(String[] args) {
        // TODO code application logic here
        int age = 707;
        String sex = "Man";
        if (age > 20) {
            System.out.println("возраст больше 20");
        }
        if (sex == "Man") {
            System.out.println("Мужчина");

         }  else System.out.println("Не мужчина");
        double rost = 1.9;
        if (rost  > 1.8) {
            System.out.println("Рост высокий");

        }  else System.out.println("Рост не высокий");
        String Name= "IManya";
        String mychar = String.valueOf(Name.charAt(0));
        if (mychar == "M") System.out.println("Литерал M");
        else if (mychar == "I") System.out.println("Литерал I");
        else System.out.println("Литерал не M и не I " + mychar);

    }
}
