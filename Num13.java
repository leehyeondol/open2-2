public class Num13 {
    public static void main(String[] args){
        String str[] = {"박수 짝", "박수 짝짝"};
        int res, num, number0f369 = 0;
        for(int i = 1; i<100; i++){
            num = i;
            for(res = num%10; num>0;res = num%10){
                if(res ==3 || res == 6 ||res == 9)
                    number0f369++;
                num = num/10;
            }
            if(number0f369>0)
                System.out.println(i+str[number0f369-1]);
            number0f369=0;
        }
    }

}
