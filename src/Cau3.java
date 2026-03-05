import java.util.*;

public class Cau3 {
    public static void main(String[] args) {
        String[] regex1 = {"(","[","{"};
        String[] regex2 = {")","]","}"};

        Scanner scanner = new Scanner(System.in);


        System.out.println("Mời nhập chuỗi : ");

        String input = scanner.nextLine();

        if (input == ""){
            System.out.println("Lỗi : chuỗi  không được rỗng");
        }
        List<String> strings = new ArrayList<>(Arrays.asList(input.split("")));

        Stack<String> strings1 = new Stack<>();

        for (String string : strings){
            for (String regex : regex1){
                if (string.equals(regex)){
                    strings1.push(string);
                }


                for (String regexTem : regex2){

                    if (string.contains(regexTem)){
                        System.out.println(string.contains(regexTem));
                        String temp = strings1.peek();
                        System.out.println(temp);
                        if (!temp.equals(regexTem)){
                            System.out.println(temp.equals(regexTem));
                            strings1.pop();
                        }
                    }
                }
            }
        }


        System.out.println(strings1.size());

        if (strings1.isEmpty()){
            System.out.println("Hợp lệ");
        }else {
            System.out.println("Không hợp lệ");
        }


    }
}
