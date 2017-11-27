public class Task6_SecondsInBiggerIntervals {
    public static void main(String[] args) {
        int Sec = 129600;
        int Time,D, H, M, S;
           D = Sec/86400 ^ 0;
             H = (Sec -D*86400)/3600 ^ 0 ;
              M=  (Sec - (D*86400 + H*3600))/60 ^ 0 ;
               S = Sec-D*86400-H*3600-M*60 ^ 0 ;


        System.out.println(D +"Days" + ' ' + H +"Hours" + ' '+ M +"Minutes" + ' ' + S+"Seconds");
    }
}
