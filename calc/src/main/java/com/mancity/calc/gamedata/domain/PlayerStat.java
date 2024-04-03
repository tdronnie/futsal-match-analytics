package com.mancity.calc.gamedata.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerStat {

    private String nickname;

    private int speed;

    private int distanceCovered;

    private int pass;

    private int shotsOnTarget;

    private int shot;

    private int goal;

    private int assist;

    private int turnOverInOffense;

    private int turnOverInDefense;

}
