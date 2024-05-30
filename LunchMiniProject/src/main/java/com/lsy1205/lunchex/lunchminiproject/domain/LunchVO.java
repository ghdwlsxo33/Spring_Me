package com.lsy1205.lunchex.lunchminiproject.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LunchVO {
  private Long mno;
  private String lunchTitle;
  private LocalDate dueDate;
  private boolean finished;
  private String writer;
}







