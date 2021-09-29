class Solution {
    public String solution(String new_id) {
        String temp=new_id.toLowerCase();
        temp=temp.replaceAll("[^-_.a-z0-9]","");
        temp=temp.replaceAll("[.]{2,}", ".");
        temp=temp.replaceAll("^[.]|[.]$", "");
        
        if(temp.isEmpty()){
            temp="a";
        }
        if(temp.length()>=16){
            temp=temp.substring(0,15);
        }
          temp=temp.replaceAll("^[.]|[.]$", "");
        if(temp.length()<=2){
            for(;temp.length()<3;){
                temp+=String.valueOf(temp.charAt(temp.length()-1));
            }
        }
        return temp;
    }
    

   
}