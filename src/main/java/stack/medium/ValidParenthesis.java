package stack.medium;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String str="))()))"; String locked="010100";
        System.out.println(canBeValidDifferentApproach(str,locked));
    }

    public static    boolean canBeValid(String s, String locked){

        int n=s.length();
        char[] str = s.toCharArray();
        char[] lcck = locked.toCharArray();
        if(n%2!=0)
            return false;

        Stack<Integer>open=new Stack<>();
        Stack<Integer> openClose=new Stack();

        for ( int i=0;i<n;i++){

            if(lcck[i]=='0'){
                openClose.push(i);
            } else if (str[i]=='(') {
                open.push(i);
            } else if (str[i]==')') {

                if(!open.empty()){
                    open.pop();
                } else if (!openClose.empty()) {
                    openClose.pop();
                }else{
                    return false;
                }
            }

        }

        while (!openClose.empty() && !open.empty() && open.peek() < openClose.peek()){
            open.pop();
            openClose.pop();
        }

        return open.empty();
    }


    public static boolean  canBeValidDifferentApproach(String s, String locked){
        char[] strArray = s.toCharArray();
        char[] loackedArray = locked.toCharArray();
        int n=s.length();

        if(n%2!=0)
            return false;

        int open=0;
        for(int i =0;i<n;i++){
            if(strArray[i]=='(' || loackedArray[i]=='0'){
                open++;
            }else{
                open--;
            }

            if(open<0)
                return false;
        }
        int close=0;
        for(int i =n-1;i>0;i--){
            if(strArray[i]==')' || loackedArray[i]=='1'){
                close++;
            }else{
                close--;
            }

            if(close<0)
                return false;
        }

        return true;
    }
}
