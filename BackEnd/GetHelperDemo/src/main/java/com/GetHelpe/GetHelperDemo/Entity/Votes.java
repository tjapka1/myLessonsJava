package com.GetHelpe.GetHelperDemo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@AllArgsConstructor
@Getter
public enum Votes {
    STERN1(1),
    STERN2(2),
    STERN3(3),
    STERN4(4),
    STERN5(5);

    private final Integer votesId;

    public static Votes findByVotesId(Integer votesId){
        if (votesId == null){return null;}
        return Arrays.stream(Votes.values())
                .filter(v->v.getVotesId().equals(votesId))
                .findFirst()
                .orElse(null);
    }
}
