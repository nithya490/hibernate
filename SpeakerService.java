package com.xworkz.speaker.service;


	import com.xworkz.speaker.dto.SpeakerDTO;

	public interface SpeakerService {
		
		boolean validateAndSave(SpeakerDTO dto);

	}


