public class Day58 {
        public boolean checkValidString(String s) {
           int open=0;
           int close=0;
           for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                close++;
            }else if(ch==')'){
                open--;
                close--;
            }else{
                open--;
                close++;
            }
            if(open<0){
                open=0;
            }
            if(close<0){
                return false;
            }
           } 
    
           return open==0;
        }
}
