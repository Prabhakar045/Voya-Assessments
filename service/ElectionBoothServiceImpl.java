package com.voya.assignments.VoterApp.service;

import com.voya.assignments.VoterApp.exception.InvalidVoterIdException;
import com.voya.assignments.VoterApp.exception.LocalityNotFoundException;
import com.voya.assignments.VoterApp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService{


    @Override
    public boolean checkEligibility(int age, String locality, int voterId) throws UnderAgeException, InvalidVoterIdException, LocalityNotFoundException {

        checkAge(age);
        checkLocality(locality);
        checkVoiterId(voterId);
        return false;
    }

    public  void checkAge(int age) throws UnderAgeException {
        if (age<18){
            throw new UnderAgeException("Age should be greater than 18");
        }
    }

    public void checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"Rajajinagara","Laggere","Devanahalli", "Yalahanka", "JP nagara","Whitefiels"};
        boolean found = false;
        for(String location : localities){
            if (location.equals(locality)){
                found=true;
                System.out.println(location);
                break;
            }
        }
        if (!found){
            throw new LocalityNotFoundException("Locality not found");
        }
    }


    public  void checkVoiterId(int voterId) throws InvalidVoterIdException {
        if (voterId <=0){
            throw new InvalidVoterIdException("Voter id not found");
        }
    }
}
