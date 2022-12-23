package repls.InterviewRepls;

public class Repl215BooleanMethod {

    public static void main(String[] args) {

        Repl215BooleanMethod obj = new Repl215BooleanMethod();
        obj.isBalanced("(");
        obj.isBalanced("()");

    }
        public boolean isBalanced(String s){
            char[] arr=s.toCharArray();
            int opBrac=0;
            int clBrac=0;
            for (char c:arr){
                if(c=='('){
                    opBrac=opBrac+1;
                } if (c==')'){
                    clBrac=clBrac+1;
                }
            }
            if((opBrac+clBrac)%2==0){
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            return false;
        }
        }


