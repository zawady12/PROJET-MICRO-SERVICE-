package com.uahb.m1info.common.service.event;

import com.uahb.m1info.common.service.dto.AgeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

@NoArgsConstructor
@Data
public class AgeEvent implements Event {

    private Long eventId = new Random().nextLong();
    private Date eventDate = new Date();
    private AgeDTO ageDTO;
    private AgeStatus ageStatus;

    public AgeEvent(AgeDTO ageDTO, AgeStatus ageStatus) {
        this.ageDTO = ageDTO;
        this.ageStatus = ageStatus;
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
