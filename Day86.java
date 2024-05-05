class Day86 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }

        int arr[]=new int[26];
        int brr[]=new int[26];

        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            brr[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if((arr[i]!=0&&brr[i]!=0)||(arr[i]==0&&brr[i]==0)){
                //continue
            }else{
                return false;
            }
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        for(int i=25;i>=0;i--){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}