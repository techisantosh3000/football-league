package com.santosh.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santosh.dto.TeamStandingDto;
import com.santosh.log.annotation.Trace;
import com.santosh.log.eventtype.LogEventType;
import com.santosh.model.TeamStandingRequest;
import com.santosh.service.TeamStandingService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController {
	private static final Logger log = LoggerFactory.getLogger(FootBallStandingController.class);
	private final TeamStandingService teamStandingService;

	  @Autowired
	  public FootBallStandingController(
	      TeamStandingService teamStandingService) {
	    this.teamStandingService = teamStandingService;
	  }

	  @GetMapping
	  @Trace(type = LogEventType.CONTROLLER)
	  public ResponseEntity<TeamStandingDto> getStandings(@Valid TeamStandingRequest teamStandingRequest) {
	    log.info("Request {}", teamStandingRequest.toString());
	    return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
	  }

}
