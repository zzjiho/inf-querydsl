package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //빈 생성자 역할
public class MemberDto {

    private String username;
    private int age;

    /**
     * QueryProjection 장점 : Querydsl을 깔끔하게 쓸 수 있다.
     *
     * QueryProjection 단점 : @QueryProjection을 함으로써 아키텍처적인 문제가 발생한다.
     * Dto는 Querydsl에 대한 import,라이브러리에 대한 의존성이 없었는데 DTO자체가 Querydsl의 의존성을 가지게 된다.
     * DTO는 service,repository 등등 다 돌아다니는데. 그 안에 Querydsl에 의존성을 가지게 되어 순수하지 않게 된다.
     */
    @QueryProjection //dto도 Q파일로 생성
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
