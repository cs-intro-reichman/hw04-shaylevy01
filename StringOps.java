public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //test capVowelsLowRest
        // System.out.println(capVowelsLowRest("Hello World"));
        // System.out.println(capVowelsLowRest("One two tHRee world"));
        // System.out.println(capVowelsLowRest("vowels are fun"));
        // System.out.println(capVowelsLowRest("intro"));
        // System.out.println(capVowelsLowRest("yellow"));
        //test camelCase
        // System.out.println(camelCase("Hello World"));
        // System.out.println(camelCase("HELLO world"));
        // System.out.println(camelCase(" tWo wordS"));
        // System.out.println(camelCase("world"));
        // System.out.println(camelCase(" Intro to coMPUter sCIEncE "));
        //test allIndexOf
        // System.out.println(allIndexOf("Hello world",'l'));
        // System.out.println(allIndexOf("Hello worLd",'l'));
        // System.out.println(allIndexOf("Hello world",'o'));
        // System.out.println(allIndexOf("Hello world",' '));
        // System.out.println(allIndexOf("Hello world",'d'));
        // System.out.println(allIndexOf("MMMM",'M'));

    }

    public static String capVowelsLowRest (String string) {
        //This function takes as input a string containing only letters and change Vowels to uppercase and Lower the Rest
        String newString = "";
        for (int i=0; i < string.length() ; i++){
            if ((string.charAt(i) == 'a') || (string.charAt(i) == 'e') || (string.charAt(i) == 'i') || (string.charAt(i) == 'o') || ((string.charAt(i) == 'u'))){
                newString = newString + (char) ((int) string.charAt(i) - 32);
            } else {
                if (((int) string.charAt(i) > 65) && ((int) string.charAt(i) <= 90) && (((int) string.charAt(i) != 69) && ((int) string.charAt(i) != 73) && ((int) string.charAt(i) != 79) && ((int) string.charAt(i) != 85))){
                    newString = newString + (char) ((int) string.charAt(i) + 32);    
                } else {
                    newString = newString + string.charAt(i);
                }
            }
        }
        return newString;
    }

    public static String camelCase (String string) {
        //This function also takes as an input a string containing only letters and camel case it
        String newString = "";
        String newString2 = "";
        String newString3 = "";
        for (int i=0 ; i<string.length(); i++){
            if (string.charAt(i) != ' '){
                if ((int) string.charAt(i) >= 65 && (int) string.charAt(i) <= 90) {
                    newString = newString + (char) (((int) string.charAt(i) + 32));
                } else {
                    newString = newString + string.charAt(i);
                }
            } else {
                if (i != 0 && i != string.length()-1){
                    newString = newString + ' ';
                }
            }
        }
        for (int i=0 ; i<newString.length() ; i++){
            if (newString.charAt(i) != ' '){
                newString2 = newString2 + newString.charAt(i);
            } else {
                newString2 = newString2 + (char) ((int) newString.charAt(i+1) - 32);
                i++;
            }
        }
        for (int i=0 ; i<newString2.length() ; i++){
            if (newString2.charAt(i) != ' '){
                newString3 = newString3 + newString2.charAt(i);
            }
        }
        return newString3;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int count = 0;
        for (int i=0 ; i<string.length() ; i++){
            if (string.charAt(i) == chr){
                count++;
            }
        }
        int[] arr = new int[count];
        int a = 0;
        for (int i=0 ; i<string.length() ; i++){
            if (string.charAt(i) == chr){
                arr[a] = i;
                a++;
            }
        }
        return arr;
    }
}
