package utilities;


public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){

        for(int i = 0; i<input.length(); i++){
            BracketStack<Character> stackening = new BracketStack();
            char charizard = input.charAt(i);
            if (charizard == '('){
                if (charizard == '['){
                    if (charizard == '{'){
                        stackening.push(charizard);
                    }
                }
            } else if (charizard == ')'){
                char theWay = ((char) (stackening.pop() + charizard));
                if (charizard == ']'){
                    if (charizard == '}'){
                        System.out.println("theWay = " + theWay);
                        theWay == '{}';
                    }
                    theWay == '[]';
                }
                theWay == '()';
            }
            return true;
        }
        return false;
    }
}


