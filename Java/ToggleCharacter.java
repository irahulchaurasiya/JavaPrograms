public class ToggleCharacter {
    public static void main(String[] args) {
        String s = "aBc12@BcA";

        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                str.append(Character.toUpperCase(c));
            }
            else if(Character.isUpperCase(c)){
                str.append(Character.toLowerCase(c));
            }
            else
            {
                str.append(c);
            }
        }
        
        System.out.println(str);
    }
}
