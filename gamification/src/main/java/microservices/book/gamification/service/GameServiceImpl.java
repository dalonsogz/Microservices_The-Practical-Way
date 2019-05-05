package microservices.book.gamification.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import microservices.book.gamification.domain.GameStats;

/**
 * @author moises.macero
 */
@Service
@Slf4j
class GameServiceImpl implements GameService {@Override
	public GameStats newAttemptForUser(Long userId, Long attemptId, boolean correct) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameStats retrieveStatsForUser(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}



}
