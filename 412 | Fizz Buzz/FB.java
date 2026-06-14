class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(
                i%3==0&&i%5==0?"FizzBuzz":
                i%3==0?"Fizz":
                i%5==0?"Buzz":
                
                String.valueOf(i)
            );
        }
        return al;
        // for(int i=1;i<=n;i++){
        //     if(i%3==0&&i%5==0){
        //         al.add("FizzBuzz");
        //     }else if(i%3==0){
        //         al.add("Fizz");
        //     }else if(i%5==0){
        //         al.add("Buzz");
        //     }else{
        //         al.add(String.valueOf(i));
        //     }
        // }
        // return al;


    }
}
