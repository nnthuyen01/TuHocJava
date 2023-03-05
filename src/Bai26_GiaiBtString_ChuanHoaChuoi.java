public class Bai26_GiaiBtString_ChuanHoaChuoi {
    public static void main(String[] args) {
        String input = "   Thuyen DEP Trai     QuA        ";
        System.out.println(chuanhoa(input));
    }
    public static String chuanhoa(String input){
        input = input.trim();
        String[] words = input.split("\\s+");
        for (int i = 0;i < words.length;i++){
            words[i] = words[i].toLowerCase();
            String firstChar = words[i].substring(0,1);
            firstChar = firstChar.toUpperCase();
            words[i] = firstChar + words[i].substring(1);
        }
        return String.join(" ",words);
    }
}
