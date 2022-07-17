public class Shifr {
    public static void main(String[] args) {
        String oldString = "Мир";
        String oldString2 = "Труд";
        String oldString3 = "Май";
        String newString = oldString.replace("Мир", "Война");
        String newString2 = oldString2.replace('д', 'п');
        String newString3 = oldString3.replace("Май", "Конец");
        {
            System.out.println(newString);
            System.out.println(newString2);
            System.out.println(newString3);
        }
    }
}


