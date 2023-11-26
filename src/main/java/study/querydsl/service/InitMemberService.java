package study.querydsl.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import study.querydsl.entity.Member;
import study.querydsl.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class InitMemberService {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void init() {
        Team teamA = new Team("teamA");
        Team teamB = new Team("teamB");
        em.persist(teamA);
        em.persist(teamB);

        for (int i = 0; i < 100; i++) {
            Team selectedTeam = i%2==0 ? teamA : teamB;
            em.persist(new Member("member" + i, i, selectedTeam));
        }
    }

}
