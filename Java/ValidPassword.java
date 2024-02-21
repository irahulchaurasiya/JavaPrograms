public class ValidPassword {
    public static void main(String[] args) {
        String s = "Qwerty@123";

        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {

        if(s.length() < 8 || s.length() > 15)
        {
            return false;
        }

        String special = "@#%&!$*";
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specialBool = false;

        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                lowerCase = true;
            }
            if(Character.isUpperCase(c)){
                upperCase = true;
            }
            if(Character.isDigit(c)){
                digit = true;
            }
            if(special.indexOf(c) != -1){
                specialBool = true;
            }
        }

        if(lowerCase && upperCase && digit && specialBool)
        {
            return true;
        }

        return false;
    }
}
