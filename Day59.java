public class Day59 {
        public int countStudents(int[] students, int[] sandwiches) {
          Queue<Integer> stu=new LinkedList<>();
          for(int i=0;i<students.length;i++){
            stu.add(students[i]);
          }
          int j=0;
          int count=0;
          while(j<sandwiches.length&& count<=stu.size()){
            if(stu.peek()==sandwiches[j]){
                j++;
                stu.remove();
                count=0;
            }else{
                count++;
                int n=stu.remove();
                stu.add(n);
            }
          }
         return stu.size();
        }
}
