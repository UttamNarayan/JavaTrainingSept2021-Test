
import java.util.HashMap;
import java.util.Scanner;



class Ques1 {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String Fullname = src.next();
        String PhoneNum = src.next();
        String Height = src.next();
        String Gender = src.next();
        String MaritalStatus = src.next();

        System.out.println(Fullname);
        HashMap<String, String> map = new HashMap<>();
        map.put("fullname", Fullname);
        map.put("phoneNum", PhoneNum);
        map.put("height", Height);
        map.put("gender", Gender);
        map.put("maritalStatus", MaritalStatus);
        System.out.println(map);
    }
}
