public class Day57 {
        public String minRemoveToMakeValid(String s) {
            Stack<Character> stack=new Stack<>();
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch>=97&&ch<=122){
                    sb.append(ch);
                }else if(ch=='('){
                    sb.append(ch);
                    stack.push(ch);
                }else{
                    if(!stack.isEmpty()){
                        sb.append(ch);
                        stack.pop();
                    }
                }
            }
            int j=sb.length()-1;
            while(!stack.isEmpty()){
               if(sb.charAt(j)==stack.peek()){
                   sb.deleteCharAt(j);
                   stack.pop();
               }
               j--;
            }
            return sb.toString();
        }
}
