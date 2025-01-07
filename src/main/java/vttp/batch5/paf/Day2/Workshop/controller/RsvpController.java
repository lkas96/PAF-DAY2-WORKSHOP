package vttp.batch5.paf.Day2.Workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import vttp.batch5.paf.Day2.Workshop.models.Rsvp;
import vttp.batch5.paf.Day2.Workshop.service.RsvpService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RsvpController {
    @Autowired
    private RsvpService rsvpSvc;
    
    @GetMapping("/rsvps")
    public List<Rsvp> getAllRsvp() {
        List<Rsvp> results = rsvpSvc.getAllRsvp();
        return results;
    }
    
}
