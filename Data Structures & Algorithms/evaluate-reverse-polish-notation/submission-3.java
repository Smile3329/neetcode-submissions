class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                numbers.push(numbers.pop() + numbers.pop());
            } else if (c.equals("-")) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(b - a);
            } else if (c.equals("*")) {
                numbers.push(numbers.pop() * numbers.pop());
            } else if (c.equals("/")) {
                int a = numbers.pop();
                int b = numbers.pop();
                numbers.push(b / a);
            } else {
                numbers.push(Integer.parseInt(c));
            }
        }

        return numbers.pop();
    }
}
