package com.mancity.calc.highlight.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateHighlightRequestDto {

    private Long gameId;

    private double time;
}
