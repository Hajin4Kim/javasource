
package member;

import java.util.Scanner;

public class MemberConsoleUtil {

    public Member addMember(Scanner sc) {
        // 회원1명에대한 정보 입력받기
        // 입력받은정보로 Member instance 생성 후 return

        // TODO: 방법1
        // System.out.println("아이디 입력 >> ");
        // String id = sc.nextLine();

        // System.out.println("이름 입력 >> ");
        // String name = sc.nextLine();

        // System.out.println("주소 입력 >> ");
        // String addr = sc.nextLine();

        // System.out.println("이메일 입력 >> ");
        // String email = sc.nextLine();

        // return new Member(id, name, addr, email);

        // TODO: 방법2
        Member member = new Member();
        System.out.println("아이디 입력 >> ");
        member.setId(sc.nextLine());

        System.out.println("이름 입력 >> ");
        member.setName(sc.nextLine());

        System.out.println("주소 입력 >> ");
        member.setAddr(sc.nextLine());

        System.out.println("이메일 입력 >> ");
        member.setEmail(sc.nextLine());

        return member;
    }

    public void printMembers(Member[] members) { // TODO: MemberMain.java 에서 전달인자 받기
        // members 정보 출력
        for (Member member : members) {
            if (member != null) {
                System.out.println("아이디    이름     주소    이메일");
                System.out.printf("%s\t%s\t%s\t%s\t", member.getId(), member.getName(), member.getAddr(),
                        member.getEmail());
                System.out.println("\n 멤버 조회가 완료되었습니다. \n");
            }
            break;
        }

    }

    public Member updateMember(Scanner sc, Member[] members) {
        // 주소 수정
        // 아이디, 수정할 주소 입력받기
        // Member member = new Member();

        System.out.println();
        System.out.println("수정할 회원 정보 입력");
        System.out.println("당신의 아이디 입력 >> ");
        String id = sc.nextLine();
        System.out.println("변경할 주소 입력 >> ");
        String addr = sc.nextLine();

        // members 배열에서 일치하는 아이디 찾은 후, 주소 변경
        // 수정된 member 리턴
        for (Member member:members) { // for-each : member 라는 변수에 Member[] 배열 하나씩 꺼내옴
            if (member != null) {
                if (member.getId().equals(id)) {
                    member.setAddr(addr);
                    System.out.println("주소 수정이 완료되었습니다. ");

                    return member;
                }
            }
        }
        return null;
        
    }

    public void removeMember(Scanner sc, Member[] members){
        // 삭제할 회원 아이디 입력
        System.out.println();
        System.out.println("수정할 회원 정보 입력");
        System.out.println("삭제 할 아이디 입력 >> ");
        String id = sc.nextLine();

        for (int i = 0; i < members.length; i++) {
            if (members[i] != null) {
                if (members[i].getId().equals(id)) {
                    members[i] = null;
                    System.out.println("회원 삭제가 완료되었습니다");
                    return;
                }
                System.out.println("회원정보가 일치하지 않습니다");
            }
        }
    }

    
    
    
    
    
    
    
}
