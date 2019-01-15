public class MyChar {

    private char ch;

    public MyChar(char ch){
        this.ch = ch;
    }

    public static void printLowerCaseAlphabets() {
        for(char ch=97;ch<=122;ch++)
        System.out.println(ch);
    }

    public static void printUpperCaseAlphabets() {
        for(char ch=65;ch<=90;ch++)
            System.out.println(ch);
    }


    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'u'){
            return true;
        }
    return false;
    }

    public boolean isDigit() {//between 0 9
        if(ch >=48 && ch<=57){
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {//between a and z and A Z
        if(ch >=65 && ch<=90)
            return true;
        if(ch >=97 && ch<=122)
            return true;

         return false;
    }

    public boolean isConsonant(){
        if(!isDigit())
            return true;
        return false;
    }
}
