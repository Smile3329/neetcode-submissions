class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> numbers = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String toPush = tokens[i];
            int res;
            if (tokens[i].equals("+")) {
                res = Integer.parseInt(numbers.pop()) + Integer.parseInt(numbers.pop());
                toPush = String.valueOf(res);
            } else if (tokens[i].equals("-")) {
                res = - Integer.parseInt(numbers.pop()) + Integer.parseInt(numbers.pop());
                toPush = String.valueOf(res);
            } else if (tokens[i].equals("*")) {
                res = Integer.parseInt(numbers.pop()) * Integer.parseInt(numbers.pop());
                toPush = String.valueOf(res);
            } else if (tokens[i].equals("/")) {
                int first = Integer.parseInt(numbers.pop());
                res = (int) Math.floor(Integer.parseInt(numbers.pop()) / first);
                toPush = String.valueOf(res);
            }
            numbers.push(toPush);
        }

        return Integer.parseInt(numbers.pop());
    }
}
