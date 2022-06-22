package myCloset.restfullApi.dto.member;


import myCloset.restfullApi.entity.member.Member;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {
    private Long id;
    private String email;
    private String username;
    private String nickname;

    public static MemberDto toDto(Member member) {
        return new MemberDto(member.getId(), member.getEmail(), member.getUserId(), member.getNickname());
    }

    public static MemberDto empty() {
        return new MemberDto(null, "", "", "");
    }
}
