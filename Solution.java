/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
         
        StackTraceElement[] elem = Thread.currentThread().getStackTrace();
        System.out.println(elem.length);
        return elem.length;
        
        
    }
}

