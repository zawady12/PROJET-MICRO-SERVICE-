package com.uahb.m1info.common.service.event;

import com.uahb.m1info.common.service.dto.PersonneDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@NoArgsConstructor
@Data
public class PersonneEvent implements Event {

    private Long eventId = new Random().nextLong();
    private Date eventDate = new Date();
    private PersonneDTO personneDTO;
    private PersonneStatus personneStatus;

    public PersonneEvent(PersonneDTO personneDTO, PersonneStatus personneStatus) {
        this.personneDTO = personneDTO;
        this.personneStatus = personneStatus;
    }

    @Override
    public Long getEventId() {
        return eventId;
    }

    @Override
    public Date getEventDate() {
        return eventDate;
    }
}
