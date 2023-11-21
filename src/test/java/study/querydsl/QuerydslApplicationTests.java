package study.querydsl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
class QuerydslApplicationTests {

	@Autowired
//	@PersistenceContext 똑같이 동작됨.
	EntityManager em;

	@Test
	void contextLoads() {

	}

}
