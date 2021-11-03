
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

import javax.naming.ldap.StartTlsRequest;

public class question2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(54, 18, 29);
        List<Integer> list2 = Arrays.asList(45, 51, 6);
        List<Integer> list3 = Arrays.asList(10, 24, 35);
        List<List<Integer>> NumberList = new ArrayList<>();
        NumberList.add(list1);
        NumberList.add(list2);
        NumberList.add(list3);
        List<Integer> MylistNumbers = NumberList.stream().flatMap(plist -> plist.stream())
                .collect(Collectors.toList());
        System.out.println(MylistNumbers);
    }
}
