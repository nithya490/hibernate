package com.xworkz.speaker.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="speaker_table")
public class SpeakerDTO implements Serializable {
	@Column(name="SPEAKER_ID")
	@Id
	private int speakerid;
	
	@Column(name="BRAND")
    private String brand;
	
	@Column(name="COST")
	private double cost;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="SIZE")
	private String size;
	
	@Column(name="WARRANTY")
	private boolean warrwnty;

}
