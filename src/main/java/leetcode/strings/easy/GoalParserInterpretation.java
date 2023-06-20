package main.java.leetcode.strings.easy;

import main.java.utils.Logger;

public class GoalParserInterpretation {
    static Logger log = new Logger();

    public static void main(String[] args) {
//        String command = "G()(al)";
//        String command = "G()()()()(al)";
        String command = "(al)G(al)()()G";
        log.info(interpretFaster(command));
    }

    private static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    private static String interpretFaster(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G')
                builder.append("G");
            else if(command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')') {
                    builder.append("o");
                    i += 1;
                } else {
                    builder.append("al");
                    i += 3;
                }
            }
        }
        return builder.toString();
    }
}
