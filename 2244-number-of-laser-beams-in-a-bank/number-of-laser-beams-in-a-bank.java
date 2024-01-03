class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<bank.length; i++){
            int count = countone(bank[i]);
            if(count > 0){
                list.add(count);
            }
        }
        int sum = 0;
        for(int i=0; i<list.size()-1; i++){
            sum += list.get(i) * list.get(i+1);
       }
        return sum;
    }
    public int countone(String row){
        int count = 0;
        char[] arr = row.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '1'){
                count++;
            }
        }
        return count;
    }
}