public class StringInfo {
    public static void main(String[] args) {

    }
    public static void stringInfo(String str) {
        try {
            @SuppressWarnings("unused")
            int x = Integer.parseInt(str);
            System.out.println("is integer");
        } catch (NumberFormatException e) {
            System.out.println("is not integer");
        }
        try {
            @SuppressWarnings("unused")
            double x = Double.parseDouble(str);
            System.out.println("is double");
        } catch (NumberFormatException e) {
            System.out.println("is not double");
        }

//        if (str.isEmpty()) {
//            System.out.println("the string is empty!");
//        }
//        else if () {
        }
    }
//}
