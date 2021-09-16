class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int lefti=10; //현재 왼손 위치 기억
        int righti=11; //현재 오른손 위치 기억

        int[][] points={{3,1},
                {0,0},
                {0,1},
                {0,2},
                {1,0},
                {1,1},
                {1,2},
                {2,0},
                {2,1},
                {2,2},
                {3,0},
                {3,2}};
        int i=0;
        while(i<numbers.length){
            switch(numbers[i]){
                case 1:
                case 4:
                case 7: lefti=numbers[i];
                    answer+="L";
                    break;
                case 3:
                case 6:
                case 9: righti=numbers[i];
                    answer+="R";
                    break;
                case 2:
                case 5:
                case 8:
                case 0:
                    int a1=Math.abs(Math.abs(points[numbers[i]][0])-Math.abs(points[lefti][0]));
                    int a2=Math.abs(Math.abs(points[numbers[i]][1])-Math.abs(points[lefti][1]));
                    int b1=Math.abs(Math.abs(points[numbers[i]][0])-Math.abs(points[righti][0]));
                    int b2=Math.abs(Math.abs(points[numbers[i]][1])-Math.abs(points[righti][1]));
                    if(a1+a2<b1+b2) //왼쪽 선택
                    {
                        lefti=numbers[i];
                        answer+="L";
                    }else if(a1+a2>b1+b2){ //오른쪽 선택
                        righti=numbers[i];
                        answer+="R";

                    }else{ //같을 때
                        if(hand.equals("left")){ //왼손잡이면
                            answer+="L";
                            lefti=numbers[i];

                        }else{ //오른손잡이면
                            answer+="R";
                            righti=numbers[i];
                        }
                    }break;
            }
            i++;

        }


        return answer;
    }
}