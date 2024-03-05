package com.voya.assignments.VoterApp.client;

import com.voya.assignments.VoterApp.exception.InvalidVoterIdException;
import com.voya.assignments.VoterApp.exception.LocalityNotFoundException;
import com.voya.assignments.VoterApp.exception.UnderAgeException;
import com.voya.assignments.VoterApp.service.ElectionBoothServiceImpl;
import com.voya.assignments.VoterApp.service.IElectionBoothService;

import java.util.Scanner;

public class Voter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IElectionBoothService election = new ElectionBoothServiceImpl();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter locality: ");
        String locatity = sc.nextLine();

        System.out.print("Enter voter id: ");
        int voterId = sc.nextInt();

        try {
            election.checkEligibility(age,locatity,voterId);
            System.out.println("You are eligible to vote.....");
        } catch (UnderAgeException | InvalidVoterIdException | LocalityNotFoundException e) {
            System.out.println("not eligible");
        }
    }
}
