import java.util.*;

public class Cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Mời nhập chuỗi : ");

        String input = scanner.nextLine();

        if (input == ""){
            System.out.println("Lỗi : chuỗi  không được rỗng");
        }

        Map<Integer, List<String>> map = new TreeMap<>();
        String[] strings = input.split(" ");

        List<String> strings1 = new ArrayList<>();

        for (String str : strings){
            String temp = str.trim().toLowerCase();

           if (map.containsKey(temp.length())){
//              map.put(temp.length(),);
           }
        }


        for (Map.Entry<Integer, List<String>> entry : map.entrySet()){
            Integer lenght = entry.getKey();

            Set<Map.Entry<Integer, List<String>>> list = map.entrySet();

            System.out.printf("- %d kí tự : [%s]",lenght,list);
        }




    }
}
