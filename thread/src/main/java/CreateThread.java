/**
 * @Author jiangzhou
 * @Data 2022-05-22
 */
public class CreateThread {
    public void create() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A");
            }
        });
        System.out.println("B");
    }
}
