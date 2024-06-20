package latest.Collector.Done;

public class Harman {
    public static void main(String[] args) {
//        List<String> ls = List.of("flower, fleet, floor");
        String [] arr = {"flower", "fleet", "floor"};
        //flower, fleet, floor -> fl
        String [] arr2 = {"flower", "fleet", "floor", "deepak" };
//        System.out.println("test");

        System.out.println(longestPrefix(arr));
        System.out.println(longestPrefix(arr2));

    }

    public static String longestPrefix(String [] arr){
        for(int i = 0;i<arr[0].length();i++){
            char c = arr[0].charAt(i);
            for(int j = 1;j <arr.length;j++){
                if(i==arr[j].length() || arr[j].charAt(i)!=c){
//                    System.out.println(arr[0].substring(0,i));
                    if(arr[0].substring(0,i).equalsIgnoreCase("")) return "not found";
                    else return arr[0].substring(0,i);
                }
            }
        }

        return "not found";
    }
}
