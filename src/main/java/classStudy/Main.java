package classStudy;

import java.util.ArrayList;
import java.util.List;

class UserAndAdminRepository {
    static List<User> userList = new ArrayList<>();
    private static UserAndAdminRepository instance;

    private UserAndAdminRepository() {}

    static UserAndAdminRepository getInstance() {
        if (instance == null) {
            instance = new UserAndAdminRepository();
        }
        return instance;
    }

    void insert() {
        userList.add(new User());
        System.out.println("사용자 또는 관리자 정보 추가");
    }

    void delete() {
        userList.remove(new User());
        System.out.println("사용자 또는 관리자 정보 삭제");
    }
}

class AdminService {
    void addAdmin() {
        UserAndAdminRepository.getInstance().insert();
    }
    void removeAdmin() {
        UserAndAdminRepository.getInstance().delete();
    }
}

class UserService {
    void addUser() {
        UserAndAdminRepository.getInstance().insert();
    }
    void removeUser() {
        UserAndAdminRepository.getInstance().delete();
    }
}

class User {
    static String userType = "사용자";
    String username = "user1";
    String password = "pw1";
}

public class Main {

    public static void main(String[] args) {
//        username = "testuser1";
//        password = "1234";
//        username = "testuser2";
//        password = "1111";

        String username1 = "testuser1";
        String password1 = "1234";
        String username2 = "testuser2";
        String password2 = "1111";

//        user1 = {
//                username: "testuser1",
//                password: "1234"
//        };
//        user2 = {
//                username: "testuser2",
//                password: "1111"
//        };  // JavaScript 형태

        // 일회성 객체 생성 -> 참조할 필요 없을 때 사용
        new User().username = "testuser1";
        new User().password = "1111";

        // 동일한 주소값에 값을 대입하기 위함 -> 재참조가 필요할 시
        User u = new User();
        u.username = "testuser2";
        u.password = "1234";

        User.userType = "관리자";
//        u.userType <- "관리자"

        AdminService adminService = new AdminService();
        UserService userService = new UserService();
    }
}


























