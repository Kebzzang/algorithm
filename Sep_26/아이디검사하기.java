class Solution {
    public String solution(String new_id) {
        new_id=new_id.toLowerCase();
        new_id=st2(new_id);
        new_id=st3(new_id);
        new_id=st4(new_id);
        new_id=st5(new_id);
        new_id=st6(new_id);
        new_id=st7(new_id);
        return new_id;
    }
    
    public String st2(String answer){
        //알파벳 소문자, 정해진 특문 이외 사용했는지 체크
      
        String ans="";
        
        for(int i=0; i<answer.length() ; i++){
            if(answer.charAt(i)=='-'||answer.charAt(i)=='_'||answer.charAt(i)=='.'){
                ans+=String.valueOf(answer.charAt(i));
            }
            else if(Character.isLetterOrDigit(answer.charAt(i))){
                ans+=String.valueOf(answer.charAt(i));
            }
        }       
        return ans;
    }
    public String st3(String answer){
        //..이 연속인지 체크하기
        String ans=String.valueOf(answer.charAt(0));
        for(int i=1; i<answer.length(); i++){
            if(answer.charAt(i)=='.'&&ans.charAt(ans.length()-1)=='.'){
                continue;
            }else{
                ans+=String.valueOf(answer.charAt(i));
            }
        }
        return ans;
    }
    public String st4(String answer){
        //양 끝에 . 체크
        if(answer.equals("")||answer.equals(".")){
            return "";
        }
        else if(answer.charAt(0)=='.'&&answer.charAt(answer.length()-1)=='.'){
            return answer.substring(1, answer.length()-1);
        }
        else if(answer.charAt(0)=='.'){
            return answer.substring(1);
        }
           
          else if(answer.charAt(answer.length()-1)=='.'){
            return answer.substring(0, answer.length()-1);
        }
        else{
            return answer;
        }
    }
    public String st5(String answer){
        if(answer.isEmpty()){
            return "a";
        }else{
            return answer;
        }
    }
    public String st6(String answer){
        if(answer.length()>=16){
            return st4(answer.substring(0, 15));
        }else{
            return answer;
        }
    }
    public String st7(String answer){
        if(answer.length()<=2){
            for(;answer.length()<3;){
                answer+=String.valueOf(answer.charAt(answer.length()-1));
            }
        }
       
        return answer;
    }
   
}