package prabalmanhas;
import java.util.*;

class Video {
    String title;
    Boolean flag = false;
    static int rating = 0;
}

class VideoStore {
    Video[] v = new Video[10];

    void addVideo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME OF 10 VIDEOS OF YOUR DESIRED CHOICE");
        for (int i = 0; i < 10; i++)

        {
            v[i] = new Video();
            v[i].title = sc.nextLine();
        }
    }

    void checkOut(String s) {
        int c = 0;
        for (int i = 0; i < 10; i++) {
            if (v[i].title.equals(s) && v[i].flag == false)
                v[i].flag = true;
            else
                c++;
        }
        if (c == 10)
            System.out.println("SORRY! VIDEO NOT AVAILABLE OR CHECKED OUT");
    }

    void returnVideo(String s) {
        int c = 0, r;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (v[i].title.equals(s) && v[i].flag == true) {
                v[i].flag = false;
                System.out.println("KINDLY GIVE A RATING ON A SCALE OF 1-5");
                r = sc.nextInt();
                if (r <= 5)
                    receiveRating(s, r);
                else
                    System.out.println("SORRY CHECK YOUR INPUT, ENTER WITHIN 5");
            } else {
                c++;
            }
        }
        if (c == 10)
            System.out.println("VIDEO WAS NEVER CHECKED OUT");

    }

    void receiveRating(String s, int r) {
        System.out.println("THANKS FOR RATING THE VIDEO");
    }

    void listInventory() {
        System.out.println("CURRENT INVENTORY");
        for (int i = 0; i < 10; i++) {
            if (v[i].flag == false)
                System.out.println(v[i].title);
        }
    }
}

class VideoStoreLauncher {
    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        VideoStore vs = new VideoStore();
        vs.addVideo();
        System.out.println("ENTER A VIDEO FOR CHECKOUT");
        s = sc.nextLine();
        vs.checkOut(s);
        System.out.println("ENTER A VIDEO FOR CHECKIN");
        s = sc.nextLine();
        vs.returnVideo(s);
        vs.listInventory();
    }
}