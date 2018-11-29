package com.nhlFantasy.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hockeyPlayerStatsArchive")
public class HockeyPlayerStatsArchive {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int hockeyPlayerStatsArchiveId;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "playerId")
	HockeyPlayer hockeyPlayer;
	
	@Column(name = "date")
	Date date;
	
	@Column(name = "points")
	int points;
	
	@Column(name="pointSummary")
	String pointSummary;
	
}