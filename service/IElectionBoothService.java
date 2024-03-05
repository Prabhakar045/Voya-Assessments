package com.voya.assignments.VoterApp.service;

import com.voya.assignments.VoterApp.exception.InvalidVoterIdException;
import com.voya.assignments.VoterApp.exception.LocalityNotFoundException;
import com.voya.assignments.VoterApp.exception.UnderAgeException;

public interface IElectionBoothService {

    boolean checkEligibility(int age, String locality, int voterId) throws UnderAgeException, InvalidVoterIdException, LocalityNotFoundException;
}
