package vttp.batch5.paf.Day2.Workshop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp.batch5.paf.Day2.Workshop.models.Rsvp;

import static vttp.batch5.paf.Day2.Workshop.repository.Queries.*;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RsvpRepository {
    @Autowired
    private JdbcTemplate template;

    public List<Rsvp> getAllRsvp(){
        SqlRowSet rs = template.queryForRowSet(SQL_SELECT_ALL_RSVP);

        List<Rsvp> list = new ArrayList<>();
        
        while(rs.next()){
            //instantiate and add to list
            //loop multiple rows till end

            Rsvp r = new Rsvp();

            r.setEmail(rs.getString("email"));
            r.setPhone(rs.getInt("phone"));
            r.setConfirmDate(rs.getDate("confirmation_date"));
            r.setComments(rs.getString("comments"));

            list.add(r);
        }

        return list;
    }
}
