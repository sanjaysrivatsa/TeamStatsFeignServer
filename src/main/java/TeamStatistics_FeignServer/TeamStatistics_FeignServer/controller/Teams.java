package TeamStatistics_FeignServer.TeamStatistics_FeignServer.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import TeamStatistics_FeignServer.TeamStatistics_FeignServer.model.Team_Performance;
import TeamStatistics_FeignServer.TeamStatistics_FeignServer.repository.TeamRepository;

//We are allowing another website/application(ReactJS) to access this site.
//For security reaons. No other websites can access this site.
@CrossOrigin(origins="http://localhost:3001")
//Controller class
@RestController
//Web bontext for the spring boot application
@RequestMapping("/IPL2022")
public class Teams {

	@Autowired
	TeamRepository  teamrep;
	
	public Teams()
	{
	}
	
	//Read
	@GetMapping("/team_performance")
	public List<Team_Performance> getTeams(){
		System.out.println("Retried the team stats.....");
			return teamrep.findAll();
	}
	
	@GetMapping("/venues")
	public String getVenues() {
		//......Code for retrieving venues
		return  "<b>Wankhede</b><b>Chinnaswamy</b><b>FerozeShahKotla</b><b>EdenGardens</b>";
	}
}