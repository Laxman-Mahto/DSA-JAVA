package STRINGSS;

public class UCTOLC {

    // function to convert first letter of each word to uppercase
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        // capitalize first character
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            // if current char is space and not last character
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i)); // append space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i))); // capitalize next letter
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hii, i am laxman";
        System.out.println("Original: " + str);
        System.out.println("Converted: " + toUpperCase(str));
    }
}