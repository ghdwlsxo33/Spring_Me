package com.lsy1205.lunchex.lunchminiproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LunchDTO {
  @NotNull
  private Long mno;
  @NotEmpty
  private String lunchTitle;
  @Future
  private LocalDate dueDate;
  private boolean finished;
  @NotEmpty
  private String writer;


}







