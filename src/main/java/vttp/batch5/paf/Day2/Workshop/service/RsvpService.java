package vttp.batch5.paf.Day2.Workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.batch5.paf.Day2.Workshop.models.Rsvp;
import vttp.batch5.paf.Day2.Workshop.repository.RsvpRepository;

@Service
public class RsvpService {

    @Autowired
    private RsvpRepository rsvpRepo;

    public List<Rsvp> getAllRsvp() {
        List<Rsvp> results = rsvpRepo.getAllRsvp();
        return results;
    }

}
