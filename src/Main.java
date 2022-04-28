
public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(10);
        list.add(100);
        list.add(200);
        list.add(250);
        list.add(130);
        list.add(120);

        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }

    }
}
