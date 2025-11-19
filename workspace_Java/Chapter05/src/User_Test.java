public class User_Test {
  public static void main(String[] args) {

    //User를 5명 저장할 수 있는 배열 User를 생성하세요
    User[] users = new User[5];//그냥 일단 user 자료형 5개를 저장 할 수 있는 상자만 만들어 놓은거랑 같음

    //User 객체 생성 후 배열에 저장
    User user1 = new User(1,"kim",20);
    User user2 = new User(2,"choi",30);
    User user3 = new User(3,"jeong",40);
    User user4 = new User(4,"han",50);
    User user5 = new User(5,"lee",60);
    users[0] = user1;
    users[1] = user2;
    users[2] = user3;
    users[3] = user4;
    users[4] = user5;

    //1. 배열에 저장된 모든 유저의 회원번호,이름, 나이를 출력

    //배열의 0번째 요소에 저장된 유저의 모든 정보 출력
    for(int i = 0 ; i < users.length ; i++){
      users[i].display();
    }

    //2. 위 문제를 for-each문으로 푸세요
    for(User e : users){
      e.display();
    }

    System.out.println();

    //3. 배열에 저장된 모든 회원의 이름을 출력

    for(int i = 0 ; i < users.length ; i++){
      System.out.println(users[i].getName());
    }
    //System.out.println(users[0].getName());
    //System.out.println(users[1].getName());
    //System.out.println(users[2].getName());
    //System.out.println(users[3].getName());
    //System.out.println(users[4].getName());


    //4. 3번 문제를 for-each로 풀어보세요
    for(User a : users){
      System.out.println(a.getName());
    }

    //5.배열에 저장된 모든 회원 중 나이가 30세를
    //초과한 회원의 모든 정보를 출력,
    for(int i = 0 ; i < users.length ; i++){
      if(users[i].getAge() > 30){
        users[i].display();
      }
    }

    //6. 5번 문제 for-each출력
    for(User b : users){
      if(b.getAge() > 30) {
        System.out.println();
      };
    }

    }
  }
