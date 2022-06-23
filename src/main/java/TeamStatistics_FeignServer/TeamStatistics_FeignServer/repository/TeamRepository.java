package  TeamStatistics_FeignServer.TeamStatistics_FeignServer.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import TeamStatistics_FeignServer.TeamStatistics_FeignServer.model.Team_Performance;
@Repository
public interface TeamRepository extends JpaRepository<Team_Performance, String> {
}
