class Solution {
    public void reverseString(char[] s) {
        Stack<Character> x=new Stack<>();
        for(int i=0;i<s.length;i++){
            x.push(s[i]);
        }        
        System.out.print("[");

        for (int i = 0; i < s.length; i++) {
            s[i] = x.pop();
        }
        System.out.print("[ ");
        for (int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\"");
            
            if (i != s.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" ]");
    }
}