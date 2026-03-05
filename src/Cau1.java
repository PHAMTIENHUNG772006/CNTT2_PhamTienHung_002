import java.util.*;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Mời nhập số lượng hs nhận học bổng : ");
        int n  = Integer.parseInt(scanner.nextLine());
        if (n == 0){
            System.out.println("Số không hợp lệ");
        }

        List<Integer>  listInt = new ArrayList<>();
        Set<Integer> integerSet = new TreeSet<>();// tree set tự động sắp xếp
        for (int i = 0; i < n; i++) {// nhập thông tin
            int temp;
            System.out.printf("Nhập mã hs thứ %d : ",i+1);
            temp = Integer.parseInt(scanner.nextLine());
            listInt.add(temp);
        }


        for (int temp : listInt) {// đưa vào trong set
          integerSet.add(temp);
        }

        System.out.printf("Số học sinh nhận học bổng : %d \n",integerSet.size());// lấy ra số lượng hs hợp lệ
        System.out.println("Danh sách đã sắp xếp : ");

        for (int temp : integerSet) {
            System.out.print(temp + " ");
        }


    }
}
