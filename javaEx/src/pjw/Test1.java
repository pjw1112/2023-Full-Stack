package pjw;

//공유객체
class Rank {
    int num = 0;

    synchronized void plusnum() {
        int rank = num; // 데이터를 가져오기
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        num = rank + 1;
    }
}

// 공유객체를 사용하는 쓰레드
class User extends Thread {
    Rank rank;

    public User(Rank rank) {
        this.rank = rank;
    }

    @Override
    public void run() {
        rank.plusnum();
        System.out.println(rank.num + "등 >> " + getName());
    }
}

//공유객체 생성 - 등수 올리는 객체
public class Test1 {
    public static void main(String[] args) {
        
        Rank rank = new Rank();

        Thread user1 = new User(rank);
        user1.setName("sally");
        user1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        Thread user2 = new User(rank);
        user2.setName("alpha");
        user2.start();
    }
}
