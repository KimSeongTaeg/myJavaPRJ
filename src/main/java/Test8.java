import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String ip = log.substring(0, log.indexOf(" "));
        System.out.println("IP : " + ip);

        String time = log.substring(log.indexOf("[") + 1, log.indexOf(" +"));
        System.out.println("time : " + time);

//        System.out.println(sum(4, 4));

        Scanner s = new Scanner(System.in);

        Sum01 Sum001 = new Sum01();

        System.out.println(Sum001.sum(3, 4));
    }
}

class Sum01 {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}

