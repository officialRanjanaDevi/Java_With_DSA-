public class Day84 {
        public int compareVersion(String version1, String version2) {
            String []one=version1.split("\\.");
            String []two=version2.split("\\.");
    
            int i=0;
            int j=0;
    
            while(i<one.length&&j<two.length){
                int num1=Integer.parseInt(one[i]);
                int num2=Integer.parseInt(two[j]);
    
                if(num1>num2 &&i<=j){
                    return 1;
                }else if(num1<num2 &&j<=i){
                    return -1;
                }else if(num1==num2){
                    i++;
                    j++;
                }else if(num1==0){
                    i++;
                }else if(num2==0){
                    j++;
                }
            }
            while(i<one.length){
                   int num1=Integer.parseInt(one[i]);
                   if(num1>0){
                    return 1;
                   }
                i++;
            }
            while(j<two.length){
                int num2=Integer.parseInt(two[j]);
                if(num2>0){
                    return -1;
                }
                j++;
            }
            return 0;
        }
}
