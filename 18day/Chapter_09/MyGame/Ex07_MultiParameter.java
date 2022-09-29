class Camp7<T1, T2> {
    private T1 param1;
    private T2 param2;

    public void set(T1 o1, T2 o2) {
        param1 = o1;
        param2 = o2;
    }

    public String toString() {
        return param1 + " & " + param2;
    }

}

public class Ex07_MultiParameter {
    public static void main(String[] args) {
        Camp7<String, Integer> camp = new Camp7<>();
        camp.set("Apple", 25);
        System.out.println(camp);
    }

}
