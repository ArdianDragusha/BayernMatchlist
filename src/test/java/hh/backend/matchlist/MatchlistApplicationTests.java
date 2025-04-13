package hh.backend.matchlist;

import hh.backend.matchlist.domain.Match;
import hh.backend.matchlist.domain.MatchRepository;
import hh.backend.matchlist.domain.Competition;
import hh.backend.matchlist.domain.CompetitionRepository;
import hh.backend.matchlist.domain.User;
import hh.backend.matchlist.domain.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MatchlistApplicationTests {

	@Autowired
	private MatchRepository matchRepository;

	@Autowired
	private CompetitionRepository competitionRepository;

	@Autowired
	private UserRepository userRepository;

	@Test
	void contextLoads() {
		assertThat(matchRepository).isNotNull();
		assertThat(competitionRepository).isNotNull();
		assertThat(userRepository).isNotNull();
	}
}
